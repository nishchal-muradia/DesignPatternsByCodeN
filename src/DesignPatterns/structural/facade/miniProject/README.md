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
javac src/DesignPatterns/structural/facade/miniProject/App.java
java -cp src DesignPatterns.structural.facade.miniProject.App
```
