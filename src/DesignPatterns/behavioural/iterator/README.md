# Iterator Design Pattern in Java

## Overview

Iterator is a behavioral design pattern.

It is used when we want to go through a collection one item at a time without exposing how that collection stores data internally.

The collection may use an array, list, tree, linked structure, or any custom storage. The client should not need to know that.

Iterator gives the client a common way to move through items, usually with methods like `hasNext()` and `next()`.

This pattern is common in playlists, menus, file collections, custom lists, and Java collections.

For beginners, remember this simple point: Iterator separates traversal logic from the collection's internal structure.

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
---

## Beginner Deep Dive

### Pattern In One Line

Iterator lets you access collection items one by one without exposing internal storage.

### What Is This Pattern?

Iterator separates traversal logic from the collection. The client uses hasNext() and next() instead of knowing whether data is stored in an array, list, tree, or custom structure.

### The Core Problem It Solves

Client code becomes dependent on the collection's internal representation.

### How It Works Step By Step

1. Define an iterator interface.
2. Collection creates and returns an iterator.
3. Iterator stores current position.
4. Client loops using hasNext() and next().
5. Collection internals remain hidden.

### Main Participants

- Iterator: hasNext() and next().
- Concrete Iterator: traversal logic.
- Aggregate: collection that creates iterator.
- Client: uses iterator to traverse.

### Simple Diagram

```text
Client -> Iterator -> Collection internals hidden
```

### When To Use

- You want standard traversal.
- Collection internals should stay private.
- Different collections need a common traversal style.

### When Not To Use

- Do not create a custom iterator if Java's built-in Iterator is enough.
- Avoid it for one-off simple loops where internals are already public and stable.

### Advantages

- Hides internal collection structure.
- Multiple traversal strategies are possible.
- Client code becomes cleaner.

### Disadvantages And Trade-Offs

- Adds extra classes for custom collections.
- Iterator state must be handled carefully.

### Do Not Confuse This With

- Iterator vs Composite: Composite models tree structure; Iterator traverses a collection.
- Iterator vs Visitor: Iterator moves through elements; Visitor performs operations on elements.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/behavioural/iterator/Iterator1.java
java -cp out DesignPatterns.behavioural.iterator.Iterator1
javac -d out src/DesignPatterns/behavioural/iterator/Iterator2.java
java -cp out DesignPatterns.behavioural.iterator.Iterator2
javac -d out src/DesignPatterns/behavioural/iterator/Iterator3.java
java -cp out DesignPatterns.behavioural.iterator.Iterator3
```

### Interview Q&A

### What methods are common in Iterator?

hasNext() and next().

### What does Iterator hide?

The internal storage structure.

### Does Java already have Iterator?

Yes, java.util.Iterator.
