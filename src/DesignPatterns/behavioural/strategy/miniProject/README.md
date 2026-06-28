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
javac src/DesignPatterns/behavioural/strategy/miniProject/App.java
java -cp src DesignPatterns.behavioural.strategy.miniProject.App
```
