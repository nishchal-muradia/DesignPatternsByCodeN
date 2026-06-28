# Adapter Design Pattern in Java

## Overview

Adapter is a structural design pattern.

It is used when two classes should work together but their method names, method parameters, or interfaces do not match.

Instead of changing the old class or the client code, we create an adapter class between them.

The adapter implements the interface expected by the client and internally calls the incompatible class in the correct way.

This pattern is common when working with legacy code, third-party libraries, payment gateways, old APIs, and hardware/device connectors.

For beginners, remember this simple point: Adapter is like a translator between two incompatible interfaces.

## Very Simple Meaning

Your phone needs a USB-C charger.

You only have an old charger.

An adapter sits between them and makes the old charger usable with the new phone.

In Java, Adapter does the same thing.

It converts one interface into another interface expected by the client.

## Problem

Client expects:

```java
USBCharger charger;
charger.chargeWithUSB();
```

But old class provides:

```java
OldCharger charger;
charger.chargeWithRoundPin();
```

The method names and interfaces do not match.

Adapter solves this without changing the old class.

## When to Use

Use Adapter when:

- You have an existing class with an incompatible interface.
- You cannot or do not want to modify the old class.
- You want client code to use a clean expected interface.

## Files in This Folder

### Adapter1.java

Shows the problem with incompatible interfaces.

### Adapter2.java

Adds an adapter that converts old charger behavior into the expected USB charger interface.

### Adapter3.java

Shows another adapter example with a third-party payment gateway.

## One-Line Definition

Adapter is a pattern where a wrapper class converts one interface into another interface expected by the client.
---

## Beginner Deep Dive

### Pattern In One Line

Adapter converts one interface into another interface expected by the client.

### What Is This Pattern?

Adapter wraps an incompatible class and exposes the interface that client code already expects. The old class does not need to change.

### The Core Problem It Solves

A client expects one method shape, but an existing or third-party class provides a different method shape.

### How It Works Step By Step

1. Identify the interface the client expects.
2. Identify the existing incompatible class.
3. Create an adapter that implements the expected interface.
4. Inside adapter methods, call the old class in the required way.
5. Client uses the adapter as if it were the expected object.

### Main Participants

- Target: interface expected by client.
- Adaptee: existing incompatible class.
- Adapter: wrapper that translates calls.
- Client: uses the target interface.

### Simple Diagram

```text
Client -> Target interface -> Adapter -> Adaptee
```

### When To Use

- You need to use legacy or third-party code.
- You cannot modify the existing class.
- You want client code to stay clean.

### When Not To Use

- Do not use it if you can easily change the incompatible class directly.
- Avoid unnecessary adapters around already compatible APIs.

### Advantages

- Keeps client code independent from old APIs.
- Makes third-party integrations cleaner.
- Supports reuse of existing classes.

### Disadvantages And Trade-Offs

- Adds one more wrapper class.
- Too many adapters can hide complexity instead of reducing it.

### Do Not Confuse This With

- Adapter vs Facade: Adapter changes an interface; Facade simplifies a complex subsystem.
- Adapter vs Decorator: Adapter makes incompatible things work; Decorator adds behavior while keeping the same interface.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/structural/adapter/Adapter1.java
java -cp out DesignPatterns.structural.adapter.Adapter1
javac -d out src/DesignPatterns/structural/adapter/Adapter2.java
java -cp out DesignPatterns.structural.adapter.Adapter2
javac -d out src/DesignPatterns/structural/adapter/Adapter3.java
java -cp out DesignPatterns.structural.adapter.Adapter3
```

### Interview Q&A

### Does Adapter change the old class?

No. It wraps the old class.

### What is the target?

The interface expected by client code.

### Where is it common?

Legacy integrations and third-party SDK wrappers.
