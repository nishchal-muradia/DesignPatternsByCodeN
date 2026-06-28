# Chain of Responsibility Design Pattern in Java

## Overview

Chain of Responsibility is a behavioral design pattern.

It is used when a request can be handled by more than one object, but the sender should not decide which object will handle it.

Instead of writing one big `if-else` block, we create multiple handler classes and connect them like a chain.

The request starts from the first handler. If that handler can solve it, it handles the request. If not, it passes the request to the next handler.

This pattern is common in approval systems, support ticket systems, logging pipelines, authentication filters, and validation chains.

For beginners, remember this simple point: Chain of Responsibility is useful when a request should travel through multiple possible handlers until the right one handles it.

## Very Simple Meaning

Imagine customer support.

Level 1 support tries first.

If Level 1 cannot solve it, the request goes to Level 2.

If Level 2 cannot solve it, the request goes to Manager.

That is Chain of Responsibility.

## When to Use

Use this pattern when:

- More than one object may handle a request.
- You do not want the sender to know the exact receiver.
- You want to avoid big if-else blocks.
- You want handlers to be arranged dynamically.

## Files in This Folder

### ChainOfResponsibility1.java

Shows the problem with if-else request handling.

### ChainOfResponsibility2.java

Introduces handler chain.

### ChainOfResponsibility3.java

Shows a longer approval chain.

## One-Line Definition

Chain of Responsibility is a pattern where a request moves through multiple handlers until one handler processes it.
---

## Beginner Deep Dive

### Pattern In One Line

Chain of Responsibility passes a request through handlers until one handles it.

### What Is This Pattern?

Each handler gets a chance to process the request. If it cannot, it forwards the request to the next handler in the chain.

### The Core Problem It Solves

A big if-else block often grows when many possible handlers exist for one request.

### How It Works Step By Step

1. Create a handler interface or abstract class.
2. Give each handler a reference to the next handler.
3. Each handler checks whether it can process the request.
4. If yes, it handles the request.
5. If no, it passes the request to next.

### Main Participants

- Handler: declares handling method and next reference.
- Concrete Handler: processes specific request type.
- Client: sends request to the first handler.

### Simple Diagram

```text
Client -> Handler1 -> Handler2 -> Handler3
```

### When To Use

- Multiple objects may handle a request.
- You want to avoid hardcoded if-else dispatch.
- Handler order may change.

### When Not To Use

- Do not use it if exactly one fixed object always handles the request.
- Avoid chains so long that debugging becomes difficult.

### Advantages

- Decouples sender from receiver.
- Handlers can be rearranged.
- Each handler has one focused responsibility.

### Disadvantages And Trade-Offs

- Request may go unhandled.
- Flow can be harder to trace.

### Do Not Confuse This With

- Chain vs Command: Chain routes a request through handlers; Command wraps a request as an object.
- Chain vs Observer: Chain usually stops when handled; Observer notifies many listeners.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/behavioural/chainOfResponsibility/ChainOfResponsibility1.java
java -cp out DesignPatterns.behavioural.chainOfResponsibility.ChainOfResponsibility1
javac -d out src/DesignPatterns/behavioural/chainOfResponsibility/ChainOfResponsibility2.java
java -cp out DesignPatterns.behavioural.chainOfResponsibility.ChainOfResponsibility2
javac -d out src/DesignPatterns/behavioural/chainOfResponsibility/ChainOfResponsibility3.java
java -cp out DesignPatterns.behavioural.chainOfResponsibility.ChainOfResponsibility3
```

### Interview Q&A

### Who starts the chain?

The client sends the request to the first handler.

### Can more than one handler process a request?

Usually one handles it, but the design can allow multiple if needed.

### What replaces if-else?

Separate handler classes connected in a chain.
