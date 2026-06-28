# Singleton Design Pattern in Java

## Overview

Singleton is a creational design pattern.

It is used when exactly one object of a class should exist in the entire application.

Instead of allowing every part of the code to create a new object with `new`, the class controls its own object creation.

The class usually has a private constructor, a static instance variable, and a static method like `getInstance()` to return the same object every time.

This pattern is common in configuration managers, logging systems, cache managers, application settings, and shared registries.

For beginners, remember this simple point: Singleton is useful when one shared object should coordinate something globally and multiple objects would create confusion.

## Key Features

- Single Instance: Only one object of the class exists throughout the application.
- Global Access: The instance can be accessed from anywhere using a static method.
- Lazy Initialization: The instance can be created only when it is first needed.
- Thread-Safe: It can be implemented carefully so multiple threads do not create multiple instances.

## When to Use Singleton

- Logging systems
- Configuration manager
- Database connection pool
- Caching mechanisms
- Shared registry or global settings
---

## Beginner Deep Dive

### Pattern In One Line

Singleton makes sure a class has only one object and gives one common access point to that object.

### What Is This Pattern?

Singleton is used when one shared object should coordinate something for the whole application. The class protects its constructor, stores its own static instance, and exposes a method like getInstance() so callers receive the same object every time.

### The Core Problem It Solves

Without Singleton, different parts of the application may create many separate objects for something that should be centralized, such as configuration, logging, cache, or a shared registry.

### How It Works Step By Step

1. Make the constructor private so outside code cannot call new directly.
2. Keep a static reference to the single object inside the class.
3. Expose a static access method, usually getInstance().
4. Create the object eagerly or lazily depending on the requirement.
5. Handle thread safety if multiple threads can call getInstance() together.

### Main Participants

- Singleton class: owns the one allowed instance.
- Private constructor: blocks direct object creation.
- Static instance field: stores the shared object.
- Static access method: returns the shared object to callers.

### Simple Diagram

```text
Client A ----\
Client B ----- getInstance() -> Singleton instance
Client C ----/
```

### When To Use

- A single configuration manager is needed.
- A logger should be shared across the application.
- A cache or registry should be centrally controlled.
- Creating many instances would create inconsistent state.

### When Not To Use

- Do not use it just to avoid passing dependencies properly.
- Do not use it for objects that naturally need multiple independent instances.
- Avoid it when global mutable state will make tests hard.

### Advantages

- Centralized access to one shared object.
- Can save memory when one object is enough.
- Lazy versions can create the object only when needed.

### Disadvantages And Trade-Offs

- Can become hidden global state.
- Thread safety must be handled carefully.
- Can make unit testing harder if overused.

### Do Not Confuse This With

- Singleton vs static class: Singleton can implement interfaces and can be lazily initialized; a static utility class is only a group of static methods.
- Singleton vs dependency injection: DI is often cleaner for testability; Singleton is useful only when one global instance is truly part of the design.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/creational/singleton/Singleton1.java
java -cp out DesignPatterns.creational.singleton.Singleton1
javac -d out src/DesignPatterns/creational/singleton/Singleton2.java
java -cp out DesignPatterns.creational.singleton.Singleton2
javac -d out src/DesignPatterns/creational/singleton/Singleton3.java
java -cp out DesignPatterns.creational.singleton.Singleton3
javac -d out src/DesignPatterns/creational/singleton/Singleton4.java
java -cp out DesignPatterns.creational.singleton.Singleton4
javac -d out src/DesignPatterns/creational/singleton/Singleton5.java
java -cp out DesignPatterns.creational.singleton.Singleton5
```

### Interview Q&A

### Why private constructor?

So outside code cannot create extra objects with new.

### What is lazy Singleton?

The instance is created only when getInstance() is called for the first time.

### Why is thread safety important?

Two threads may try to create the instance at the same time and accidentally create two objects.
