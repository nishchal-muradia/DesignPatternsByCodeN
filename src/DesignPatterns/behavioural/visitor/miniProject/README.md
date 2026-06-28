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
javac src/DesignPatterns/behavioural/visitor/miniProject/App.java
java -cp src DesignPatterns.behavioural.visitor.miniProject.App
```
