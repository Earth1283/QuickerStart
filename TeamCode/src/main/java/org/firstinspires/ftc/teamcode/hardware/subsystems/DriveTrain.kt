package org.firstinspires.ftc.teamcode.hardware.subsystems

import com.qualcomm.robotcore.hardware.DcMotorEx
import com.qualcomm.robotcore.hardware.HardwareMap
import org.firstinspires.ftc.teamcode.util.setBrakeMode
import org.firstinspires.ftc.teamcode.util.runWithoutEncoder
import kotlin.math.abs
import kotlin.math.max

/**
 * A standard 4-motor Mecanum Drivetrain subsystem.
 */
class DriveTrain(hardwareMap: HardwareMap) {
    private val frontLeft: DcMotorEx = hardwareMap.get(DcMotorEx::class.java, "frontLeft")
    private val frontRight: DcMotorEx = hardwareMap.get(DcMotorEx::class.java, "frontRight")
    private val backLeft: DcMotorEx = hardwareMap.get(DcMotorEx::class.java, "backLeft")
    private val backRight: DcMotorEx = hardwareMap.get(DcMotorEx::class.java, "backRight")

    init {
        // Reverse right side motors assuming standard gearing
        frontRight.direction = com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE
        backRight.direction = com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE

        val motors = listOf(frontLeft, frontRight, backLeft, backRight)
        for (motor in motors) {
            motor.setBrakeMode()
            motor.runWithoutEncoder()
        }
    }

    /**
     * Drives the robot using mecanum kinematics.
     * @param y Forward/backward (positive = forward)
     * @param x Strafe left/right (positive = right)
     * @param rx Rotation (positive = clockwise)
     */
    fun drive(y: Double, x: Double, rx: Double) {
        val denominator = max(abs(y) + abs(x) + abs(rx), 1.0)
        
        val flPower = (y + x + rx) / denominator
        val blPower = (y - x + rx) / denominator
        val frPower = (y - x - rx) / denominator
        val brPower = (y + x - rx) / denominator

        frontLeft.power = flPower
        backLeft.power = blPower
        frontRight.power = frPower
        backRight.power = brPower
    }

    /**
     * Halts all drive motors.
     */
    fun stop() {
        drive(0.0, 0.0, 0.0)
    }
}