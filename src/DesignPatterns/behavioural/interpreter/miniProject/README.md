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
javac src/DesignPatterns/behavioural/interpreter/miniProject/App.java
java -cp src DesignPatterns.behavioural.interpreter.miniProject.App
```
