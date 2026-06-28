# Flyweight Design Pattern in Java

## Overview

Flyweight is a structural design pattern.

It reduces memory usage by sharing common data between many objects.

## Very Simple Meaning

Imagine a game with thousands of trees.

Every tree has:

- x position
- y position
- tree type
- color
- texture

Position is unique for each tree.

But type, color, and texture can be shared.

Flyweight stores shared data once and reuses it.

## Important Idea

Intrinsic state:

Shared data stored inside flyweight object.

Extrinsic state:

Unique data passed from outside when needed.

## When to Use

Use Flyweight when:

- You create many similar objects.
- Many objects share same data.
- Memory usage matters.

## Files in This Folder

### Flyweight1.java

Shows many objects storing repeated data.

### Flyweight2.java

Introduces shared TreeType flyweight.

### Flyweight3.java

Adds a factory that reuses existing flyweight objects.

## One-Line Definition

Flyweight is a pattern where shared data is stored once and reused by many lightweight objects.
