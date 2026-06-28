# Report Generator Template Method Mini Project

## Overview

This mini project shows Template Method using report generation.

All reports follow same steps:

1. Fetch data
2. Format data
3. Export report

Each report type customizes some steps.

## Pattern Mapping

Abstract Class:

- ReportGenerator

Concrete Classes:

- SalesReportGenerator
- UserReportGenerator

Template Method:

- generate()

## How to Run

```bash
javac -d out src/DesignPatterns/behavioural/templateMethod/miniProject/*.java
java -cp out DesignPatterns.behavioural.templateMethod.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how report generation can keep the same algorithm order while each report customizes selected steps.

### Pattern Mapping

- Abstract Class: ReportGenerator
- Template Method: generate()
- Concrete Classes: SalesReportGenerator, UserReportGenerator
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/behavioural/templateMethod/miniProject/*.java
java -cp out DesignPatterns.behavioural.templateMethod.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Fetching sales data
Formatting data as table
Exporting sales report as PDF

Fetching user data
Formatting data as table
Exporting user report as CSV
```
