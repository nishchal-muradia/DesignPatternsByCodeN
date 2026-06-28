# Report Export Bridge Mini Project

## Overview

This mini project shows Bridge using reports and exporters.

Reports can be:

- Sales report
- Inventory report

Exporters can be:

- PDF exporter
- CSV exporter

These two dimensions can grow independently.

## Pattern Mapping

Abstraction:

- Report

Refined Abstractions:

- SalesReport
- InventoryReport

Implementation:

- Exporter

Concrete Implementations:

- PDFExporter
- CSVExporter

## How to Run

```bash
javac src/DesignPatterns/structural/bridge/miniProject/App.java
java -cp src DesignPatterns.structural.bridge.miniProject.App
```
