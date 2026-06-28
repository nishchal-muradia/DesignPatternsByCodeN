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
javac -d out src/DesignPatterns/structural/bridge/miniProject/*.java
java -cp out DesignPatterns.structural.bridge.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how report type and export format can change independently. New reports and new exporters do not need combination classes.

### Pattern Mapping

- Abstraction: Report
- Refined Abstractions: SalesReport, InventoryReport
- Implementation: Exporter
- Concrete Implementations: PDFExporter, CSVExporter

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/structural/bridge/miniProject/*.java
java -cp out DesignPatterns.structural.bridge.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Exporting PDF: Sales Report
Total sales are 120000
Exporting CSV: Inventory Report
Available,items,are,450
```
