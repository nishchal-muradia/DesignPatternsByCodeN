# Command Design Pattern in Java

## Overview

Command is a behavioral design pattern.

It converts a request into an object.

That object can be passed, stored, queued, logged, or undone.

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
