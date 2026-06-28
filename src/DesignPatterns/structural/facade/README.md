# Facade Design Pattern in Java

## Overview

Facade is a structural design pattern.

It is used when a system has many classes or steps, but the client should interact with it through one simple entry point.

The facade class hides the complex internal flow and exposes easy methods for common operations.

The subsystem classes still do the real work, but the client does not need to call them one by one.

This pattern is common in order processing, home theater systems, service layers, SDKs, and application startup flows.

For beginners, remember this simple point: Facade gives a simple front door to a complex system.

## Very Simple Meaning

Think about starting a car.

You press one start button.

Behind the scenes:

- Battery starts
- Fuel system starts
- Engine starts
- Sensors check status

You do not call all those systems manually.

The start button is like a facade.

## When to Use

Use Facade when:

- A subsystem has many classes.
- Client code should not know every low-level step.
- You want one simple entry point.

## Files in This Folder

### Facade1.java

Shows client calling many subsystem classes directly.

### Facade2.java

Adds a facade that hides subsystem details.

### Facade3.java

Shows facade with a home theater startup flow.

## One-Line Definition

Facade is a pattern where one simple class hides complex subsystem operations behind easy methods.
---

## Beginner Deep Dive

### Pattern In One Line

Facade provides one simple interface over a complex subsystem.

### What Is This Pattern?

Facade hides many low-level subsystem calls behind one clear method. The subsystem still exists, but client code does not need to know every detail.

### The Core Problem It Solves

Client code becomes complicated when it must call many classes in the correct order.

### How It Works Step By Step

1. Identify a repeated complex workflow.
2. Create a facade class for that workflow.
3. Move subsystem calls into the facade method.
4. Client calls the facade instead of many subsystem objects.

### Main Participants

- Facade: simple entry point.
- Subsystem classes: low-level services doing real work.
- Client: uses the facade.

### Simple Diagram

```text
Client -> Facade -> Subsystem A
                 -> Subsystem B
                 -> Subsystem C
```

### When To Use

- A workflow needs many subsystem calls.
- You want a simpler API for beginners or clients.
- You want to reduce coupling to subsystem details.

### When Not To Use

- Do not use it to hide bad design without fixing core problems.
- Avoid putting all application logic into one giant facade.

### Advantages

- Simplifies client code.
- Centralizes workflow order.
- Reduces coupling to subsystem details.

### Disadvantages And Trade-Offs

- Can become a large god class if abused.
- May hide useful subsystem capabilities if too restrictive.

### Do Not Confuse This With

- Facade vs Adapter: Facade simplifies; Adapter converts an interface.
- Facade vs Mediator: Facade gives a simple entry point; Mediator coordinates communication between peer objects.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/structural/facade/Facade1.java
java -cp out DesignPatterns.structural.facade.Facade1
javac -d out src/DesignPatterns/structural/facade/Facade2.java
java -cp out DesignPatterns.structural.facade.Facade2
javac -d out src/DesignPatterns/structural/facade/Facade3.java
java -cp out DesignPatterns.structural.facade.Facade3
```

### Interview Q&A

### Does Facade replace subsystem classes?

No. It wraps and simplifies access to them.

### What is the main benefit?

A simple API for a complex process.

### Where is it common?

Service layers, SDKs, order processing, home theater controls.
