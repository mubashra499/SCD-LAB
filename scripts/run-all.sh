#!/usr/bin/env bash
# Runs Tasks 1-4 in order. Usage: scripts/run-all.sh <github-username>
set -e
DIR="$(dirname "$0")"
bash "$DIR/task1-init.sh"
bash "$DIR/task2-branching.sh"
bash "$DIR/task3-history.sh"
bash "$DIR/task4-remote.sh" "$@"
