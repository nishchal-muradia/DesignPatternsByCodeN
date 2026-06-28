# Payment Gateway Adapter Mini Project

## Overview

This mini project shows Adapter with a checkout system.

Our application expects all payment providers to follow one interface:

```java
PaymentService
```

But an external RazorPay-like gateway has its own method names.

Adapter lets our checkout use that external gateway without changing checkout code.

## Pattern Mapping

Target interface:

- PaymentService

Adaptee:

- ExternalPaymentGateway

Adapter:

- ExternalGatewayAdapter

Client:

- Checkout

## How to Run

```bash
javac -d out src/DesignPatterns/structural/adapter/miniProject/*.java
java -cp out DesignPatterns.structural.adapter.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how an external gateway with a different API can still be used by checkout code that expects PaymentService.

### Pattern Mapping

- Target: PaymentService
- Adaptee: ExternalPaymentGateway
- Adapter: ExternalGatewayAdapter
- Client: Checkout

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/structural/adapter/miniProject/*.java
java -cp out DesignPatterns.structural.adapter.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Creating order: ORDER-101
External gateway reference: ORDER-101
External gateway amount: Rs. 2499.0
Order completed
```
