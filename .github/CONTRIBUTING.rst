===========================
Contributing to the FTC SDK
===========================

The following is a set of guidelines for contributing to the FIRST FTC SDK. The FTC Technology Team welcomes suggestions for improvements to core software, ideas for new features, requests for built-in support of new sensors, and well-written bug reports.

How can I contribute?
=====================

Pull requests
-------------

**STOP!** If you are new to git, do not understand the mechanics of forks, branches, and pulls, or if what you just read is confusing, **do not** push this button. Most likely it won't do what you think it will.

.. image:: ../doc/media/PullRequest.PNG
   :alt: Pull Button

If you are looking at this button then you've pushed some changes to your team's fork of ``ftctechnh/ftc_app``. Congratulations! You are almost certainly finished.

The vast majority of pull requests seen on the ``ftctechnh/ftc_app`` repository are not intended to be merged into the official SDK. Team software is just that—your team's. It's specific to the tasks you are trying to accomplish, the testing you are doing, and goals your team has. You don't want that pushed into the official SDK.

If what you've read so far makes little sense, there are some very good git learning resources online:

* `Git Book <https://git-scm.com/book/en/v2>`_
* `Interactive Git Tutorial <https://try.github.io>`_

Guidelines for experienced GIT users
------------------------------------

If you are absolutely certain that you want to push the big green button above, read on. Otherwise, back *slowly away from the keyboard*.

The real intent for advanced users is often to issue a pull request from a topic branch on a local fork back to ``master`` on either the same local fork or a child of the team fork, and not on the parent ``ftctechnh/ftc_app``. See `Creating a Pull Request <https://help.github.com/articles/creating-a-pull-request-from-a-fork/>`_.

If that is indeed the intent, then you can merge your topic branch into master locally by hand before pushing it up to GitHub, or if you want a pull request for pulls between branches on the same repository, you can select the base fork from the dropdown on the "Open a pull request" page and select your team repo instead of ``ftctechnh``'s.

Alternatively, if you have a team repository forked from ``ftctechnh/ftc_app``, and then team members individually fork from your team repository, then pull requests from the individual team member's forks will have the main team repository automatically selected as the base fork for the pull.

Pull requests that do not fall into the categories above are evaluated by the FTC Technology Team on a case-by-case basis. Please note however that the deployment model of the SDK does not support direct pulls into ``ftctechnh/ftc_app``.

Report bugs
-----------

This section guides you through filing a bug report. The better the report, the more likely it is to be root-caused and fixed.

Before submitting a bug report
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

- Check the `forums <http://ftcforum.firstinspires.org/forum.php>`_ to see if someone else has run into the problem.
- Perform a search of current `issues <https://github.com/FIRST-Tech-Challenge/FtcRobotController/issues>`_ to see if the problem has already been reported.

How Do I Submit A (Good) Bug Report?
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Bugs are tracked as GitHub issues. Create an issue on ``ftctechnh/ftc_app`` and provide the following information:

- Use a clear and descriptive title.
- Describe the exact steps which reproduce the problem.
- Provide specific examples to demonstrate the steps.
- Describe the behavior you observed and explain what you expected instead.
- If the RobotController crashed, include the logfile with a stack trace. `Example of good bug report with stack trace <https://github.com/ftctechnh/ftc_app/issues/224>`_

Suggesting Enhancements
-----------------------

FIRST volunteers are awesome. You all have great ideas and we want to hear them.

Enhancements should be broadly applicable to a large majority of teams, should not force teams to change their workflow, and should provide real value to the mission of FIRST.

The best way to get momentum behind new features is to post a description of your idea in the **discussions** section of this repository. Build community support for it. The FTC Technology Team monitors the discussions.
