# Composite Design Pattern in Java

## Overview

Composite is a structural design pattern.

It is used when objects are arranged in a tree-like structure.

Some objects are individual items, called leaves. Some objects are groups that contain more items, called composites.

Both leaf and composite classes implement the same interface, so the client can treat one item and a group of items in the same way.

This pattern is common in file systems, organization charts, menu systems, UI component trees, and category hierarchies.

For beginners, remember this simple point: Composite lets single objects and groups behave through one common interface.

## Very Simple Meaning

A file system has:

- File
- Folder

A folder can contain files and more folders.

Still, we can call `showDetails()` on both file and folder.

That is Composite.

## When to Use

Use Composite when:

- Your data forms a tree structure.
- Single item and group item should share common behavior.
- Client should not worry whether it is dealing with one item or many items.

## Files in This Folder

### Composite1.java

Shows separate handling of files and folders.

### Composite2.java

Introduces a common component interface.

### Composite3.java

Shows nested folder structure.

## One-Line Definition

Composite is a pattern where individual objects and groups implement the same interface so client code can treat them uniformly.
---

## Beginner Deep Dive

### Pattern In One Line

Composite lets single objects and groups of objects be treated the same way.

### What Is This Pattern?

Composite represents tree structures. Leaf objects and container objects implement the same component interface, so client code can call the same method on both.

### The Core Problem It Solves

Client code becomes full of checks when it must handle individual items and groups differently.

### How It Works Step By Step

1. Create a common component interface.
2. Create leaf classes for individual objects.
3. Create composite classes that store child components.
4. Composite methods loop through children and delegate behavior.
5. Client uses the component interface for both leaf and group.

### Main Participants

- Component: common interface.
- Leaf: single object with no children.
- Composite: object that contains child components.
- Client: treats leaf and composite uniformly.

### Simple Diagram

```text
Component
  |-- Leaf
  |-- Composite -> contains many Component objects
```

### When To Use

- You have tree-like data.
- Groups and individual objects share behavior.
- Client should not care whether it has one item or many.

### When Not To Use

- Do not use it for flat data with no tree structure.
- Avoid it if leaf and group behavior are completely unrelated.

### Advantages

- Simplifies tree traversal.
- Uniform treatment of single and grouped objects.
- Makes recursive structures natural.

### Disadvantages And Trade-Offs

- Can make the interface too general.
- Some operations may not make sense for leaf objects.

### Do Not Confuse This With

- Composite vs Decorator: Composite groups objects; Decorator wraps one object to add behavior.
- Composite vs Iterator: Composite structures a tree; Iterator traverses a collection.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/structural/composite/Composite1.java
java -cp out DesignPatterns.structural.composite.Composite1
javac -d out src/DesignPatterns/structural/composite/Composite2.java
java -cp out DesignPatterns.structural.composite.Composite2
javac -d out src/DesignPatterns/structural/composite/Composite3.java
java -cp out DesignPatterns.structural.composite.Composite3
```

### Interview Q&A

### What is a leaf?

An individual object with no children.

### What is a composite?

An object that contains child components.

### Where is it used?

File systems, menus, organization charts, UI component trees.
