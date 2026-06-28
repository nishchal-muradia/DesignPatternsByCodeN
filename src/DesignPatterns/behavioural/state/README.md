# State Design Pattern in Java

## Overview

State is a behavioral design pattern.

It allows an object to change its behavior when its internal state changes.

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
