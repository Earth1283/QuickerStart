package org.firstinspires.ftc.teamcode.hardware

import com.qualcomm.robotcore.hardware.HardwareMap
import org.firstinspires.ftc.teamcode.hardware.subsystems.DriveTrain
import org.firstinspires.ftc.teamcode.hardware.subsystems.Intake

/**
 * Main wrapper class for the robot's hardware.
 * Initializes and coordinates all subsystems.
 */
class Robot(hardwareMap: HardwareMap) {
    val driveTrain: DriveTrain = DriveTrain(hardwareMap)
    val intake: Intake = Intake(hardwareMap)

    // Add other subsystems like Intakes, extensions, etc...
}