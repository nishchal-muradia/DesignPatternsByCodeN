# DesignPatternsByCodeN

This repository explains the Gang of Four design patterns in Java with beginner-friendly examples.
This repository covers a total of 23 design patterns.

The goal of every pattern folder is:

1. Explain the pattern in a simple README.
2. Show the problem first.
3. Improve the code step by step.
4. End with a small mini project so the pattern feels practical.



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

Start with Creational patterns because they are easiest to connect with object creation.

Then move to Structural patterns to understand object composition.

Finally, study Behavioural patterns to understand how objects communicate.

## How to Run Any Example

From the project root:

```bash
javac src/DesignPatterns/creational/builder/Builder2.java
java -cp src DesignPatterns.creational.builder.Builder2
```

For mini projects:

```bash
javac src/DesignPatterns/structural/decorator/miniProject/App.java
java -cp src DesignPatterns.structural.decorator.miniProject.App
```

Each pattern folder has its own README and mini project README.
