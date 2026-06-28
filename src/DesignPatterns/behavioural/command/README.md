# Command Design Pattern in Java

## Overview

Command is a behavioral design pattern.

It is used when we want to treat an action like an object.

Instead of directly calling a method on a receiver object, we wrap that method call inside a command class.

Once an action becomes an object, we can store it, pass it around, queue it, log it, execute it later, or undo it.

This pattern is common in remote controls, buttons, menu actions, job queues, transaction systems, and undo-redo features.

For beginners, remember this simple point: Command separates the object that asks for work from the object that actually performs the work.

## Very Simple Meaning

A restaurant waiter takes your order.

The order is written on paper.

The chef does not need to know you directly.
The chef just receives the order command and executes it.

## When to Use

Use Command when:

- You want to store actions as objects.
- You want undo/redo.
- You want queues or logs of operations.
- Sender should not know the receiver directly.

## Files in This Folder

### Command1.java

Shows direct method calls.

### Command2.java

Introduces command object and remote control.

### Command3.java

Adds undo behavior.

## One-Line Definition

Command is a pattern where an action is wrapped inside an object.
---

## Beginner Deep Dive

### Pattern In One Line

Command wraps an action inside an object.

### What Is This Pattern?

Command converts a request into an object. That object can be stored, queued, logged, executed later, or undone.

### The Core Problem It Solves

A sender may be tightly coupled to the exact receiver method it calls, making queuing and undo difficult.

### How It Works Step By Step

1. Define a command interface with execute().
2. Create concrete command classes.
3. Each command stores the receiver it will operate on.
4. Invoker stores and triggers commands.
5. Optional undo() can reverse the operation.

### Main Participants

- Command: interface for executing an action.
- Concrete Command: stores receiver and calls it.
- Receiver: object that does real work.
- Invoker: triggers the command.
- Client: wires command and receiver together.

### Simple Diagram

```text
Client -> Command -> Receiver
Invoker -> execute()
```

### When To Use

- You need undo or redo.
- You want queues or scheduled jobs.
- You want to log operations.
- Sender should not know receiver details.

### When Not To Use

- Do not use it for one direct call that will never be stored or undone.
- Avoid creating command classes for every tiny operation without a reason.

### Advantages

- Actions become first-class objects.
- Supports undo, queues, and logs.
- Decouples invoker from receiver.

### Disadvantages And Trade-Offs

- Can create many small command classes.
- May feel verbose for simple calls.

### Do Not Confuse This With

- Command vs Strategy: Command represents an action request; Strategy represents interchangeable algorithms.
- Command vs Memento: Command can undo by reversing action; Memento restores saved state.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/behavioural/command/Command1.java
java -cp out DesignPatterns.behavioural.command.Command1
javac -d out src/DesignPatterns/behavioural/command/Command2.java
java -cp out DesignPatterns.behavioural.command.Command2
javac -d out src/DesignPatterns/behavioural/command/Command3.java
java -cp out DesignPatterns.behavioural.command.Command3
```

### Interview Q&A

### What method does a command usually have?

execute().

### Why store receiver in command?

Because receiver performs the real work.

### Where is Command used?

Buttons, queues, transactions, undo/redo systems.
