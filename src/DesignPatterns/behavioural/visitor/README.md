# Visitor Design Pattern in Java

## Overview

Visitor is a behavioral design pattern.

It is used when we have a stable group of object types, but we need to add new operations on those objects again and again.

Instead of adding every new operation inside the object classes, we create a visitor class for each operation.

Each object accepts the visitor, and the visitor performs the correct operation based on the object's type.

This pattern is common in shopping carts, tax calculation, report generation, compilers, file system tools, and export features.

For beginners, remember this simple point: Visitor moves operations out of the object classes and into separate visitor classes.

## Very Simple Meaning

Imagine a shopping cart with:

- Book
- Laptop

Today you want to calculate price.

Tomorrow you want to calculate tax.

Instead of adding tax logic inside every item class, you create a visitor.

The visitor visits each item and performs the operation.

## When to Use

Use Visitor when:

- You have a stable object structure.
- You need to add many new operations over that structure.
- You do not want to keep changing element classes.

## Files in This Folder

### Visitor1.java

Shows operation inside classes.

### Visitor2.java

Introduces visitor.

### Visitor3.java

Shows adding new operation using another visitor.

## One-Line Definition

Visitor is a pattern where operations are moved into visitor classes that visit elements.
---

## Beginner Deep Dive

### Pattern In One Line

Visitor lets you add new operations to object structures without changing element classes.

### What Is This Pattern?

Elements accept a visitor. The visitor contains operation logic for each element type. This is useful when the object structure is stable but operations keep changing.

### The Core Problem It Solves

Adding every new operation inside element classes makes those classes change again and again.

### How It Works Step By Step

1. Define a visitor interface with visit methods for each element type.
2. Each element implements accept(visitor).
3. Inside accept, element calls visitor.visit(this).
4. Create concrete visitors for each operation.
5. Client runs visitors over elements.

### Main Participants

- Visitor: declares visit methods.
- Concrete Visitor: implements one operation.
- Element: declares accept().
- Concrete Element: calls visitor.visit(this).

### Simple Diagram

```text
Client -> Element.accept(visitor) -> Visitor.visit(Element)
```

### When To Use

- Object structure is stable.
- You need to add many operations.
- Operations do not naturally belong inside element classes.

### When Not To Use

- Do not use it if element classes change often.
- Avoid it for small structures with only one operation.

### Advantages

- Adds operations without changing element classes.
- Keeps related operation logic in one visitor.
- Good for reports, exports, tax calculations, compilers.

### Disadvantages And Trade-Offs

- Adding a new element type requires changing all visitors.
- Can feel complex for beginners.

### Do Not Confuse This With

- Visitor vs Iterator: Iterator traverses elements; Visitor performs operations on elements.
- Visitor vs Strategy: Strategy swaps one algorithm; Visitor adds operations across multiple element types.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/behavioural/visitor/Visitor1.java
java -cp out DesignPatterns.behavioural.visitor.Visitor1
javac -d out src/DesignPatterns/behavioural/visitor/Visitor2.java
java -cp out DesignPatterns.behavioural.visitor.Visitor2
javac -d out src/DesignPatterns/behavioural/visitor/Visitor3.java
java -cp out DesignPatterns.behavioural.visitor.Visitor3
```

### Interview Q&A

### What method does an element expose?

accept(visitor).

### When is Visitor best?

When elements are stable but operations change.

### What is the downside?

Adding new element types requires updating visitors.
