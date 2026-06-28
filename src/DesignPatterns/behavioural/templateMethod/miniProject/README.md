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
javac src/DesignPatterns/behavioural/templateMethod/miniProject/App.java
java -cp src DesignPatterns.behavioural.templateMethod.miniProject.App
```
