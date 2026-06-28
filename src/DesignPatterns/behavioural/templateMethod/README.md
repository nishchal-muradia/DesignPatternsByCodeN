# Template Method Design Pattern in Java

## Overview

Template Method is a behavioral design pattern.

It is used when multiple classes follow the same overall process, but a few steps in that process are different.

The parent class defines the fixed order of the algorithm. Child classes are allowed to customize only selected steps.

This keeps the common flow in one place and prevents repeated code across similar classes.

This pattern is common in report generation, data import flows, test frameworks, beverage preparation examples, and file processing.

For beginners, remember this simple point: Template Method fixes the skeleton of an algorithm and lets subclasses fill in the changing parts.

## Very Simple Meaning

Making tea and coffee has similar steps:

1. Boil water
2. Add main ingredient
3. Pour in cup
4. Add extra item

The overall process is same.

Some steps differ.

Template Method keeps common flow in one place.

## When to Use

Use Template Method when:

- Algorithm has fixed structure.
- Some steps vary between subclasses.
- You want to avoid duplicated process code.

## Files in This Folder

### TemplateMethod1.java

Shows duplicated process code.

### TemplateMethod2.java

Introduces template method.

### TemplateMethod3.java

Shows hook method.

## One-Line Definition

Template Method is a pattern where a parent class defines algorithm steps and child classes customize selected steps.
---

## Beginner Deep Dive

### Pattern In One Line

Template Method defines a fixed algorithm skeleton and lets subclasses fill selected steps.

### What Is This Pattern?

A parent class controls the order of steps. Child classes override only the steps that vary.

### The Core Problem It Solves

Multiple classes repeat the same process structure with small differences.

### How It Works Step By Step

1. Put the fixed algorithm in a final template method.
2. Move common steps into parent class.
3. Make variable steps abstract or protected.
4. Subclasses implement the variable steps.
5. Optional hook methods allow controlled customization.

### Main Participants

- Abstract Class: defines template method.
- Template Method: fixed algorithm order.
- Primitive Operations: steps implemented by subclasses.
- Concrete Class: fills variable steps.

### Simple Diagram

```text
templateMethod()
  -> fixedStep()
  -> customStep()
  -> fixedStep()
```

### When To Use

- Algorithm order must stay fixed.
- Several classes share a process skeleton.
- Only some steps differ.

### When Not To Use

- Do not use it if subclasses need completely different algorithms.
- Avoid deep inheritance just for small reuse.

### Advantages

- Avoids duplicate process code.
- Keeps algorithm order controlled.
- Subclasses customize only required steps.

### Disadvantages And Trade-Offs

- Uses inheritance, so flexibility is limited compared to composition.
- Parent class can become hard to change if too rigid.

### Do Not Confuse This With

- Template Method vs Strategy: Template Method uses inheritance; Strategy uses composition.
- Template Method vs Builder: Template Method defines algorithm flow; Builder constructs objects step by step.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/behavioural/templateMethod/TemplateMethod1.java
java -cp out DesignPatterns.behavioural.templateMethod.TemplateMethod1
javac -d out src/DesignPatterns/behavioural/templateMethod/TemplateMethod2.java
java -cp out DesignPatterns.behavioural.templateMethod.TemplateMethod2
javac -d out src/DesignPatterns/behavioural/templateMethod/TemplateMethod3.java
java -cp out DesignPatterns.behavioural.templateMethod.TemplateMethod3
```

### Interview Q&A

### Why make template method final?

So subclasses cannot change the algorithm order.

### What is a hook?

An optional method subclass can override to influence the flow.

### What does child class customize?

Only selected steps.
