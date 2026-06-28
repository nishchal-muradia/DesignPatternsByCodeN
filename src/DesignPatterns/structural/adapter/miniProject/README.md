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
javac src/DesignPatterns/structural/adapter/miniProject/App.java
java -cp src DesignPatterns.structural.adapter.miniProject.App
```
