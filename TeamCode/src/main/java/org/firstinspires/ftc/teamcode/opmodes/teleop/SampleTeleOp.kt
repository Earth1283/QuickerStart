package org.firstinspires.ftc.teamcode.opmodes.teleop

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import org.firstinspires.ftc.teamcode.hardware.Robot

/**
 * Standard TeleOp for driving the robot and controlling the intake.
 * Demonstrates the Subsystem / Robot Wrapper pattern.
 */
@TeleOp(name = "Sample TeleOp", group = "Demo")
class SampleTeleOp : LinearOpMode() {
    override fun runOpMode() {
        // Initialize the robot wrapper
        val robot = Robot(hardwareMap)

        telemetry.addData("Status", "Initialized")
        telemetry.update()

        waitForStart()

        while (opModeIsActive()) {
            // Drivetrain control: Left stick for movement, Right stick for rotation
            robot.driveTrain.drive(
                y = -gamepad1.left_stick_y.toDouble(),
                x = gamepad1.left_stick_x.toDouble(),
                rx = gamepad1.right_stick_x.toDouble()
            )

            // Intake control: 'A' for intake, 'B' for outtake, otherwise stop
            when {
                gamepad1.a -> robot.intake.suckIn()
                gamepad1.b -> robot.intake.spitOut()
                else -> robot.intake.stop()
            }

            // Feedback
            telemetry.addData("Drive", "y:%.2f, x:%.2f, rx:%.2f", -gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x)
            telemetry.update()
        }
    }
}