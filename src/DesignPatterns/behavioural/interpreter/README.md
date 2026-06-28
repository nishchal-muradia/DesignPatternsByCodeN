# Interpreter Design Pattern in Java

## Overview

Interpreter is a behavioral design pattern.

It defines a grammar and uses classes to interpret sentences or expressions from that grammar.

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
