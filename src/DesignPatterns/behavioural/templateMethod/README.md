# Template Method Design Pattern in Java

## Overview

Template Method is a behavioral design pattern.

It defines the fixed steps of an algorithm in a parent class.

Child classes fill in some steps.

## Very Simple Meaning

Making tea and coffee has similar steps:

1. Boil water
2. Add main ingredient
3. Pour in cup
4. Add extra item

The overall process is same.

Some steps differ.

Template Method keeps common flow in one place.

## When to Use

Use Template Method when:

- Algorithm has fixed structure.
- Some steps vary between subclasses.
- You want to avoid duplicated process code.

## Files in This Folder

### TemplateMethod1.java

Shows duplicated process code.

### TemplateMethod2.java

Introduces template method.

### TemplateMethod3.java

Shows hook method.

## One-Line Definition

Template Method is a pattern where a parent class defines algorithm steps and child classes customize selected steps.
