# Visitor Design Pattern in Java

## Overview

Visitor is a behavioral design pattern.

It lets us add new operations to existing object structures without changing their classes.

## Very Simple Meaning

Imagine a shopping cart with:

- Book
- Laptop

Today you want to calculate price.

Tomorrow you want to calculate tax.

Instead of adding tax logic inside every item class, you create a visitor.

The visitor visits each item and performs the operation.

## When to Use

Use Visitor when:

- You have a stable object structure.
- You need to add many new operations over that structure.
- You do not want to keep changing element classes.

## Files in This Folder

### Visitor1.java

Shows operation inside classes.

### Visitor2.java

Introduces visitor.

### Visitor3.java

Shows adding new operation using another visitor.

## One-Line Definition

Visitor is a pattern where operations are moved into visitor classes that visit elements.
