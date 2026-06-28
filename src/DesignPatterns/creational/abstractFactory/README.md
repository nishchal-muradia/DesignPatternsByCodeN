# Abstract Factory Design Pattern in Java

## Overview

Abstract Factory is a creational design pattern.

It is used when we need to create a group of related objects that should be used together.

Instead of creating each object separately with `new`, the client asks one factory to create the complete family.

This prevents mismatched objects, like a Windows button being used with a Mac checkbox in the same UI.

Factory Method usually focuses on creating one product type, while Abstract Factory focuses on creating related product families.

This pattern is common in UI toolkits, furniture families, database families, cloud provider SDKs, and theme-based applications.

For beginners, remember this simple point: Abstract Factory gives you matching objects from one family without exposing their concrete classes.

## Very Simple Meaning

Imagine you are decorating a room.

You do not want to mix random furniture:

- Modern chair with Victorian sofa
- Victorian table with Modern sofa

You want one matching family.

So you ask a factory:

Give me Modern furniture.

That factory gives:

- Modern chair
- Modern sofa
- Modern table

In Java, Abstract Factory does the same thing.

It gives us related objects from the same family.

## Problem Without Abstract Factory

Client code may directly create objects like:

```java
Button button = new WindowsButton();
Checkbox checkbox = new MacCheckbox();
```

This may create a mismatch.

Windows button with Mac checkbox is not one consistent UI family.

Abstract Factory prevents this by grouping product creation inside one factory.

## Main Idea

Instead of creating concrete products directly:

```java
new WindowsButton();
new WindowsCheckbox();
```

We create them through a family factory:

```java
GUIFactory factory = new WindowsFactory();
Button button = factory.createButton();
Checkbox checkbox = factory.createCheckbox();
```

Now the client does not need to know concrete product classes.

## Important Terms

### Abstract Product

Common interface for one product type.

Examples:

- Button
- Checkbox

### Concrete Product

Real implementation of a product.

Examples:

- WindowsButton
- MacButton
- WindowsCheckbox
- MacCheckbox

### Abstract Factory

Common interface that creates related products.

Example:

```java
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
```

### Concrete Factory

Factory that creates one complete family.

Examples:

- WindowsFactory
- MacFactory

## When to Use

Use Abstract Factory when:

- Your application needs families of related objects.
- Objects from one family should be used together.
- You want to switch complete product families easily.
- You want client code to depend on interfaces, not concrete classes.

## Files in This Folder

### AbstractFactory1.java

Shows the problem first.

The client directly creates concrete UI components and can accidentally mix families.

### AbstractFactory2.java

Introduces a simple factory for one product at a time.

This improves object creation, but still does not guarantee a complete matching family.

### AbstractFactory3.java

Shows the proper Abstract Factory structure.

The client receives one factory, and the factory creates all related products.

## One-Line Definition

Abstract Factory is a pattern where one factory creates a complete family of related objects without the client knowing their concrete classes.
---

## Beginner Deep Dive

### Pattern In One Line

Abstract Factory creates families of related objects without exposing concrete classes.

### What Is This Pattern?

Abstract Factory is like a factory of factories. It gives the client one factory object, and that factory creates multiple related products that belong together.

### The Core Problem It Solves

If a UI app manually creates WindowsButton with MacCheckbox, the code compiles but the product family is inconsistent.

### How It Works Step By Step

1. Define interfaces for each product type in the family.
2. Create concrete products for each family.
3. Define an abstract factory interface with methods for every product type.
4. Create one concrete factory per family.
5. Client receives a factory and asks it for related products.

### Main Participants

- Abstract Products: common interfaces like Button and Checkbox.
- Concrete Products: family-specific implementations.
- Abstract Factory: methods for creating each product type.
- Concrete Factory: creates one complete product family.

### Simple Diagram

```text
Client -> GUIFactory
          |-> createButton() -> WindowsButton or MacButton
          |-> createCheckbox() -> WindowsCheckbox or MacCheckbox
```

### When To Use

- Objects must be used as a matching family.
- You need to switch entire families at runtime or configuration time.
- Client code should not know concrete product classes.

### When Not To Use

- Do not use it when you only create one product type.
- Avoid it if product families are unlikely to exist or change.

### Advantages

- Keeps product families consistent.
- Makes family switching clean.
- Hides concrete classes from client code.

### Disadvantages And Trade-Offs

- Adding a new product type requires changing all factories.
- Can introduce many classes.

### Do Not Confuse This With

- Abstract Factory vs Factory Method: Abstract Factory creates related families; Factory Method usually creates one product.
- Abstract Factory vs Builder: Abstract Factory chooses product family; Builder constructs one complex object step by step.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/creational/abstractFactory/AbstractFactory1.java
java -cp out DesignPatterns.creational.abstractFactory.AbstractFactory1
javac -d out src/DesignPatterns/creational/abstractFactory/AbstractFactory2.java
java -cp out DesignPatterns.creational.abstractFactory.AbstractFactory2
javac -d out src/DesignPatterns/creational/abstractFactory/AbstractFactory3.java
java -cp out DesignPatterns.creational.abstractFactory.AbstractFactory3
```

### Interview Q&A

### Why is it called abstract factory?

Because client depends on a factory interface, not a concrete factory.

### What is a product family?

A group of products designed to be used together.

### What is the main benefit?

Consistency between related objects.
