# Strategy Design Pattern in Java

## Overview

Strategy is a behavioral design pattern.

It lets us define multiple algorithms and switch between them at runtime.

## Very Simple Meaning

Think about payment methods.

You can pay by:

- Credit card
- UPI
- Wallet

Checkout flow is same.

Payment algorithm changes.

Strategy keeps each algorithm in a separate class.

## When to Use

Use Strategy when:

- You have multiple ways to perform the same task.
- You want to avoid big if-else blocks.
- You want to switch behavior at runtime.

## Files in This Folder

### Strategy1.java

Shows if-else based algorithm selection.

### Strategy2.java

Introduces strategy interface.

### Strategy3.java

Shows runtime strategy switching.

## One-Line Definition

Strategy is a pattern where each algorithm is placed in a separate class and selected by the client or context.
