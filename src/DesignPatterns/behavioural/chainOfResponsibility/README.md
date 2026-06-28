# Chain of Responsibility Design Pattern in Java

## Overview

Chain of Responsibility is a behavioral design pattern.

It passes a request through a chain of handlers.

Each handler decides:

- I can handle this request.
- Or I will pass it to the next handler.

## Very Simple Meaning

Imagine customer support.

Level 1 support tries first.

If Level 1 cannot solve it, the request goes to Level 2.

If Level 2 cannot solve it, the request goes to Manager.

That is Chain of Responsibility.

## When to Use

Use this pattern when:

- More than one object may handle a request.
- You do not want the sender to know the exact receiver.
- You want to avoid big if-else blocks.
- You want handlers to be arranged dynamically.

## Files in This Folder

### ChainOfResponsibility1.java

Shows the problem with if-else request handling.

### ChainOfResponsibility2.java

Introduces handler chain.

### ChainOfResponsibility3.java

Shows a longer approval chain.

## One-Line Definition

Chain of Responsibility is a pattern where a request moves through multiple handlers until one handler processes it.
