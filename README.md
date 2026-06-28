# DesignPatternsByCodeN

This repository explains all 23 Gang of Four design patterns in Java.

The teaching style is intentionally beginner-first:

1. Understand the real problem first.
2. Learn the pattern idea in simple language.
3. Read small step-by-step Java examples.
4. Run a mini project that shows where the pattern fits in real code.
5. Compare the pattern with similar patterns so you do not memorize blindly.

## What Is a Design Pattern?

A design pattern is a proven way to solve a common software design problem.

It is not a library, framework, or ready-made code copy.

It is a reusable idea.

For example, if many classes need to be notified when one object changes, Observer gives a clean structure for that. If an object has too many constructor parameters, Builder gives a cleaner construction style.

The main goal is not to use patterns everywhere. The goal is to recognize recurring problems and choose a pattern only when it makes the code easier to understand, extend, and maintain.

## Repository Structure

Every pattern folder contains:

- A detailed `README.md`
- Small learning examples like `Pattern1.java`, `Pattern2.java`, `Pattern3.java`
- A `miniProject` folder
- A mini project `README.md`
- A runnable `App.java`

## Creational Patterns

Creational patterns focus on object creation.

- [Singleton](src/DesignPatterns/creational/singleton/README.md)
- [Factory Method](src/DesignPatterns/creational/factoryMethod/README.md)
- [Abstract Factory](src/DesignPatterns/creational/abstractFactory/README.md)
- [Builder](src/DesignPatterns/creational/builder/README.md)
- [Prototype](src/DesignPatterns/creational/prototype/README.md)

## Structural Patterns

Structural patterns focus on how classes and objects are composed.

- [Adapter](src/DesignPatterns/structural/adapter/README.md)
- [Bridge](src/DesignPatterns/structural/bridge/README.md)
- [Composite](src/DesignPatterns/structural/composite/README.md)
- [Decorator](src/DesignPatterns/structural/decorator/README.md)
- [Facade](src/DesignPatterns/structural/facade/README.md)
- [Flyweight](src/DesignPatterns/structural/flyweight/README.md)
- [Proxy](src/DesignPatterns/structural/proxy/README.md)

## Behavioural Patterns

Behavioural patterns focus on communication and responsibility between objects.

- [Chain of Responsibility](src/DesignPatterns/behavioural/chainOfResponsibility/README.md)
- [Command](src/DesignPatterns/behavioural/command/README.md)
- [Interpreter](src/DesignPatterns/behavioural/interpreter/README.md)
- [Iterator](src/DesignPatterns/behavioural/iterator/README.md)
- [Mediator](src/DesignPatterns/behavioural/mediator/README.md)
- [Memento](src/DesignPatterns/behavioural/memento/README.md)
- [Observer](src/DesignPatterns/behavioural/observer/README.md)
- [State](src/DesignPatterns/behavioural/state/README.md)
- [Strategy](src/DesignPatterns/behavioural/strategy/README.md)
- [Template Method](src/DesignPatterns/behavioural/templateMethod/README.md)
- [Visitor](src/DesignPatterns/behavioural/visitor/README.md)

## Suggested Learning Order

1. Start with Singleton, Factory Method, Builder, and Strategy.
2. Then learn Adapter, Decorator, Facade, and Observer.
3. Then move to Abstract Factory, Prototype, Composite, State, and Command.
4. Finally study Bridge, Flyweight, Chain of Responsibility, Interpreter, Iterator, Mediator, Memento, Template Method, and Visitor.

This order is easier for beginners because it starts with patterns you can immediately connect to daily Java code.

## Safe Run Commands

Use `-d out` so compiled `.class` files go into the `out` folder instead of being created beside source files.

Example learning file:

```bash
javac -d out src/DesignPatterns/creational/builder/Builder2.java
java -cp out DesignPatterns.creational.builder.Builder2
```

Example mini project:

```bash
javac -d out src/DesignPatterns/structural/decorator/miniProject/*.java
java -cp out DesignPatterns.structural.decorator.miniProject.App
```

## How to Study One Pattern

For each pattern:

1. Read the pattern README first.
2. Run `Pattern1.java` to see the problem.
3. Run the next files to see the improvement.
4. Read comments inside the Java files line by line.
5. Run the mini project.
6. Read the comparison section to avoid confusing similar patterns.
7. Ask yourself: would this pattern simplify my current code, or would it only add ceremony?

## Beginner Warning

Do not force design patterns into every program.

A pattern is useful only when it solves a real design problem.

Simple code is better than pattern-heavy code when the requirement is simple.
