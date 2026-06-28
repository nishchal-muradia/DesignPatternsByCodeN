# Abstract Factory Design Pattern in Java

## Overview

Abstract Factory is a creational design pattern.

It helps us create families of related objects without exposing their concrete classes to the client.

Factory Method usually creates one product type.

Abstract Factory creates a group of related product types.

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
