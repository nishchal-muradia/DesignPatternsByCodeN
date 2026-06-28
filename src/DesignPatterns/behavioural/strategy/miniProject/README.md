# Shipping Cost Strategy Mini Project

## Overview

This mini project shows Strategy using shipping cost calculation.

Shipping strategies:

- Standard shipping
- Express shipping
- Same-day shipping

Cart checkout does not contain all formulas.

It delegates calculation to selected strategy.

## Pattern Mapping

Strategy:

- ShippingStrategy

Concrete Strategies:

- StandardShipping
- ExpressShipping
- SameDayShipping

Context:

- Cart

## How to Run

```bash
javac -d out src/DesignPatterns/behavioural/strategy/miniProject/*.java
java -cp out DesignPatterns.behavioural.strategy.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how shipping formulas can be changed without changing the Cart class.

### Pattern Mapping

- Context: Cart
- Strategy: ShippingStrategy
- Concrete Strategies: StandardShipping, ExpressShipping, SameDayShipping
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/behavioural/strategy/miniProject/*.java
java -cp out DesignPatterns.behavioural.strategy.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Cart amount: 2000.0
Shipping: 50.0
Total: 2050.0
Cart amount: 2000.0
Shipping: 250.0
Total: 2250.0
```
