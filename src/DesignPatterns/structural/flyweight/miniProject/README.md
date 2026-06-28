# Map Marker Flyweight Mini Project

## Overview

This mini project shows Flyweight using map markers.

A map may show thousands of markers.

Many markers share the same icon:

- Hospital icon
- Restaurant icon
- School icon

Flyweight stores each icon style once and reuses it.

## Pattern Mapping

Flyweight:

- MarkerStyle

Flyweight Factory:

- MarkerStyleFactory

Context object:

- MapMarker

## How to Run

```bash
javac -d out src/DesignPatterns/structural/flyweight/miniProject/*.java
java -cp out DesignPatterns.structural.flyweight.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how marker styles can be shared instead of recreated for every marker on a map.

### Pattern Mapping

- Flyweight: MarkerStyle
- Flyweight Factory: MarkerStyleFactory
- Context: MapMarker
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/structural/flyweight/miniProject/*.java
java -cp out DesignPatterns.structural.flyweight.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Created marker style: Hospital-Red
Created marker style: Restaurant-Orange
Hospital marker at 10,20 color=Red
Hospital marker at 30,40 color=Red
Restaurant marker at 50,60 color=Orange
```
