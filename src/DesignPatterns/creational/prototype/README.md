# Prototype Design Pattern in Java

## Overview

Prototype is a creational design pattern.

It is used when creating an object from scratch is costly, repetitive, or requires many default values.

Instead of rebuilding the object again and again, we create one ready object and copy it whenever a similar object is needed.

The ready object is called the prototype, and the copied object can be customized after copying.

This pattern is useful when objects act like templates, such as documents, reports, game objects, shapes, or configuration presets.

For beginners, remember this simple point: Prototype creates new objects by copying an existing prepared object.

## Very Simple Meaning

Imagine you have one resume format.

Instead of creating the same resume layout again and again from zero, you copy the existing resume and change only name, skills, or experience.

That is Prototype.

## Problem Without Prototype

Some objects are expensive to create.

They may need:

- Database calls
- File loading
- Network calls
- Many default fields
- Complex setup

If we create such objects from scratch every time, it can be slow and repetitive.

## Main Idea

Create one ready object first.

Then create new objects by copying it.

```java
Document copy = original.copy();
```

Now `copy` has the same base data as `original`, and we can change only what is different.

## Shallow Copy vs Deep Copy

### Shallow Copy

Copies field values.

If a field refers to another object, both original and copy may point to the same nested object.

### Deep Copy

Copies field values and also creates new copies of nested objects.

Deep copy is safer when the object has mutable nested data.

## When to Use

Use Prototype when:

- Object creation is costly.
- You need many similar objects.
- You want to avoid repeating setup logic.
- You want runtime object cloning.

## Files in This Folder

### Prototype1.java

Shows the problem with manually creating similar objects.

### Prototype2.java

Introduces a copy method.

### Prototype3.java

Shows a prototype registry where ready templates are stored and cloned.

## One-Line Definition

Prototype is a pattern where we create new objects by copying existing ready-made objects.
---

## Beginner Deep Dive

### Pattern In One Line

Prototype creates new objects by copying existing prepared objects.

### What Is This Pattern?

Prototype is useful when object setup is expensive or repetitive. You prepare one object, then clone or copy it whenever you need a similar object.

### The Core Problem It Solves

Creating many similar objects from scratch repeats the same setup and can be slow or error-prone.

### How It Works Step By Step

1. Create a base object with common data.
2. Add a copy or clone method.
3. When a new object is needed, copy the prototype.
4. Change only the fields that are different.
5. Use a registry if multiple prototype templates are needed.

### Main Participants

- Prototype: object that knows how to copy itself.
- Concrete Prototype: actual copyable object.
- Registry: optional storage of named prototypes.
- Client: asks for a copy and customizes it.

### Simple Diagram

```text
Client -> PrototypeRegistry -> copy of Prototype -> customize fields
```

### When To Use

- Object creation is costly.
- You need many similar objects.
- Templates or default objects are reused often.

### When Not To Use

- Do not use it if objects are simple and cheap to create.
- Be careful if the object contains mutable nested objects.

### Advantages

- Avoids repeated setup.
- Can improve performance.
- Useful for template-based object creation.

### Disadvantages And Trade-Offs

- Deep copy can be tricky.
- Copying mutable references incorrectly can create bugs.

### Do Not Confuse This With

- Prototype vs Builder: Prototype copies an existing object; Builder constructs a new object step by step.
- Prototype vs Factory Method: Prototype clones existing objects; Factory Method creates new objects through creator logic.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/creational/prototype/Prototype1.java
java -cp out DesignPatterns.creational.prototype.Prototype1
javac -d out src/DesignPatterns/creational/prototype/Prototype2.java
java -cp out DesignPatterns.creational.prototype.Prototype2
javac -d out src/DesignPatterns/creational/prototype/Prototype3.java
java -cp out DesignPatterns.creational.prototype.Prototype3
```

### Interview Q&A

### What is a prototype?

A ready object used as the base for copies.

### What is deep copy?

Copying the object and its nested mutable objects.

### What is a registry?

A map of named prototypes that clients can request copies from.
