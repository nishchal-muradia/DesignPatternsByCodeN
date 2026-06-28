# Mediator Design Pattern in Java

## Overview

Mediator is a behavioral design pattern.

It reduces direct communication between objects.

Objects communicate through a mediator instead of talking to each other directly.

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
