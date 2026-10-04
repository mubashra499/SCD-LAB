#!/usr/bin/env bash
# Run with Git Bash / Linux / macOS from anywhere. Needs git user.name and user.email configured.
set -e
cd "$(dirname "$0")/.."
SRC=src/main/java/com/hitms/lms
TST=src/test/java/com/hitms/lms
STAGES=scripts/stages
if [ -d .git ]; then echo "Repository already exists. Delete the .git folder to start again."; exit 1; fi

# Task 1: git init, .gitignore (already present), first commit
git init -q
git symbolic-ref HEAD refs/heads/main
echo "scripts/" >> .git/info/exclude      # keep helper scripts out of the repository

# Put the project in its "first commit" state
rm -f $SRC/Member.java $TST/MemberLookupTest.java $TST/IssueBookValidationTest.java
cp $STAGES/stage1/LibraryService.java $SRC/LibraryService.java

git add .
git commit -q -m "Initial commit: add LMS Maven project and .gitignore"
git log --oneline
