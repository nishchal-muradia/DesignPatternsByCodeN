# Notification Sender Mini Project

## Overview

This mini project shows Factory Method in a simple real-world style.

We are building a notification sender.

The application can send:

- Email notification
- SMS notification
- Push notification

The important point is:

The main application does not directly create EmailNotification, SMSNotification, or PushNotification.

It uses a creator class.

Each creator class decides which notification object should be created.

## Why Factory Method Here?

Without Factory Method, the main application may look like this:

```java
EmailNotification email = new EmailNotification();
SMSNotification sms = new SMSNotification();
PushNotification push = new PushNotification();
```

This means the main application knows all concrete classes.

With Factory Method, the main application works like this:

```java
NotificationService service = new EmailNotificationService();
service.notifyUser("Welcome");
```

Now the main application depends on the abstraction.

The exact object creation is handled by the concrete service class.

## Pattern Mapping

Product:

- Notification

Concrete Products:

- EmailNotification
- SMSNotification
- PushNotification

Creator:

- NotificationService

Concrete Creators:

- EmailNotificationService
- SMSNotificationService
- PushNotificationService

## What You Should Notice

All notification types have different internal behavior.

Email has an email address.
SMS has a phone number.
Push has a device id.

But the App class does not need to care about those object creation details.

The App only calls:

```java
service.notifyUser(message);
```

That is the goal of Factory Method.

## How to Run

From project root:

```bash
javac -d out src/DesignPatterns/creational/factoryMethod/miniProject/*.java
java -cp out DesignPatterns.creational.factoryMethod.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how Factory Method keeps App away from direct notification object creation. Each service decides which Notification product to create.

### Pattern Mapping

- Product: Notification
- Concrete Products: EmailNotification, SMSNotification, PushNotification
- Creator: NotificationService
- Concrete Creators: EmailNotificationService, SMSNotificationService, PushNotificationService

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/creational/factoryMethod/miniProject/*.java
java -cp out DesignPatterns.creational.factoryMethod.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
EMAIL
To      : customer@example.com
Message : Your order has been placed.

SMS
To      : +91-9999999999
Message : Your order has been packed.

PUSH
Device  : DEVICE-ABC-123
Message : Your order is out for delivery.
```
