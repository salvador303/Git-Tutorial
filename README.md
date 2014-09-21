Project Orange
==============

Author: Group Orange

Version: CS4250 (2014)

Website: https://github.com/salvador303/ProjectOrange


Requirements
------------




Git
---
**Help**
```sh
man git <command>
```

**Cloning/copying the repo to your machine**
```sh
git clone < repo address >
```

**Creating your own feature branch**

Getting the latest base code.
```sh
git checkout develop
```

Create a new branch with the name feature/<something your working on or your name>
```sh
git checkout -b feature/<something your working on>
```
Now your ready to make changes to the code.

**Reveiew your changes, by comparing current and  privious versions**

For a specific file
```sh
git diff <name of file | path and name of file>
```

For all files
```sh
git diff
```

**Creating a commit (saving your code)**

When changes are complete, or you would like to save them in the repo

Stage all changes for commit
```sh
git add -A
```

Create a commit
```sh
git commit -m "<your message>"
```

**Reviewing last commit**
```sh
git log -1
```

**Getting the branch Name**

Get your branch name before you push, copy your branch name
```sh
git branch
```
**Pushing to the repo**

Push to the repo, you can paste your branch name from above
```sh
git push origin feature/<something your working on>
```
**Create Pull Request**

1. Go to the repo website, and click on pull request.
2. Click on, New pull request.
3. Add the teammebers to do a code reviews.
4. Submit, Done, or whatever it is.

Git Tutorial/links
------------------
**Basic Git commands**

https://confluence.atlassian.com/display/STASH/Basic+Git+commands

**Tutorial on how to manipulate commits**

http://pcottle.github.io/learnGitBranching/

**Git flow**

http://nvie.com/posts/a-successful-git-branching-model/

**Pro Git**

http://git-scm.com/book

Licence
-------

