# Stock Price Observer Mini Project

## Overview

This mini project shows Observer using stock price alerts.

Investors subscribe to a stock.

When price changes, all subscribed investors receive an update.

## Pattern Mapping

Subject:

- Stock

Observer:

- Investor

Concrete Observer:

- MobileInvestor

## How to Run

```bash
javac -d out src/DesignPatterns/behavioural/observer/miniProject/*.java
java -cp out DesignPatterns.behavioural.observer.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how investors can subscribe to a stock and automatically receive price updates.

### Pattern Mapping

- Subject: Stock
- Observer: Investor
- Concrete Observer: MobileInvestor
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/behavioural/observer/miniProject/*.java
java -cp out DesignPatterns.behavioural.observer.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Amit got alert: TCS price is 3850.0
Neha got alert: TCS price is 3850.0
Amit got alert: TCS price is 3920.0
Neha got alert: TCS price is 3920.0
```
