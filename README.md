# Lab 05: Version Control in Team Environment - Part I (Git Fundamentals)

Maven project `lab05_version_control` (the LMS project, package `com.hitms.lms`) used as the Git practice repository.

## Tasks in this project

Run the scripts in `scripts/` in order (Git Bash on Windows). They all work on the same repository, like the lab manual:

1. **Task 1 - Repository setup:** `scripts/task1-init.sh` (`git init`, `.gitignore`, first commit).
2. **Task 2 - Branching:** `scripts/task2-branching.sh` (`feature/add-member-lookup`, `findMemberById()`, merge into `main`).
3. **Task 3 - Commit history:** `scripts/task3-history.sh` (3 commits, prints `git log --oneline`).
4. **Task 4 - Remote:** create an empty `lms_project` repo on GitHub, then `scripts/task4-remote.sh <github-username>` (push, add validation to `issueBook()`, commit, push).

`scripts/run-all.sh <github-username>` runs all four. Before the scripts run, the project is in its final state and builds as is.

## Build / Run

```bash
mvn clean test
mvn clean package
java -jar target/*.jar
```

## Post-Lab Answers

**Q1.** `.gitignore` keeps generated or machine-specific files (`target/`, `.class` files, IDE metadata) out of the repository, so it stays small and clean, avoids merge conflicts on build output and does not leak personal IDE settings.

**Q2.** `git add` stages selected changes into the index; `git commit` records the staged snapshot permanently in history with a message.

**Q3.** A feature branch isolates work in progress so `main` stays stable. It allows safe experiments, parallel work and review before merging; a failed experiment can simply be discarded.
