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
javac src/DesignPatterns/structural/flyweight/miniProject/App.java
java -cp src DesignPatterns.structural.flyweight.miniProject.App
```
