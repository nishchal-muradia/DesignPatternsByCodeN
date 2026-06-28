# Adapter Design Pattern in Java

## Overview

Adapter is a structural design pattern.

It allows two incompatible interfaces to work together.

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
