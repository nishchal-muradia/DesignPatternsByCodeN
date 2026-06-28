# Memento Design Pattern in Java

## Overview

Memento is a behavioral design pattern.

It saves and restores an object's previous state without exposing internal details.

## Very Simple Meaning

Think about undo in a text editor.

Before changing text, editor saves a snapshot.

If user clicks undo, editor restores old snapshot.

That snapshot is a memento.

## When to Use

Use Memento when:

- You need undo/redo.
- You want to save object state safely.
- You do not want outside classes to change internal state directly.

## Files in This Folder

### Memento1.java

Shows the problem without undo.

### Memento2.java

Introduces one saved state.

### Memento3.java

Uses history stack for multiple undo.

## One-Line Definition

Memento is a pattern where an object saves snapshots of its state so it can restore them later.
