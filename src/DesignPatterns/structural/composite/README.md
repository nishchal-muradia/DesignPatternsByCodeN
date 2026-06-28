# Composite Design Pattern in Java

## Overview

Composite is a structural design pattern.

It lets us treat individual objects and groups of objects in the same way.

## Very Simple Meaning

A file system has:

- File
- Folder

A folder can contain files and more folders.

Still, we can call `showDetails()` on both file and folder.

That is Composite.

## When to Use

Use Composite when:

- Your data forms a tree structure.
- Single item and group item should share common behavior.
- Client should not worry whether it is dealing with one item or many items.

## Files in This Folder

### Composite1.java

Shows separate handling of files and folders.

### Composite2.java

Introduces a common component interface.

### Composite3.java

Shows nested folder structure.

## One-Line Definition

Composite is a pattern where individual objects and groups implement the same interface so client code can treat them uniformly.
