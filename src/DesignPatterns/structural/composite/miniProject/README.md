# Company Structure Mini Project

## Overview

This mini project shows Composite using company structure.

A company has:

- Individual employees
- Departments containing employees and sub-departments

Both employee and department can calculate cost.

## Pattern Mapping

Component:

- OrganizationUnit

Leaf:

- Employee

Composite:

- Department

## How to Run

```bash
javac -d out src/DesignPatterns/structural/composite/miniProject/*.java
java -cp out DesignPatterns.structural.composite.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how an employee and a department can both be treated as organization units, even though one is a leaf and one is a group.

### Pattern Mapping

- Component: OrganizationUnit
- Leaf: Employee
- Composite: Department
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/structural/composite/miniProject/*.java
java -cp out DesignPatterns.structural.composite.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Department: CodeN
  Department: Engineering
    Employee: Amit, salary=60000.0
    Employee: Neha, salary=70000.0
  Department: QA
    Employee: Ravi, salary=45000.0
Total salary cost: 175000.0
```
