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
javac src/DesignPatterns/behavioural/chainOfResponsibility/miniProject/App.java
java -cp src DesignPatterns.behavioural.chainOfResponsibility.miniProject.App
```
