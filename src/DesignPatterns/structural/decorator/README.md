# Decorator Design Pattern in Java

## Overview

Decorator is a structural design pattern.

It is used when we want to add extra behavior to an object without changing its original class.

Decorator works by wrapping the original object inside another object that has the same interface.

Each wrapper can add something before or after calling the wrapped object, and multiple decorators can be stacked together.

This pattern is common in coffee toppings, pizza toppings, input/output streams, logging wrappers, compression, and encryption flows.

For beginners, remember this simple point: Decorator adds features by wrapping an object instead of modifying it.

## Very Simple Meaning

Think about coffee.

You start with simple coffee.

Then you add:

- Milk
- Sugar
- Chocolate

Each add-on decorates the original coffee.

The original object is not changed.

## When to Use

Use Decorator when:

- You want to add behavior dynamically.
- You want to avoid many subclasses for combinations.
- You want wrapping instead of changing original class.

## Files in This Folder

### Decorator1.java

Shows the subclass explosion problem.

### Decorator2.java

Introduces a coffee decorator.

### Decorator3.java

Shows multiple decorators stacked together.

## One-Line Definition

Decorator is a pattern where we wrap an object with another object to add extra behavior without changing the original class.
---

## Beginner Deep Dive

### Pattern In One Line

Decorator adds behavior to an object by wrapping it with another object.

### What Is This Pattern?

Decorator keeps the same interface as the original object, stores a reference to that object, and adds extra work before, after, or around the delegated call.

### The Core Problem It Solves

If every feature combination becomes a subclass, the number of classes grows too much.

### How It Works Step By Step

1. Define a component interface.
2. Create a concrete component.
3. Create an abstract decorator that also implements the component interface.
4. Store the wrapped component inside the decorator.
5. Concrete decorators add behavior and delegate to the wrapped object.

### Main Participants

- Component: common interface.
- Concrete Component: original object.
- Decorator: base wrapper.
- Concrete Decorator: adds extra behavior.

### Simple Diagram

```text
Client -> Decorator -> Decorator -> ConcreteComponent
```

### When To Use

- You want to add features dynamically.
- There are many optional feature combinations.
- You want to avoid subclass explosion.

### When Not To Use

- Do not use it when one simple subclass is enough.
- Avoid deep decorator chains that become hard to debug.

### Advantages

- Adds behavior without changing original class.
- Features can be stacked in different combinations.
- Follows Open/Closed Principle.

### Disadvantages And Trade-Offs

- Many small wrapper classes.
- Order of decorators can matter.

### Do Not Confuse This With

- Decorator vs Proxy: Decorator adds behavior; Proxy controls access.
- Decorator vs Adapter: Decorator keeps the same interface; Adapter changes the interface.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/structural/decorator/Decorator1.java
java -cp out DesignPatterns.structural.decorator.Decorator1
javac -d out src/DesignPatterns/structural/decorator/Decorator2.java
java -cp out DesignPatterns.structural.decorator.Decorator2
javac -d out src/DesignPatterns/structural/decorator/Decorator3.java
java -cp out DesignPatterns.structural.decorator.Decorator3
```

### Interview Q&A

### Does Decorator change the original class?

No. It wraps the original object.

### Can decorators be stacked?

Yes, that is one of the main benefits.

### What interface does a decorator implement?

The same interface as the object it wraps.
