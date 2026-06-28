# Mediator Design Pattern in Java

## Overview

Mediator is a behavioral design pattern.

It is used when many objects need to communicate with each other, but direct object-to-object communication is making the code messy.

Instead of every object knowing about every other object, all communication goes through one central mediator.

The mediator decides who should receive a message, what should happen next, and how objects should coordinate.

This pattern is common in chat rooms, UI forms, dialog boxes, air traffic control examples, and workflow coordination.

For beginners, remember this simple point: Mediator reduces many direct connections by introducing one central coordinator.

## Very Simple Meaning

In a chat room, users do not send messages to every user manually.

They send message to the chat room.

The chat room forwards it to others.

The chat room is the mediator.

## When to Use

Use Mediator when:

- Many objects communicate with each other.
- Direct object-to-object communication becomes messy.
- You want one central place to coordinate interactions.

## Files in This Folder

### Mediator1.java

Shows direct communication.

### Mediator2.java

Introduces chat mediator.

### Mediator3.java

Shows mediator coordinating UI components.

## One-Line Definition

Mediator is a pattern where objects communicate through a central coordinator instead of directly depending on each other.
---

## Beginner Deep Dive

### Pattern In One Line

Mediator centralizes communication between objects.

### What Is This Pattern?

Instead of objects directly calling each other, they communicate through a mediator. The mediator coordinates interactions and reduces many-to-many dependencies.

### The Core Problem It Solves

When many objects directly depend on each other, the system becomes hard to change and understand.

### How It Works Step By Step

1. Create a mediator interface or class.
2. Objects keep a reference to mediator instead of each other.
3. Objects send events or requests to mediator.
4. Mediator decides which other objects should react.
5. Objects stay loosely coupled.

### Main Participants

- Mediator: coordination object.
- Concrete Mediator: contains communication rules.
- Colleagues: objects that communicate through mediator.

### Simple Diagram

```text
Object A -> Mediator <- Object B
Object C -> Mediator -> Object D
```

### When To Use

- Many objects communicate with each other.
- UI components need coordination.
- You want to reduce direct dependencies.

### When Not To Use

- Do not use it if only two simple objects communicate.
- Avoid a mediator that becomes a giant god object.

### Advantages

- Reduces object-to-object coupling.
- Centralizes coordination rules.
- Makes colleagues easier to reuse.

### Disadvantages And Trade-Offs

- Mediator can become too large.
- Logic may be less visible from individual objects.

### Do Not Confuse This With

- Mediator vs Facade: Facade simplifies subsystem access; Mediator coordinates peer communication.
- Mediator vs Observer: Observer broadcasts changes; Mediator actively coordinates interactions.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/behavioural/mediator/Mediator1.java
java -cp out DesignPatterns.behavioural.mediator.Mediator1
javac -d out src/DesignPatterns/behavioural/mediator/Mediator2.java
java -cp out DesignPatterns.behavioural.mediator.Mediator2
javac -d out src/DesignPatterns/behavioural/mediator/Mediator3.java
java -cp out DesignPatterns.behavioural.mediator.Mediator3
```

### Interview Q&A

### What problem does Mediator solve?

Many objects directly depending on each other.

### What are colleagues?

Objects that communicate through the mediator.

### Where is it common?

Chat rooms, UI dialogs, air traffic control examples.
