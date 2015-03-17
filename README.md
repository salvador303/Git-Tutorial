Git Tutorial
============

Version: CS4260 (2015)

Git Help
========
```sh
man git <command>
```
Branches
========
All branches can be see with the following command.  ``` git branch -a ```
The output will appear as:
```
<branch 1>
<branch 2>
remote/<branch 1>
```

Local
-----
Will have just a name and appear as
```
<branch name>
```

Remote
------
Are indicated by the leading word, "remote", and appear as follows.
```
remote/<branch name>
```

Updating Remote Branches
=========================
This command will only update your remote branches. Local branches are not
touched. The "-a" is all, and the -p is prune. Prune means to remove remote
banches that no longer exsist in the remote repository.
```sh
git fetch -ap
```

Update A Local Branch
=====================
A ```git pull``` will do a ```git fetch``` and ```git merge```, so to update a
local branch use the following command. This must be done to every local branch.

```
git checkout <branch a>
git pull origin <branch a>
```

Do not confuse this with the following command, becuase it will fetch and merge
the remote's "master" into the branch you are currently working on.
```
git checkout <branch a>
git pull origin master
```

The above command is useful to help update the branch you are working, it should
make merging a little easier. This is totally dependent on your work-flow (use
of git).

Copy Remote Repository
======================
Cloning/copying the repo to your machine.
```sh
git clone < repo address >
```

Switch To A Different Branch
============================
This can only be done if no changes have been made.
```sh
git checkout <branch name a>
git branch <branch name a>
```
Also if you switched to a branch that does not contain files from the prvious
branch, the branch you switch to will now need to be cleaned. Use the following
command. See Undo Changes before staged.


Create a New Branch
===================
There are two ways this can be done. The following command create a branch based
from the branch you are curently working on and switches to the newly created
branch.
```sh
git checkout -b feature/<something your working on>
```

To create a new brach based of anothe branch and switches to the newly created
branch:
```sh
git checkout -b <your branch name> <some local or remote branch>
```

Now your ready to make changes to the code.

Git Diff
========
git diff command order matters, generaly arguments should be as follows:
```
git diff <old> <new>
```
Review Your Changes
-------------------
For a specific file
```sh
git diff <name of file or path and name of file>
```

For all files
```sh
git diff
```

Compare Branches
----------------
```
git diff <branch name a> <branch name b>
```

Compare Commits
---------------
```
git diff HEAD^ HEAD
```

Setup vimdiff as Diff Tool
---------------------------
insert instuctions here

Creating a commit
=================
Commits can be see a set of files saved at a particular moment.

When changes are complete and you would like to save at that moment.

Step 1 - State Your Changes
---------------------------

* Stage All Changes For Commit
```sh
git add -A .
```

* Stage a File For Commit
```sh
git add <file name or path and file name>
```
* Stage a Directory For Commit
```sh
git add <directory name or path and directory name>
```

Step 2 - Commit Your changes
----------------------------
```sh
git commit -m "<your message>"
```

Reviewing Last Commit
=====================
```sh
git log -1
```

Pushing to the Remote Repository
================================
Once a new commit has been created you are now ready to push your code to the
remote repository.

```sh
git push origin <branch name a>
```

Always check the remotes website to make sure you changes were pushed.

Git Tutorial/links
==================
**Basic Git commands**

https://confluence.atlassian.com/display/STASH/Basic+Git+commands

**Tutorial on how to manipulate commits**

http://pcottle.github.io/learnGitBranching/

**Git flow**

http://nvie.com/posts/a-successful-git-branching-model/

**Pro Git**

http://git-scm.com/book
