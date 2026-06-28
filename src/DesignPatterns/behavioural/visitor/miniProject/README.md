# Shopping Cart Visitor Mini Project

## Overview

This mini project shows Visitor using a shopping cart.

Cart items:

- Book
- Mobile

Visitors:

- PriceVisitor calculates final price.
- ShippingVisitor calculates shipping.

New operations can be added as new visitors.

## Pattern Mapping

Element:

- CartItem

Concrete Elements:

- BookItem
- MobileItem

Visitor:

- CartVisitor

Concrete Visitors:

- PriceVisitor
- ShippingVisitor

## How to Run

```bash
javac -d out src/DesignPatterns/behavioural/visitor/miniProject/*.java
java -cp out DesignPatterns.behavioural.visitor.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how new operations like price calculation and shipping calculation can be added as visitors.

### Pattern Mapping

- Element: CartItem
- Concrete Elements: BookItem, MobileItem
- Visitor: CartVisitor
- Concrete Visitors: PriceVisitor, ShippingVisitor

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/behavioural/visitor/miniProject/*.java
java -cp out DesignPatterns.behavioural.visitor.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Java Basics final price: 520.0
Java Basics shipping: 40
Pixel final price: 65000.0
Pixel shipping: 100
```
