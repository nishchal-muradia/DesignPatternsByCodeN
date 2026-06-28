# Online Order Facade Mini Project

## Overview

This mini project shows Facade using an online order flow.

Placing an order needs many steps:

- Check inventory
- Process payment
- Generate invoice
- Create shipment

Facade gives the client one method:

```java
placeOrder()
```

## Pattern Mapping

Subsystem classes:

- InventoryService
- PaymentService
- InvoiceService
- ShippingService

Facade:

- OrderFacade

Client:

- App

## How to Run

```bash
javac -d out src/DesignPatterns/structural/facade/miniProject/*.java
java -cp out DesignPatterns.structural.facade.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how one simple placeOrder method can hide the details of inventory, payment, invoice, and shipping services.

### Pattern Mapping

- Facade: OrderFacade
- Subsystems: InventoryService, PaymentService, InvoiceService, ShippingService
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/structural/facade/miniProject/*.java
java -cp out DesignPatterns.structural.facade.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Inventory checked for Laptop
Payment processed: 75000.0
Invoice generated for Laptop, amount=75000.0
Shipment created for Laptop
Order flow completed
```
