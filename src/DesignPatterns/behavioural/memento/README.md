# Memento Design Pattern in Java

## Overview

Memento is a behavioral design pattern.

It is used when an object needs to save its current state so it can return to that state later.

The most common example is undo functionality in a text editor, drawing tool, or form.

Instead of exposing all internal fields to other classes, the object creates a snapshot of itself. That snapshot is called a memento.

Another object, usually called a caretaker, stores these snapshots and gives them back when restore or undo is needed.

For beginners, remember this simple point: Memento is useful when you need safe undo or restore without exposing internal object details.

## Very Simple Meaning

Think about undo in a text editor.

Before changing text, editor saves a snapshot.

If user clicks undo, editor restores old snapshot.

That snapshot is a memento.

## When to Use

Use Memento when:

- You need undo/redo.
- You want to save object state safely.
- You do not want outside classes to change internal state directly.

## Files in This Folder

### Memento1.java

Shows the problem without undo.

### Memento2.java

Introduces one saved state.

### Memento3.java

Uses history stack for multiple undo.

## One-Line Definition

Memento is a pattern where an object saves snapshots of its state so it can restore them later.
---

## Beginner Deep Dive

### Pattern In One Line

Memento saves and restores an object's previous state.

### What Is This Pattern?

Memento captures a snapshot of an object's internal state without exposing the full internals to other classes. Later, the object can restore itself from that snapshot.

### The Core Problem It Solves

Undo becomes messy if outside classes directly read and write internal state.

### How It Works Step By Step

1. Originator creates a memento containing current state.
2. Caretaker stores mementos in history.
3. Originator changes over time.
4. When undo is needed, caretaker gives back a previous memento.
5. Originator restores itself from that memento.

### Main Participants

- Originator: object whose state is saved.
- Memento: snapshot of state.
- Caretaker: stores snapshots but does not modify them.

### Simple Diagram

```text
Originator -> save() -> Memento -> Caretaker history
Originator <- restore(memento)
```

### When To Use

- You need undo/redo.
- You need checkpoints.
- State should be restored without exposing internals.

### When Not To Use

- Do not use it if saved states are huge and memory is limited.
- Avoid it if undo can be represented more simply by reversing commands.

### Advantages

- Clean undo support.
- Protects encapsulation.
- History can store multiple snapshots.

### Disadvantages And Trade-Offs

- Can consume memory.
- Managing history size is important.

### Do Not Confuse This With

- Memento vs Command: Memento restores state snapshots; Command can undo by reversing operations.
- Memento vs Prototype: Memento captures state for restore; Prototype copies objects to create new ones.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/behavioural/memento/Memento1.java
java -cp out DesignPatterns.behavioural.memento.Memento1
javac -d out src/DesignPatterns/behavioural/memento/Memento2.java
java -cp out DesignPatterns.behavioural.memento.Memento2
javac -d out src/DesignPatterns/behavioural/memento/Memento3.java
java -cp out DesignPatterns.behavioural.memento.Memento3
```

### Interview Q&A

### Who creates the memento?

The originator.

### Who stores the memento?

The caretaker.

### Should caretaker change memento data?

No.
