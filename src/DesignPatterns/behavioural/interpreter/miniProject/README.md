# Discount Rule Interpreter Mini Project

## Overview

This mini project shows Interpreter using discount rules.

Rules:

- customer is premium
- cart total is above 5000
- both conditions together

Each rule is an expression object.

## Pattern Mapping

Expression:

- RuleExpression

Terminal Expressions:

- PremiumCustomerRule
- CartTotalRule

Non-terminal Expression:

- AndRule

Context:

- OrderContext

## How to Run

```bash
javac -d out src/DesignPatterns/behavioural/interpreter/miniProject/*.java
java -cp out DesignPatterns.behavioural.interpreter.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how business rules can be represented as expression objects and evaluated against an order context.

### Pattern Mapping

- Expression: RuleExpression
- Terminal Expressions: PremiumCustomerRule, CartTotalRule
- Non-terminal Expression: AndRule
- Context: OrderContext

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/behavioural/interpreter/miniProject/*.java
java -cp out DesignPatterns.behavioural.interpreter.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Discount applied
```
