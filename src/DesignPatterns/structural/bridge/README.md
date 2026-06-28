# Bridge Design Pattern in Java

## Overview

Bridge is a structural design pattern.

It is used when a class has two independent dimensions that can vary, and inheritance would create too many combinations.

Instead of creating a separate subclass for every combination, Bridge separates the high-level abstraction from the low-level implementation.

The abstraction keeps a reference to an implementation interface and delegates actual work to it.

This pattern is common in remote-control/device examples, report/exporter systems, drawing APIs, notification channels, and platform-specific code.

For beginners, remember this simple point: Bridge splits two changing parts so both can grow independently.

## Very Simple Meaning

Imagine a remote control and devices.

Remote can be:

- Basic remote
- Advanced remote

Device can be:

- TV
- Radio

Without Bridge, we may create many classes:

- BasicTVRemote
- AdvancedTVRemote
- BasicRadioRemote
- AdvancedRadioRemote

Bridge avoids this class explosion.

Remote has a Device reference.

Now remotes and devices can grow separately.

## When to Use

Use Bridge when:

- You have two dimensions that can vary independently.
- Inheritance is creating too many combinations.
- You want composition instead of large class hierarchies.

## Files in This Folder

### Bridge1.java

Shows the class explosion problem.

### Bridge2.java

Introduces a bridge between Remote and Device.

### Bridge3.java

Shows how we can add a new remote or new device independently.

## One-Line Definition

Bridge is a pattern where one abstraction holds a reference to an implementation, so both sides can evolve separately.
---

## Beginner Deep Dive

### Pattern In One Line

Bridge separates abstraction from implementation so both can vary independently.

### What Is This Pattern?

Bridge uses composition to connect two dimensions that can change separately. The abstraction holds a reference to an implementation interface.

### The Core Problem It Solves

If two dimensions vary together through inheritance, class combinations explode.

### How It Works Step By Step

1. Find two independent dimensions.
2. Make one side the abstraction.
3. Make the other side the implementation interface.
4. Let abstraction hold implementation by composition.
5. Add new abstractions or implementations independently.

### Main Participants

- Abstraction: high-level control class.
- Refined Abstraction: specialized high-level class.
- Implementation: interface for low-level work.
- Concrete Implementation: actual low-level behavior.

### Simple Diagram

```text
Abstraction -> Implementation interface
     |                 |
RefinedAbstraction   ConcreteImplementation
```

### When To Use

- Two dimensions change independently.
- Inheritance is creating many combinations.
- You want composition instead of a deep hierarchy.

### When Not To Use

- Do not use it if there is only one dimension of variation.
- Avoid it when simple inheritance is enough and unlikely to grow.

### Advantages

- Prevents class explosion.
- Improves flexibility.
- Lets both sides evolve independently.

### Disadvantages And Trade-Offs

- Harder to understand at first.
- Adds indirection.

### Do Not Confuse This With

- Bridge vs Adapter: Bridge is planned upfront to separate dimensions; Adapter fixes incompatible interfaces after the fact.
- Bridge vs Strategy: Strategy changes an algorithm; Bridge separates two object hierarchies.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/structural/bridge/Bridge1.java
java -cp out DesignPatterns.structural.bridge.Bridge1
javac -d out src/DesignPatterns/structural/bridge/Bridge2.java
java -cp out DesignPatterns.structural.bridge.Bridge2
javac -d out src/DesignPatterns/structural/bridge/Bridge3.java
java -cp out DesignPatterns.structural.bridge.Bridge3
```

### Interview Q&A

### What is the key idea?

Prefer composition to connect two varying dimensions.

### What problem does it prevent?

Class explosion from many combinations.

### What is implementation here?

The lower-level interface used by the abstraction.
