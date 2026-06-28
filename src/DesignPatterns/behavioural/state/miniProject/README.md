# Order Workflow State Mini Project

## Overview

This mini project shows State using an ecommerce order.

Order states:

- Placed
- Packed
- Shipped
- Delivered

Each state controls what happens on next step and cancel.

## Pattern Mapping

State:

- OrderState

Concrete States:

- PlacedState
- PackedState
- ShippedState
- DeliveredState

Context:

- Order

## How to Run

```bash
javac src/DesignPatterns/behavioural/state/miniProject/App.java
java -cp src DesignPatterns.behavioural.state.miniProject.App
```
