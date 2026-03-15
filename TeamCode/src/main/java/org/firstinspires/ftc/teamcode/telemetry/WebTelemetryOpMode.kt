package org.firstinspires.ftc.teamcode.telemetry

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp

/**
 * An example OpMode that starts the WebServer on port 8080 and streams live data.
 */
@TeleOp(name = "Web Telemetry Server", group = "Testing")
class WebTelemetryOpMode : LinearOpMode() {
    override fun runOpMode() {
        val server = WebServer(8080)
        try {
            server.start(fi.iki.elonen.NanoHTTPD.SOCKET_READ_TIMEOUT, false)
            telemetry.addData("Status", "Web server started on port 8080")
            telemetry.addData("Instructions", "Connect to Robot Wi-Fi Direct, then go to http://192.168.43.1:8080")
            telemetry.update()
        } catch (e: Exception) {
            telemetry.addData("Error", "Could not start server: ${e.message}")
            telemetry.update()
            return
        }

        waitForStart()

        var loopCount = 0
        while (opModeIsActive()) {
            loopCount++
            
            // Push data to web server
            server.updateTelemetry("loopCount", loopCount)
            server.updateTelemetry("gamepad1.left_stick_y", gamepad1.left_stick_y)
            server.updateTelemetry("gamepad1.right_stick_x", gamepad1.right_stick_x)
            server.updateTelemetry("gamepad1.a", gamepad1.a)
            
            // Show data on regular driver station telemetry
            telemetry.addData("Loop Count", loopCount)
            telemetry.update()

            sleep(50)
        }

        server.stop()
    }
}