# Job Queue Command Mini Project

## Overview

This mini project shows Command using a job queue.

Jobs can be:

- Send email
- Generate report
- Backup database

Each job is wrapped as a command object.

The queue can store and execute them later.

## Pattern Mapping

Command:

- JobCommand

Concrete Commands:

- EmailJob
- ReportJob
- BackupJob

Invoker:

- JobQueue

## How to Run

```bash
javac -d out src/DesignPatterns/behavioural/command/miniProject/*.java
java -cp out DesignPatterns.behavioural.command.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how jobs can be stored as command objects and executed later by a queue.

### Pattern Mapping

- Command: JobCommand
- Concrete Commands: EmailJob, ReportJob, BackupJob
- Invoker: JobQueue
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/behavioural/command/miniProject/*.java
java -cp out DesignPatterns.behavioural.command.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Sending email to customer@example.com
Generating report: sales-report
Backing up database: orders-db
```
