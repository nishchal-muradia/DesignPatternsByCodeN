# Strategy Design Pattern in Java

## Overview

Strategy is a behavioral design pattern.

It is used when we have multiple ways to perform the same task and we want to choose one of them cleanly.

Instead of writing a big `if-else` block for every algorithm, we put each algorithm into its own strategy class.

The main class, called the context, does not implement the algorithm itself. It delegates the work to the selected strategy object.

This pattern is common in payment methods, sorting algorithms, shipping cost calculation, discount calculation, and compression logic.

For beginners, remember this simple point: Strategy lets you swap behavior without changing the class that uses the behavior.

## Very Simple Meaning

Think about payment methods.

You can pay by:

- Credit card
- UPI
- Wallet

Checkout flow is same.

Payment algorithm changes.

Strategy keeps each algorithm in a separate class.

## When to Use

Use Strategy when:

- You have multiple ways to perform the same task.
- You want to avoid big if-else blocks.
- You want to switch behavior at runtime.

## Files in This Folder

### Strategy1.java

Shows if-else based algorithm selection.

### Strategy2.java

Introduces strategy interface.

### Strategy3.java

Shows runtime strategy switching.

## One-Line Definition

Strategy is a pattern where each algorithm is placed in a separate class and selected by the client or context.
---

## Beginner Deep Dive

### Pattern In One Line

Strategy lets you switch algorithms through interchangeable classes.

### What Is This Pattern?

Strategy defines a family of algorithms behind one interface. The context delegates work to the selected strategy.

### The Core Problem It Solves

A method becomes full of if-else checks for different algorithms like CARD, UPI, WALLET.

### How It Works Step By Step

1. Define a strategy interface.
2. Create one class per algorithm.
3. Context stores a strategy reference.
4. Client chooses or changes the strategy.
5. Context delegates algorithm work to strategy.

### Main Participants

- Strategy: common algorithm interface.
- Concrete Strategy: one algorithm implementation.
- Context: uses selected strategy.
- Client: chooses strategy.

### Simple Diagram

```text
Client -> Context -> Strategy interface -> ConcreteStrategy
```

### When To Use

- You have multiple algorithms for the same task.
- You want to switch behavior at runtime.
- You want to remove algorithm if-else blocks.

### When Not To Use

- Do not use it when there is only one algorithm.
- Avoid it if simple if-else is clearer and unlikely to grow.

### Advantages

- Algorithms are isolated.
- Easy to add new strategies.
- Runtime behavior switching is clean.

### Disadvantages And Trade-Offs

- Adds more classes.
- Client must know which strategy to choose.

### Do Not Confuse This With

- Strategy vs State: Strategy is selected algorithm; State represents lifecycle behavior.
- Strategy vs Command: Strategy performs an algorithm now; Command stores an action request.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/behavioural/strategy/Strategy1.java
java -cp out DesignPatterns.behavioural.strategy.Strategy1
javac -d out src/DesignPatterns/behavioural/strategy/Strategy2.java
java -cp out DesignPatterns.behavioural.strategy.Strategy2
javac -d out src/DesignPatterns/behavioural/strategy/Strategy3.java
java -cp out DesignPatterns.behavioural.strategy.Strategy3
```

### Interview Q&A

### What does Strategy replace?

Algorithm-based if-else or switch blocks.

### Who selects the strategy?

Usually the client or configuration.

### Can strategy change at runtime?

Yes.
