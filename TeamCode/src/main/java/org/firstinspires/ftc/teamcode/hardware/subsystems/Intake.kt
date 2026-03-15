package org.firstinspires.ftc.teamcode.hardware.subsystems

import com.qualcomm.robotcore.hardware.DcMotorEx
import com.qualcomm.robotcore.hardware.HardwareMap
import org.firstinspires.ftc.teamcode.util.Constants
import org.firstinspires.ftc.teamcode.util.runWithoutEncoder

/**
 * An example Intake subsystem.
 */
class Intake(hardwareMap: HardwareMap) {
    private val intakeMotor: DcMotorEx = hardwareMap.get(DcMotorEx::class.java, "intake")

    init {
        intakeMotor.runWithoutEncoder()
    }

    /**
     * Turns on the intake to ingest game elements.
     */
    fun suckIn() {
        intakeMotor.power = Constants.INTAKE_POWER
    }

    /**
     * Reverses the intake to spit out game elements.
     */
    fun spitOut() {
        intakeMotor.power = Constants.OUTTAKE_POWER
    }

    /**
     * Halts the intake motor.
     */
    fun stop() {
        intakeMotor.power = 0.0
    }
}