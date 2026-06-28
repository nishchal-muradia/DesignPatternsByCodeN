# Observer Design Pattern in Java

## Overview

Observer is a behavioral design pattern.

It is used when one object changes and many other objects need to know about that change automatically.

The object being watched is called the subject. The objects waiting for updates are called observers.

Observers subscribe to the subject. When the subject changes, it sends a notification to all subscribed observers.

This pattern is common in event systems, notification systems, stock price alerts, UI listeners, and publish-subscribe flows.

For beginners, remember this simple point: Observer creates a clean one-to-many notification relationship.

## Very Simple Meaning

Think about a YouTube channel.

Subscribers subscribe to the channel.

When a new video is uploaded, all subscribers get notified.

The channel is the subject.

Subscribers are observers.

## When to Use

Use Observer when:

- Many objects need updates when one object changes.
- You want loose coupling between subject and listeners.
- Objects should be able to subscribe and unsubscribe.

## Files in This Folder

### Observer1.java

Shows manual notification.

### Observer2.java

Introduces subject and observers.

### Observer3.java

Adds unsubscribe behavior.

## One-Line Definition

Observer is a pattern where subscribers automatically get notified when the subject changes.
---

## Beginner Deep Dive

### Pattern In One Line

Observer notifies subscribed objects when a subject changes.

### What Is This Pattern?

Observer creates a one-to-many relationship. The subject stores a list of observers and notifies them when important state changes.

### The Core Problem It Solves

Manual notification tightly couples the subject to every object that needs updates.

### How It Works Step By Step

1. Define an observer interface.
2. Subject stores a list of observers.
3. Observers subscribe or unsubscribe.
4. Subject changes state.
5. Subject loops through observers and calls update().

### Main Participants

- Subject: object being watched.
- Observer: interface for receiving updates.
- Concrete Observer: reacts to updates.
- Client: wires subscriptions.

### Simple Diagram

```text
Subject -> Observer A
        -> Observer B
        -> Observer C
```

### When To Use

- Many objects need updates from one object.
- Subscribers can change dynamically.
- You want loose coupling between publisher and subscribers.

### When Not To Use

- Do not use it when there is only one fixed receiver.
- Be careful with too many observers causing unexpected cascades.

### Advantages

- Loose coupling.
- Dynamic subscribe/unsubscribe.
- Good for events and notifications.

### Disadvantages And Trade-Offs

- Notification order may matter.
- Can be harder to debug with many observers.

### Do Not Confuse This With

- Observer vs Mediator: Observer broadcasts updates; Mediator coordinates interactions.
- Observer vs Chain: Observer notifies many; Chain passes request along handlers.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/behavioural/observer/Observer1.java
java -cp out DesignPatterns.behavioural.observer.Observer1
javac -d out src/DesignPatterns/behavioural/observer/Observer2.java
java -cp out DesignPatterns.behavioural.observer.Observer2
javac -d out src/DesignPatterns/behavioural/observer/Observer3.java
java -cp out DesignPatterns.behavioural.observer.Observer3
```

### Interview Q&A

### What is subject?

The object being observed.

### What is observer?

An object that receives updates.

### Can observers unsubscribe?

Yes, a good implementation supports it.
