#!/usr/bin/env bash
# Run with Git Bash / Linux / macOS from anywhere. Needs git user.name and user.email configured.
set -e
cd "$(dirname "$0")/.."
SRC=src/main/java/com/hitms/lms
TST=src/test/java/com/hitms/lms
STAGES=scripts/stages
if [ ! -d .git ]; then echo "No repository yet. Run scripts/task1-init.sh first."; exit 1; fi

# Task 3: one more clear commit (3 in total), then show the history
cp $STAGES/stage3/LibraryService.java $SRC/LibraryService.java
git add $SRC/LibraryService.java
git commit -q -m "Add Javadoc to LibraryService methods"

git log --oneline
