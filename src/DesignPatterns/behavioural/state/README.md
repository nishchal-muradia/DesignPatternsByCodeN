# State Design Pattern in Java

## Overview

State is a behavioral design pattern.

It is used when an object's behavior depends on its current state.

Without this pattern, code often becomes full of `if-else` checks like `if order is new`, `if order is shipped`, or `if order is delivered`.

State pattern moves each state's behavior into its own class. The main object keeps a reference to the current state and delegates work to it.

This pattern is common in order workflows, media players, traffic lights, ATM machines, and document approval flows.

For beginners, remember this simple point: State replaces large state-based conditionals with separate state classes.

## Very Simple Meaning

Think about an order.

Same action can behave differently based on current state.

If order is new, cancel is allowed.

If order is shipped, cancel may not be allowed.

State pattern moves state-specific behavior into separate state classes.

## When to Use

Use State when:

- Object behavior depends on current state.
- You have many if-else checks based on state.
- State transitions should be clear.

## Files in This Folder

### State1.java

Shows if-else based state handling.

### State2.java

Introduces state objects.

### State3.java

Shows state transition.

## One-Line Definition

State is a pattern where each state is represented by a class, and the object delegates behavior to its current state.
---

## Beginner Deep Dive

### Pattern In One Line

State lets an object change behavior when its internal state changes.

### What Is This Pattern?

State moves state-specific behavior into separate classes. The context delegates behavior to the current state object.

### The Core Problem It Solves

A class can become full of if-else checks like if state is NEW, SHIPPED, DELIVERED, etc.

### How It Works Step By Step

1. Define a state interface.
2. Create one concrete state class per state.
3. Context stores current state.
4. Context delegates actions to current state.
5. State objects can move context to another state.

### Main Participants

- Context: object whose behavior changes.
- State: common interface for state behavior.
- Concrete State: behavior for one state.

### Simple Diagram

```text
Context -> current State -> ConcreteState behavior
```

### When To Use

- Behavior depends heavily on current state.
- There are many state-based if-else blocks.
- State transitions should be explicit.

### When Not To Use

- Do not use it for one or two simple state checks.
- Avoid it if state transitions are not meaningful.

### Advantages

- Removes large state if-else blocks.
- State behavior becomes focused.
- Transitions are easier to see.

### Disadvantages And Trade-Offs

- Adds one class per state.
- Can be overkill for simple state machines.

### Do Not Confuse This With

- State vs Strategy: State changes based on internal lifecycle; Strategy is usually chosen from outside to change algorithm.
- State vs Template Method: State changes runtime behavior; Template Method fixes algorithm structure in parent class.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/behavioural/state/State1.java
java -cp out DesignPatterns.behavioural.state.State1
javac -d out src/DesignPatterns/behavioural/state/State2.java
java -cp out DesignPatterns.behavioural.state.State2
javac -d out src/DesignPatterns/behavioural/state/State3.java
java -cp out DesignPatterns.behavioural.state.State3
```

### Interview Q&A

### What is context?

The main object whose behavior depends on state.

### Who changes state?

The context or the current state object.

### What does State replace?

Large conditionals based on state.
