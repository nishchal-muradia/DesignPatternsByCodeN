# Furniture Store Mini Project

## Overview

This mini project shows Abstract Factory using a furniture store.

The store can create matching furniture families:

- Modern furniture
- Victorian furniture

Each family has:

- Chair
- Sofa
- Coffee table

## Why Abstract Factory Here?

We do not want to accidentally create:

- Modern chair
- Victorian sofa
- Modern coffee table

That room will feel inconsistent.

So the app uses one `FurnitureFactory`.

If the selected factory is `ModernFurnitureFactory`, all products are modern.

If the selected factory is `VictorianFurnitureFactory`, all products are Victorian.

## Pattern Mapping

Abstract Products:

- Chair
- Sofa
- CoffeeTable

Concrete Products:

- ModernChair
- ModernSofa
- ModernCoffeeTable
- VictorianChair
- VictorianSofa
- VictorianCoffeeTable

Abstract Factory:

- FurnitureFactory

Concrete Factories:

- ModernFurnitureFactory
- VictorianFurnitureFactory

## How to Run

From project root:

```bash
javac -d out src/DesignPatterns/creational/abstractFactory/miniProject/*.java
java -cp out DesignPatterns.creational.abstractFactory.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how one factory creates a complete matching furniture family, so a room does not accidentally mix modern and Victorian products.

### Pattern Mapping

- Abstract Factory: FurnitureFactory
- Concrete Factories: ModernFurnitureFactory, VictorianFurnitureFactory
- Abstract Products: Chair, Sofa, CoffeeTable
- Client: Room and App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/creational/abstractFactory/miniProject/*.java
java -cp out DesignPatterns.creational.abstractFactory.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Sitting on a clean modern chair
Relaxing on a minimal modern sofa
Placing cup on a glass modern coffee table

Sitting on a royal Victorian chair
Relaxing on a detailed Victorian sofa
Placing cup on a carved Victorian coffee table
```
