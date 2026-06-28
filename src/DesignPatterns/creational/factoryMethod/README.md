# Factory Method Design Pattern in Java

## Overview

Factory Method is a creational design pattern.

It is used when client code should not directly decide which concrete class object to create.

Instead of writing `new` for concrete classes everywhere, we move object creation into a special method called a factory method.

The client asks the creator for an object, and the creator decides which concrete product should be returned.

This keeps client code dependent on interfaces or abstract types instead of concrete implementation classes.

This pattern is common in notification systems, payment systems, document exporters, UI components, and database connector creation.

For beginners, remember this simple point: Factory Method moves object creation responsibility away from the client and into creator classes.

## Very Simple Meaning

Imagine you are ordering food from a restaurant.

You do not go inside the kitchen and cook the food yourself.
You just say:

I want pizza.

The kitchen decides:

- Which chef will cook it
- Which ingredients are needed
- How the pizza object will be prepared

In programming, Factory Method works like that kitchen.

The client says:

I want a notification.

The factory method decides:

- Should it create EmailNotification?
- Should it create SMSNotification?
- Should it create WhatsAppNotification?

## The Problem Without Factory Method

Suppose we have this code:

```java
Notification notification = new EmailNotification();
notification.send("Order placed");
```

This looks simple.

But what if tomorrow we want SMS notification?

Then we may write:

```java
Notification notification = new SMSNotification();
```

Now the client code knows exact class names.

That means the client is tightly connected with concrete classes like:

- EmailNotification
- SMSNotification
- PushNotification

This creates a problem.

If object creation logic changes, the client code also changes.

Factory Method helps us reduce this direct dependency.

## Main Idea

Instead of this:

```java
EmailNotification notification = new EmailNotification();
```

We do this:

```java
Notification notification = creator.createNotification();
```

Now the client does not care which exact class is created.
The client only cares that the object can send a notification.

## Important Terms

### Product

Product is the common interface or abstract class.

Example:

```java
interface Notification {
    void send(String message);
}
```

This tells us what every notification must be able to do.

### Concrete Product

Concrete Product is the real implementation.

Examples:

- EmailNotification
- SMSNotification
- PushNotification

All of them implement the same `Notification` interface.

### Creator

Creator is the class that contains the factory method.

Example:

```java
abstract class NotificationCreator {
    abstract Notification createNotification();
}
```

### Concrete Creator

Concrete Creator decides the actual object.

Examples:

- EmailNotificationCreator creates EmailNotification
- SMSNotificationCreator creates SMSNotification
- PushNotificationCreator creates PushNotification

## Why Do We Need This Pattern?

Factory Method helps when:

- We do not want the client code to depend directly on concrete classes.
- We want object creation logic in one controlled place.
- We may add new object types in future.
- We want to follow the Open/Closed Principle.

Open/Closed Principle means:

Open for extension, closed for modification.

Simple meaning:

We should be able to add new behavior without changing old tested code too much.

## Real Life Examples

Factory Method is useful in:

- Notification systems
- Payment gateways
- Document exporters
- UI component creation
- Database connector creation
- Logistics and delivery apps

Example:

An app supports different payment methods:

- Credit card
- UPI
- PayPal

The checkout flow should not be full of `new CreditCardPayment()` and `new UPIPayment()`.
It should ask a factory method to create the correct payment object.

## Files in This Folder

### FactoryMethod1.java

Shows the problem first.

The client directly creates concrete objects using `new`.

This is not wrong for small code, but it becomes difficult when the app grows.

### FactoryMethod2.java

Introduces a simple factory method.

Now object creation is moved into one method.

### FactoryMethod3.java

Introduces the real Factory Method structure using:

- Product
- Concrete Product
- Creator
- Concrete Creator

### FactoryMethod4.java

Shows how Factory Method helps us add a new type without disturbing the old client flow.

## Final Thought

Factory Method is not about removing `new` completely from the application.

Some class still has to create the object.

The goal is to move `new` away from the client code and keep object creation in a proper creator class or method.

So the beginner-friendly one-line definition is:

Factory Method is a design pattern where we create objects through a method, so the client code does not need to know the exact class being created.
---

## Beginner Deep Dive

### Pattern In One Line

Factory Method lets a creator method decide which concrete object should be created.

### What Is This Pattern?

Factory Method moves object creation out of client code and into a creator method. The client works with an interface or abstract type, while child creator classes decide the concrete product.

### The Core Problem It Solves

If client code directly writes new EmailNotification(), new SMSNotification(), and new PushNotification(), it becomes tightly coupled to concrete classes and changes whenever object creation changes.

### How It Works Step By Step

1. Define a product interface that all products follow.
2. Create concrete product classes.
3. Define a creator class with a factory method.
4. Let concrete creators override the factory method.
5. Client code works with the creator and product abstractions.

### Main Participants

- Product: common interface for objects being created.
- Concrete Product: actual class returned by the factory method.
- Creator: declares the factory method.
- Concrete Creator: decides which concrete product to create.

### Simple Diagram

```text
Client -> Creator -> factoryMethod()
                    -> Product interface
                    -> ConcreteProduct
```

### When To Use

- Object creation should be centralized.
- Client should not depend on concrete product classes.
- New product types may be added later.

### When Not To Use

- Do not use it when there is only one simple class and object creation is not likely to change.
- Do not add factories everywhere just to hide new.

### Advantages

- Reduces coupling between client and concrete classes.
- Supports Open/Closed Principle for adding new product types.
- Keeps creation logic in one responsible place.

### Disadvantages And Trade-Offs

- Adds more classes.
- May feel heavy for very small examples.

### Do Not Confuse This With

- Factory Method vs Simple Factory: Simple Factory usually has one if-else factory; Factory Method lets subclasses decide creation.
- Factory Method vs Abstract Factory: Factory Method creates one product type; Abstract Factory creates families of related products.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/creational/factoryMethod/FactoryMethod1.java
java -cp out DesignPatterns.creational.factoryMethod.FactoryMethod1
javac -d out src/DesignPatterns/creational/factoryMethod/FactoryMethod2.java
java -cp out DesignPatterns.creational.factoryMethod.FactoryMethod2
javac -d out src/DesignPatterns/creational/factoryMethod/FactoryMethod3.java
java -cp out DesignPatterns.creational.factoryMethod.FactoryMethod3
javac -d out src/DesignPatterns/creational/factoryMethod/FactoryMethod4.java
java -cp out DesignPatterns.creational.factoryMethod.FactoryMethod4
```

### Interview Q&A

### Does Factory Method remove new completely?

No. It moves new into creator classes so client code is cleaner.

### Why return an interface?

So client code depends on behavior, not exact implementation.

### What principle does it support?

Open/Closed Principle.
