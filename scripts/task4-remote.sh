#!/usr/bin/env bash
# Run with Git Bash / Linux / macOS from anywhere. Needs git user.name and user.email configured.
set -e
cd "$(dirname "$0")/.."
SRC=src/main/java/com/hitms/lms
TST=src/test/java/com/hitms/lms
STAGES=scripts/stages
if [ ! -d .git ]; then echo "No repository yet. Run scripts/task1-init.sh first."; exit 1; fi

# Task 4: connect to GitHub (create an EMPTY repo named lms_project there first) and push
if [ -z "${REMOTE_URL:-}" ] && [ -z "${1:-}" ]; then
  echo "Usage: scripts/task4-remote.sh <github-username>"; exit 1
fi
REMOTE_URL="${REMOTE_URL:-https://github.com/$1/lms_project.git}"

git remote add origin "$REMOTE_URL"
git push -u origin main

cp $STAGES/stage4/LibraryService.java $SRC/LibraryService.java
cp $STAGES/stage4/IssueBookValidationTest.java $TST/IssueBookValidationTest.java
git add .
git commit -q -m "Add input validation to issueBook()"
git push

git log --oneline
