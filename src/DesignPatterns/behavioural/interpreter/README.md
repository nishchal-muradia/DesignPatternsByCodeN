# Interpreter Design Pattern in Java

## Overview

Interpreter is a behavioral design pattern.

It is used when a program needs to understand a small language, rule, or expression.

Instead of keeping all parsing and rule-checking logic in one large method, we represent each grammar rule as a separate class.

Each expression class knows how to interpret one part of the sentence, and complex expressions are built by combining smaller expressions.

This pattern is common in calculators, search filters, permission rules, validation rules, and simple business rule engines.

For beginners, remember this simple point: Interpreter is useful when your code needs to read and evaluate grammar-like rules.

## Very Simple Meaning

Think about a calculator.

Expression:

```text
5 + 10
```

The calculator understands numbers and plus operation.

Interpreter pattern represents each part as an object and evaluates the expression.

## When to Use

Use Interpreter when:

- You have a small language or rule format.
- Rules can be represented as expressions.
- You want each grammar rule as a class.

## Files in This Folder

### Interpreter1.java

Shows hardcoded calculation.

### Interpreter2.java

Introduces expression objects.

### Interpreter3.java

Adds variables through a context map.

## One-Line Definition

Interpreter is a pattern where grammar rules are represented as classes that can interpret or evaluate expressions.
---

## Beginner Deep Dive

### Pattern In One Line

Interpreter represents grammar rules as classes that evaluate expressions.

### What Is This Pattern?

Interpreter is useful for small languages or rule systems. Each grammar rule becomes an expression class with an interpret method.

### The Core Problem It Solves

Rule parsing and evaluation can become messy if all logic is hardcoded in one place.

### How It Works Step By Step

1. Define an expression interface.
2. Create terminal expressions for simple values.
3. Create non-terminal expressions for combined rules.
4. Use a context object or map for external values.
5. Call interpret() on the root expression.

### Main Participants

- Expression: common interpret method.
- Terminal Expression: basic value or rule.
- Non-terminal Expression: combines expressions.
- Context: external data used while interpreting.

### Simple Diagram

```text
Expression
  |-- TerminalExpression
  |-- NonTerminalExpression -> left Expression + right Expression
```

### When To Use

- You have a small rule language.
- Rules can be represented as expression trees.
- Rules change more often than surrounding code.

### When Not To Use

- Do not use it for large programming languages.
- Use a real parser library for complex grammar.

### Advantages

- Makes simple grammar rules explicit.
- Easy to add new expression types.
- Good for small rule engines.

### Disadvantages And Trade-Offs

- Can create many expression classes.
- Not suitable for complex grammar.

### Do Not Confuse This With

- Interpreter vs Strategy: Interpreter evaluates expression trees; Strategy swaps algorithms.
- Interpreter vs Visitor: Visitor adds operations over object structures; Interpreter evaluates grammar objects.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/behavioural/interpreter/Interpreter1.java
java -cp out DesignPatterns.behavioural.interpreter.Interpreter1
javac -d out src/DesignPatterns/behavioural/interpreter/Interpreter2.java
java -cp out DesignPatterns.behavioural.interpreter.Interpreter2
javac -d out src/DesignPatterns/behavioural/interpreter/Interpreter3.java
java -cp out DesignPatterns.behavioural.interpreter.Interpreter3
```

### Interview Q&A

### What is terminal expression?

A basic expression that does not contain other expressions.

### What is non-terminal expression?

An expression that combines other expressions.

### Where is context used?

To provide external values like variables.
