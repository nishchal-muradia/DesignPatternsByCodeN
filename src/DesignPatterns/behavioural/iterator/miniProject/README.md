# Playlist Iterator Mini Project

## Overview

This mini project shows Iterator using a music playlist.

The playlist stores songs internally.

The client does not access the internal array directly.

It uses an iterator.

## Pattern Mapping

Iterator:

- SongIterator

Aggregate:

- Playlist

Client:

- App

## How to Run

```bash
javac -d out src/DesignPatterns/behavioural/iterator/miniProject/*.java
java -cp out DesignPatterns.behavioural.iterator.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how a playlist can expose traversal without exposing its internal array.

### Pattern Mapping

- Iterator: SongIterator
- Concrete Iterator: PlaylistIterator
- Aggregate: Playlist
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/behavioural/iterator/miniProject/*.java
java -cp out DesignPatterns.behavioural.iterator.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Playing: Believer
Playing: Perfect
Playing: Faded
```
