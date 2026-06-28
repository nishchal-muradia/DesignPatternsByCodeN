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
javac src/DesignPatterns/behavioural/command/miniProject/App.java
java -cp src DesignPatterns.behavioural.command.miniProject.App
```
