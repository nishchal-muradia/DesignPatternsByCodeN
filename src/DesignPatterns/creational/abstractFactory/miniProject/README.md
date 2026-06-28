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
javac src/DesignPatterns/creational/abstractFactory/miniProject/App.java
java -cp src DesignPatterns.creational.abstractFactory.miniProject.App
```
