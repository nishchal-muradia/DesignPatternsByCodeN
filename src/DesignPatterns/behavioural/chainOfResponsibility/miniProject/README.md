# Expense Approval Mini Project

## Overview

This mini project shows Chain of Responsibility using expense approval.

Approval chain:

- Team Lead approves up to 5000
- Manager approves up to 25000
- Director approves up to 100000

Request starts from Team Lead and moves upward only if needed.

## Pattern Mapping

Handler:

- ExpenseApprover

Concrete Handlers:

- TeamLead
- Manager
- Director

Client:

- App

## How to Run

```bash
javac -d out src/DesignPatterns/behavioural/chainOfResponsibility/miniProject/*.java
java -cp out DesignPatterns.behavioural.chainOfResponsibility.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how an approval request can move from team lead to manager to director without the client knowing who will approve it.

### Pattern Mapping

- Handler: ExpenseApprover
- Concrete Handlers: TeamLead, Manager, Director
- Request: expense amount
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/behavioural/chainOfResponsibility/miniProject/*.java
java -cp out DesignPatterns.behavioural.chainOfResponsibility.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Team Lead approved: 3000.0
Manager approved: 18000.0
Director approved: 80000.0
Expense rejected. Amount too high: 150000.0
```
