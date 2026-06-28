# Iterator Design Pattern in Java

## Overview

Iterator is a behavioral design pattern.

It lets us access elements of a collection one by one without exposing how the collection is stored internally.

## Very Simple Meaning

You may have songs stored in an array, list, or custom collection.

The user should not care about internal storage.

They just need:

- hasNext()
- next()

## When to Use

Use Iterator when:

- You want to traverse a collection.
- You do not want to expose internal data structure.
- You want a common traversal style for different collections.

## Files in This Folder

### Iterator1.java

Shows direct array traversal.

### Iterator2.java

Introduces custom iterator.

### Iterator3.java

Shows a collection that provides its own iterator.

## One-Line Definition

Iterator is a pattern where a separate object controls how to move through a collection.
