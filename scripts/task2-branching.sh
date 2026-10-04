#!/usr/bin/env bash
# Run with Git Bash / Linux / macOS from anywhere. Needs git user.name and user.email configured.
set -e
cd "$(dirname "$0")/.."
SRC=src/main/java/com/hitms/lms
TST=src/test/java/com/hitms/lms
STAGES=scripts/stages
if [ ! -d .git ]; then echo "No repository yet. Run scripts/task1-init.sh first."; exit 1; fi

# Task 2: feature branch, add a method, commit, merge into main
git checkout -q -b feature/add-member-lookup
cp $STAGES/stage2/LibraryService.java $SRC/LibraryService.java
cp $STAGES/stage2/Member.java $SRC/Member.java
cp $STAGES/stage2/MemberLookupTest.java $TST/MemberLookupTest.java
git add $SRC/LibraryService.java $SRC/Member.java $TST/MemberLookupTest.java
git commit -q -m "Add findMemberById() helper method"

git checkout -q main
git merge feature/add-member-lookup
git log --oneline
