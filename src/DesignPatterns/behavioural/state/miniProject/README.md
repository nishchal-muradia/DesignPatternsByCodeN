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
javac -d out src/DesignPatterns/behavioural/state/miniProject/*.java
java -cp out DesignPatterns.behavioural.state.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how order behavior changes depending on its current lifecycle state.

### Pattern Mapping

- Context: Order
- State: OrderState
- Concrete States: PlacedState, PackedState, ShippedState, DeliveredState
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/behavioural/state/miniProject/*.java
java -cp out DesignPatterns.behavioural.state.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Order packed
Order shipped
Cannot cancel shipped order
Order delivered
Order already delivered
```
