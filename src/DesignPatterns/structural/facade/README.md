# Facade Design Pattern in Java

## Overview

Facade is a structural design pattern.

It provides a simple interface over a complex subsystem.

## Very Simple Meaning

Think about starting a car.

You press one start button.

Behind the scenes:

- Battery starts
- Fuel system starts
- Engine starts
- Sensors check status

You do not call all those systems manually.

The start button is like a facade.

## When to Use

Use Facade when:

- A subsystem has many classes.
- Client code should not know every low-level step.
- You want one simple entry point.

## Files in This Folder

### Facade1.java

Shows client calling many subsystem classes directly.

### Facade2.java

Adds a facade that hides subsystem details.

### Facade3.java

Shows facade with a home theater startup flow.

## One-Line Definition

Facade is a pattern where one simple class hides complex subsystem operations behind easy methods.
