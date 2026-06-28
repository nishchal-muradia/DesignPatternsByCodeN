# Food Order Mini Project

## Overview

This mini project shows Builder using a food ordering system.

An order can have:

- Main item
- Drink
- Fries
- Dessert
- Delivery address
- Gift message

Some fields are required.
Some are optional.

Builder makes this object creation readable.

## Why Builder Here?

A food order can have many combinations.

Without Builder, we may need many constructors.

With Builder, we can write:

```java
FoodOrder order = new FoodOrder.Builder("Veg Burger")
        .drink("Cold Coffee")
        .fries(true)
        .deliveryAddress("Delhi")
        .build();
```

## Pattern Mapping

Product:

- FoodOrder

Builder:

- FoodOrder.Builder

Client:

- App

## How to Run

From project root:

```bash
javac src/DesignPatterns/creational/builder/miniProject/App.java
java -cp src DesignPatterns.creational.builder.miniProject.App
```
