package org.firstinspires.ftc.teamcode.opmodes.auto

import com.qualcomm.robotcore.eventloop.opmode.Autonomous
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import org.firstinspires.ftc.teamcode.hardware.Robot

/**
 * Standard Autonomous template.
 * Demonstrates basic movement and subsystem sequencing.
 */
@Autonomous(name = "Sample Auto", group = "Demo")
class SampleAuto : LinearOpMode() {
    override fun runOpMode() {
        val robot = Robot(hardwareMap)

        telemetry.addData("Status", "Auto Initialized")
        telemetry.update()

        waitForStart()

        // 1. Move forward at 50% power for 1 second
        robot.driveTrain.drive(0.5, 0.0, 0.0)
        sleep(1000)
        robot.driveTrain.stop()

        // 2. Run intake for 500ms
        robot.intake.suckIn()
        sleep(500)
        robot.intake.stop()

        // 3. Strafe right at 40% power for 500ms
        robot.driveTrain.drive(0.0, 0.4, 0.0)
        sleep(500)
        robot.driveTrain.stop()

        telemetry.addData("Status", "Auto Complete")
        telemetry.update()
    }
}