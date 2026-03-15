package org.firstinspires.ftc.teamcode.telemetry

import fi.iki.elonen.NanoHTTPD
import org.json.JSONObject

/**
 * A simple web server that runs on the Robot Controller to serve
 * an HTML dashboard and a JSON API for telemetry streaming.
 */
class WebServer(port: Int) : NanoHTTPD(port) {
    private val telemetryData = JSONObject()

    /**
     * Updates a key-value pair in the telemetry JSON object.
     */
    fun updateTelemetry(key: String, value: Any) {
        telemetryData.put(key, value)
    }

    override fun serve(session: IHTTPSession): Response {
        val uri = session.uri

        // Serve telemetry JSON data API endpoint
        if (uri == "/api/telemetry") {
            return newFixedLengthResponse(
                Response.Status.OK,
                "application/json",
                telemetryData.toString()
            )
        }

        // Serve simple HTML dashboard frontend
        if (uri == "/" || uri == "/index.html") {
            val html = """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>FTC Web Telemetry</title>
                    <style>
                        body { font-family: Arial, sans-serif; background-color: #282c34; color: white; padding: 20px; }
                        #data { background-color: #1e2227; padding: 20px; border-radius: 8px; font-family: monospace; white-space: pre-wrap; font-size: 16px; }
                        h1 { color: #61dafb; }
                    </style>
                    <script>
                        async function fetchTelemetry() {
                            try {
                                const response = await fetch('/api/telemetry');
                                const data = await response.json();
                                document.getElementById('data').innerText = JSON.stringify(data, null, 2);
                            } catch (e) {
                                console.error('Failed to fetch telemetry', e);
                            }
                        }
                        setInterval(fetchTelemetry, 100); // Poll every 100ms
                    </script>
                </head>
                <body>
                    <h1>Robot Dashboard</h1>
                    <div id="data">Waiting for data...</div>
                </body>
                </html>
            """.trimIndent()
            return newFixedLengthResponse(Response.Status.OK, "text/html", html)
        }

        return newFixedLengthResponse(Response.Status.NOT_FOUND, NanoHTTPD.MIME_PLAINTEXT, "Not Found")
    }
}