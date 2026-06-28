# Builder Design Pattern in Java

## Overview

Builder is a creational design pattern.

It helps us create complex objects step by step.

Builder is useful when a class has many fields, and not every field is always required.

## Very Simple Meaning

Imagine ordering a burger.

You may choose:

- Bun
- Patty
- Cheese
- Sauce
- Extra vegetables
- Extra fries

Not every customer wants every option.

Instead of creating many constructors for every combination, we use a builder.

## Problem Without Builder

Suppose a class has many fields:

```java
User user = new User("Nishchal", "Delhi", "9999999999", true, false, "Admin");
```

This is hard to read.

What does `true` mean?
What does `false` mean?
What if we pass values in wrong order?

This is called the telescoping constructor problem.

## Main Idea

Instead of passing everything in one constructor:

```java
User user = new User(...);
```

We build the object step by step:

```java
User user = new User.Builder("Nishchal")
        .city("Delhi")
        .phone("9999999999")
        .admin(true)
        .build();
```

Now the code is readable.

## When to Use

Use Builder when:

- Object has many constructor parameters.
- Some parameters are optional.
- Object creation should be readable.
- You want validation before final object creation.
- You want immutable objects with flexible creation.

## Files in This Folder

### Builder1.java

Shows the problem with too many constructor parameters.

### Builder2.java

Introduces a simple builder.

### Builder3.java

Adds validation and shows how builder makes object creation safer.

## One-Line Definition

Builder is a pattern where we create a complex object step by step instead of passing many values into one large constructor.
