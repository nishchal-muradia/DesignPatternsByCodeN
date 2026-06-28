# Builder Design Pattern in Java

## Overview

Builder is a creational design pattern.

It is used when an object has many fields, especially when some fields are required and many fields are optional.

Instead of creating a huge constructor with many parameters, we create the object step by step using readable method names.

This makes object creation easier to understand because each value clearly says what it represents.

Builder also gives us one clean place to validate data before the final object is created.

This pattern is common in user profiles, food orders, HTTP requests, database queries, configuration objects, and report builders.

For beginners, remember this simple point: Builder makes complex object creation readable and safe.

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
---

## Beginner Deep Dive

### Pattern In One Line

Builder creates complex objects step by step with readable method calls.

### What Is This Pattern?

Builder separates object construction from the final object. Instead of passing many constructor arguments, the client calls named builder methods and then build().

### The Core Problem It Solves

Large constructors become hard to read, especially when many fields are optional or several arguments have the same type.

### How It Works Step By Step

1. Keep required fields in the builder constructor.
2. Add methods for optional fields.
3. Return this from builder methods so calls can be chained.
4. Validate data inside build().
5. Create the final object from builder values.

### Main Participants

- Product: the final object being built.
- Builder: temporarily stores values and exposes step methods.
- build(): validates and creates the product.

### Simple Diagram

```text
Client -> Builder -> set option -> set option -> build() -> Product
```

### When To Use

- A class has many constructor parameters.
- Many fields are optional.
- You want readable object creation.
- You want immutable objects with flexible setup.

### When Not To Use

- Do not use it for very small classes with one or two fields.
- Avoid it if the object has no optional or complex setup.

### Advantages

- Readable object creation.
- Avoids telescoping constructors.
- Validation can live in one place.

### Disadvantages And Trade-Offs

- Adds extra builder code.
- Can be unnecessary for simple objects.

### Do Not Confuse This With

- Builder vs Factory Method: Builder assembles one complex object; Factory Method chooses which object type to create.
- Builder vs Abstract Factory: Builder focuses on construction steps; Abstract Factory focuses on related product families.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/creational/builder/Builder1.java
java -cp out DesignPatterns.creational.builder.Builder1
javac -d out src/DesignPatterns/creational/builder/Builder2.java
java -cp out DesignPatterns.creational.builder.Builder2
javac -d out src/DesignPatterns/creational/builder/Builder3.java
java -cp out DesignPatterns.creational.builder.Builder3
```

### Interview Q&A

### What problem does Builder solve?

Too many constructor parameters and unreadable object creation.

### Why return this from builder methods?

To allow method chaining.

### Where should validation happen?

Usually inside build().
