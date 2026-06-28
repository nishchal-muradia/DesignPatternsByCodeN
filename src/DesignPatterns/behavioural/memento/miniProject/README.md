# Text Editor History Mini Project

## Overview

This mini project shows Memento using a text editor.

The editor can:

- Write text
- Save current state
- Undo to previous state

## Pattern Mapping

Originator:

- TextEditor

Memento:

- EditorState

Caretaker:

- EditorHistory

## How to Run

```bash
javac -d out src/DesignPatterns/behavioural/memento/miniProject/*.java
java -cp out DesignPatterns.behavioural.memento.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how an editor can save snapshots and restore a previous state for undo behavior.

### Pattern Mapping

- Originator: TextEditor
- Memento: EditorState
- Caretaker: EditorHistory
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/behavioural/memento/miniProject/*.java
java -cp out DesignPatterns.behavioural.memento.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Hello Design Patterns in Java
Hello Design Patterns
```
