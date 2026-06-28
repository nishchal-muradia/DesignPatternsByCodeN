# Flyweight Design Pattern in Java

## Overview

Flyweight is a structural design pattern.

It is used when an application creates a very large number of similar objects and many of those objects share the same data.

Instead of storing the same repeated data inside every object, Flyweight stores shared data once and reuses it.

The shared data is called intrinsic state. The unique data that changes for each object is called extrinsic state.

This pattern is common in games, map markers, text editors, icons, particle systems, and large graphical applications.

For beginners, remember this simple point: Flyweight saves memory by sharing common object data.

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
---

## Beginner Deep Dive

### Pattern In One Line

Flyweight saves memory by sharing common data between many objects.

### What Is This Pattern?

Flyweight separates shared intrinsic state from unique extrinsic state. Shared objects are reused from a factory/cache instead of duplicated.

### The Core Problem It Solves

Creating thousands of similar objects with repeated data wastes memory.

### How It Works Step By Step

1. Find data repeated across many objects.
2. Move repeated data into a flyweight class.
3. Keep unique data outside or in a lightweight context object.
4. Use a factory to reuse flyweight objects.
5. Pass unique data when calling flyweight behavior.

### Main Participants

- Flyweight: stores shared intrinsic data.
- Context: stores unique extrinsic data.
- Flyweight Factory: caches and returns shared flyweights.
- Client: combines shared and unique data.

### Simple Diagram

```text
Client -> FlyweightFactory -> shared Flyweight
Context object -> unique x/y/state
```

### When To Use

- You create many similar objects.
- Many fields are repeated.
- Memory usage is a real concern.

### When Not To Use

- Do not use it for small object counts.
- Avoid it if shared and unique state cannot be separated cleanly.

### Advantages

- Reduces memory usage.
- Avoids storing repeated data many times.
- Works well for games, maps, icons, and text rendering.

### Disadvantages And Trade-Offs

- More complex state management.
- Clients must provide extrinsic state correctly.

### Do Not Confuse This With

- Flyweight vs Singleton: Singleton shares one global instance; Flyweight shares many reusable instances by key.
- Flyweight vs Prototype: Flyweight reuses shared objects; Prototype creates copies.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/structural/flyweight/Flyweight1.java
java -cp out DesignPatterns.structural.flyweight.Flyweight1
javac -d out src/DesignPatterns/structural/flyweight/Flyweight2.java
java -cp out DesignPatterns.structural.flyweight.Flyweight2
javac -d out src/DesignPatterns/structural/flyweight/Flyweight3.java
java -cp out DesignPatterns.structural.flyweight.Flyweight3
```

### Interview Q&A

### What is intrinsic state?

Shared data stored inside the flyweight.

### What is extrinsic state?

Unique data supplied from outside.

### Why use a factory?

To reuse existing flyweights instead of creating duplicates.
