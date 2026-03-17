==============================
Sample Class/OpMode Conventions
==============================

.. section-numbering::

*Version 1.2.0 (2025)*

This document defines the conventions for FTC Sample OpModes and classes.

OpMode Naming
=============

To ensure samples are easy to locate and understand, the following prefix system is used:

Basic
    A minimally functional OpMode showing the basic skeleton or structure.
Sensor
    Demonstrates how to interact with a specific sensor (minimal code).
Robot
    Assumes a simple two-motor (differential) drive base for navigation samples.
Concept
    Illustrates a specific programming concept or function (e.g., state machines).
Utility
    A tool intended for development tasks, not meant for production robot code.

After the prefix, the following patterns apply:

* **Sensor classes:** ``Sensor <Company> <Type>``
* **Robot classes:** ``Robot <Mode> <Action> <OpModeType>``
* **Concept classes:** ``Concept <Topic> <OpModeType>``

Coding Style
============

Samples follow the standard style guides for their respective languages:

* **Java:** `Google Java Style Guide <https://google.github.io/styleguide/javaguide.html>`_
* **Kotlin:** `Kotlin Style Guide <https://kotlinlang.org/docs/coding-conventions.html>`_

.. note::
   Keep "Sensor" and "Hardware" samples as simple as possible. Complex logic should be reserved for "Concept" samples. Strive for "one concept per sample."

Device Configuration Names
==========================

The following names are used in external samples to maintain consistency:

Motors
    ``left_drive``, ``right_drive``, ``left_arm``
Servos
    ``left_hand``, ``right_hand``, ``arm``, ``claw``
Sensors
    ``sensor_color``, ``sensor_ir``, ``sensor_touch``, ``sensor_color_distance``, ``sensor_digital``
Localization
    ``compass``, ``gyro``, ``imu``, ``navx``

Device Object Naming (Variables)
================================

Variable names should match the configuration names but use standard camelCase.

* **Example:** ``left_drive`` (config) -> ``leftDrive`` (variable)
* **Example:** ``rear_light_sensor`` (config) -> ``rearLightSensor`` (variable)

Comments and Documentation
==========================

Comments should explain **what** and **why** the code is doing something, rather than providing directives (like "insert code here").

.. hint::
   For Kotlin samples, utilize idiomatic features like extension functions or properties where they improve clarity without overcomplicating the example for beginners.
