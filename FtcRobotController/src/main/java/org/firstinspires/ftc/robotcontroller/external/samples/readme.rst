==============================
Samples README
==============================

.. warning::
   **Caution:** No team-specific code should be placed or modified in this ``.../samples`` folder.

Samples should be **copied** from here and **pasted** into your team's code folder in Android Studio:
``TeamCode/src/main/java/org/firstinspires/ftc/teamcode``

This process automatically ensures class names remain consistent. Once copied, you can modify the sample to suit your team's needs.

For detailed instructions, refer to the `TeamCode readme <../../../../../../../../../../TeamCode/src/main/java/org/firstinspires/ftc/teamcode/readme.rst>`_.

Naming of Samples
=================

To understand how the samples are organized, refer to the naming conventions in the ``sample_conventions.rst`` file in this folder.

The class names follow a prefix-based convention indicating their purpose:

Basic
    A minimally functional OpMode showing the bare-bones structure.
Sensor
    Shows the minimal code required to read and display specific sensor values.
Robot
    Assumes a simple two-motor drive base, used for navigation or sensor-driven driving samples.
Concept
    Illustrates a specific programming concept or complex function. Details are usually provided in the code comments.
Utility
    A useful tool for specific development tasks, not intended for competition code.

Naming Patterns
---------------

* **Sensor classes:** ``Sensor <Company> <Type>``
* **Robot classes:** ``Robot <Mode> <Action> <OpModeType>``
* **Concept classes:** ``Concept <Topic> <OpModeType>``
