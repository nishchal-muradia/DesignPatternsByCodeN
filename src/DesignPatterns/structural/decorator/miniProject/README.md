# Pizza Customizer Mini Project

## Overview

This mini project shows Decorator using pizza toppings.

Start with base pizza.

Then wrap it with toppings:

- Cheese
- Olives
- Paneer

Each topping adds description and cost.

## Pattern Mapping

Component:

- Pizza

Concrete Component:

- PlainPizza

Decorator:

- PizzaDecorator

Concrete Decorators:

- CheeseDecorator
- OliveDecorator
- PaneerDecorator

## How to Run

```bash
javac -d out src/DesignPatterns/structural/decorator/miniProject/*.java
java -cp out DesignPatterns.structural.decorator.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how toppings can be stacked without creating a subclass for every pizza combination.

### Pattern Mapping

- Component: Pizza
- Concrete Component: PlainPizza
- Decorator: PizzaDecorator
- Concrete Decorators: CheeseDecorator, OliveDecorator, PaneerDecorator

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/structural/decorator/miniProject/*.java
java -cp out DesignPatterns.structural.decorator.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Plain pizza, cheese, olives, paneer
Total cost: 215.0
```
