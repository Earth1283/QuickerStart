TeamCode Module
===============

Welcome to the **TeamCode** module!

This is where you will write or paste the code for your team's robot controller App. While this module starts as a clean slate, adding OpModes is straightforward, whether you prefer **Java** or **Kotlin**.

Creating your own OpModes
=========================

The easiest way to create your own OpMode is to copy a Sample OpMode and customize it.

.. hint::
   Sample opmodes are located in the ``FtcRobotController`` module under:
   ``FtcRobotController/java/org.firstinspires.ftc.robotcontroller/external/samples``

Naming of Samples
-----------------

To understand how samples are organized, refer to the naming conventions in the ``sample_conventions.rst`` file.

Summary of Prefixes:
    Basic
        Minimally functional skeleton.
    Sensor
        Shows how to use a specific sensor.
    Robot
        Assumes a simple two-motor drive base.
    Concept
        Illustrates a specific function or concept.

Using Kotlin
------------

The FTC SDK fully supports **Kotlin**. To create a Kotlin OpMode:

1. Right-click on the ``org.firstinspires.ftc.teamcode`` package.
2. Select **New > Kotlin Class/File**.
3. You can also convert existing Java samples to Kotlin using Android Studio's built-in converter (**Code > Convert Java File to Kotlin File**).

.. important::
   When using Kotlin, ensure your classes are properly annotated with ``@TeleOp`` or ``@Autonomous`` so they appear on the Driver Station.

Copying Samples in Android Studio
---------------------------------

1. Locate the desired sample in the Project tree.
2. Right-click and select **Copy**.
3. Expand ``TeamCode/java`` or ``TeamCode/kotlin``.
4. Right-click on your team package and select **Paste**.
5. Choose a meaningful name (e.g., ``MyFirstOpMode``).

Enabling your OpMode
--------------------

Each sample begins with configuration annotations:

.. code-block:: kotlin

    @TeleOp(name="My Robot: Drive", group="Iterative Opmode")
    @Disabled
    class MyDriveOpMode : OpMode() { ... }

* **name:** What appears on the Driver Station list.
* **@Disabled:** Remove this line to make the OpMode visible on the Driver Station.

ADVANCED: Cloning the TeamCode Module
=====================================

If you have multiple teams and want them to share a common code organization while maintaining their own code:

1. Copy the "TeamCode" folder to a sibling folder (e.g., "Team0417").
2. Delete ``TeamCode.iml`` in the new folder.
3. Rename the source package folder to match.
4. Update ``AndroidManifest.xml`` with the new package name.
5. Add ``include ':Team0417'`` to ``settings.gradle``.

.. warning::
   Cloning modules is an advanced task. Make a full project backup before starting!
