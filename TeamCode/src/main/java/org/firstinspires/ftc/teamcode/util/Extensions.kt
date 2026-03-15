package org.firstinspires.ftc.teamcode.util

import com.qualcomm.robotcore.hardware.DcMotor

/**
 * Quality-of-life extension functions for common FTC hardware operations.
 */

fun DcMotor.runWithoutEncoder() {
    this.mode = DcMotor.RunMode.RUN_WITHOUT_ENCODER
}

fun DcMotor.runUsingEncoder() {
    this.mode = DcMotor.RunMode.RUN_USING_ENCODER
}

fun DcMotor.stopAndResetEncoder() {
    this.mode = DcMotor.RunMode.STOP_AND_RESET_ENCODER
}

fun DcMotor.setBrakeMode() {
    this.zeroPowerBehavior = DcMotor.ZeroPowerBehavior.BRAKE
}

fun DcMotor.setCoastMode() {
    this.zeroPowerBehavior = DcMotor.ZeroPowerBehavior.FLOAT
}