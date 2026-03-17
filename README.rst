===========================
Public FTC SDK for DECODE
===========================

.. contents:: Table of Contents
   :depth: 2

.. important::

   This repository contains the public FTC SDK for the DECODE (2025-2026) competition season.

Welcome!
========

This GitHub repository contains the source code used to build an Android app to control a *FIRST* Tech Challenge competition robot. To use this SDK, download or clone the entire project to your local computer.

Requirements
============

.. note::

   To use this Android Studio project, you will need **Android Studio Ladybug (2024.2)** or later.

To program your robot in Blocks or OnBot Java, you do not need Android Studio.

Getting Started
===============

If you are new to robotics or the *FIRST* Tech Challenge, consider reviewing the `FTC Blocks Tutorial <https://ftc-docs.firstinspires.org/programming_resources/blocks/Blocks-Tutorial.html>`_ to get familiar with the control system.

Even if you are an advanced Java or **Kotlin** programmer, it is helpful to start with the Blocks tutorial and then migrate to the `OnBot Java Tool <https://ftc-docs.firstinspires.org/programming_resources/onbot_java/OnBot-Java-Tutorial.html>`_ or `Android Studio <https://ftc-docs.firstinspires.org/programming_resources/android_studio_java/Android-Studio-Tutorial.html>`_ afterwards.

Downloading the Project
=======================

If you are an Android Studio programmer, there are several ways to download this repo.

.. note::
   If you use the Blocks or OnBot Java Tool, you do not need to download this repository.

* **Git Users:** Clone the most current version of the repository:

  .. code-block:: bash

     git clone https://github.com/FIRST-Tech-Challenge/FtcRobotController.git

* **Direct Download:** Use the "Download Zip" button on the main repository page or download from the `Releases <https://github.com/FIRST-Tech-Challenge/FtcRobotController/releases>`_ page.

Once downloaded and uncompressed, use Android Studio to import the folder ("Import project").

Getting Help
============

User Documentation and Tutorials
--------------------------------

*FIRST* maintains online documentation with information and tutorials.

.. important::
   The online documentation is an "evergreen" document that is constantly being updated.

`FIRST Tech Challenge Documentation <https://ftc-docs.firstinspires.org/index.html>`_

Javadoc Reference Material
--------------------------

The Javadoc reference documentation for the FTC SDK is available online:
`FTC Javadoc Documentation <https://javadoc.io/doc/org.firstinspires.ftc>`_

Online User Forum
-----------------

For technical questions, visit the `FIRST Tech Challenge Community <https://ftc-community.firstinspires.org/>`_.

Sample OpModes
--------------

This project contains a large selection of Sample OpModes (robot code examples) in Java and Kotlin which can be used as-is or modified.

* **Samples Folder:** `FtcRobotController/src/main/java/org/firstinspires/ftc/robotcontroller/external/samples <FtcRobotController/src/main/java/org/firstinspires/ftc/robotcontroller/external/samples>`_
* **Instructions:** See the `readme.rst` in the `TeamCode` folder for instructions on how to copy them to your own project space.

Release Information
===================

Version 11.1.0
--------------
* Updated dependencies to latest stable versions.
* Converted all documentation to reStructuredText (RST) format.

Version 11.0 (20250827-105138)
------------------------------

Enhancements
^^^^^^^^^^^^

* **OnBotJava Projects:** OnBotJava now supports projects, allowing you to group related files.
* **New Hardware Support:** Adds support for AndyMark ToF, IMU, and Color sensors.
* **Driver Station Improvements:**
    * WiFi status indicator.
    * Enhanced play button visualization based on connection and timer state.
* **Color Processing:** New DECODE colors (``ARTIFACT_GREEN``, ``ARTIFACT_PURPLE``) and vision processing shapes.
* **AprilTag Library:** Updated for the DECODE game season.
* **OctoQuad Driver:** Updated to support firmware v3.x.

Historical release information can be found in the `Changelog <CHANGELOG.rst>`_.
