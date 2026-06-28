# Prototype Design Pattern in Java

## Overview

Prototype is a creational design pattern.

It helps us create new objects by copying existing objects.

The existing object is called the prototype.

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
