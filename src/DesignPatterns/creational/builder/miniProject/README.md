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
javac -d out src/DesignPatterns/creational/builder/miniProject/*.java
java -cp out DesignPatterns.creational.builder.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves why Builder is useful when an object has required and optional fields. The order creation reads like a form being filled step by step.

### Pattern Mapping

- Product: FoodOrder
- Builder: FoodOrder.Builder
- Required field: mainItem
- Optional fields: drink, fries, dessert, deliveryAddress, giftMessage

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/creational/builder/miniProject/*.java
java -cp out DesignPatterns.creational.builder.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Food Order
Main item       : Paneer Burger
Drink           : Cold Coffee
Fries included  : true
Dessert         : No dessert
Delivery address: Sector 62, Noida
Gift message    : No gift message

Food Order
Main item       : Chocolate Cake
Drink           : No drink
Fries included  : false
Dessert         : Brownie
Delivery address: Delhi
Gift message    : Happy birthday
```
