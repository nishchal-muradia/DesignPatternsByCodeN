# Proxy Design Pattern in Java

## Overview

Proxy is a structural design pattern.

It is used when direct access to an object needs to be controlled.

The proxy has the same interface as the real object, so the client can use it like the real object.

Before forwarding the request, the proxy can add extra logic such as access checking, lazy loading, caching, logging, or remote communication.

This pattern is common in secure documents, image loading, API clients, database access, remote services, and caching layers.

For beginners, remember this simple point: Proxy stands in front of the real object and controls access to it.

## Very Simple Meaning

Suppose a real image is heavy to load.

You do not want to load it until user actually needs to see it.

A proxy object stands in front.

When display is called, proxy loads real image and forwards the call.

## Common Proxy Types

- Lazy loading proxy
- Security proxy
- Logging proxy
- Remote proxy
- Caching proxy

## When to Use

Use Proxy when:

- You want to control access to an object.
- Object creation is expensive.
- You need extra behavior before or after real object call.

## Files in This Folder

### Proxy1.java

Shows direct expensive object creation.

### Proxy2.java

Introduces lazy loading proxy.

### Proxy3.java

Shows protection proxy for role-based access.

## One-Line Definition

Proxy is a pattern where a wrapper object controls access to a real object.
---

## Beginner Deep Dive

### Pattern In One Line

Proxy controls access to a real object through a wrapper object.

### What Is This Pattern?

Proxy implements the same interface as the real object. Client talks to the proxy, and the proxy decides when and how to call the real object.

### The Core Problem It Solves

Sometimes direct access to an object is expensive, unsafe, remote, or needs extra checks.

### How It Works Step By Step

1. Define a common subject interface.
2. Create the real subject class.
3. Create a proxy that implements the same interface.
4. Proxy stores or creates the real subject.
5. Proxy adds access control, lazy loading, logging, caching, or remote call logic.

### Main Participants

- Subject: common interface.
- Real Subject: actual object doing the work.
- Proxy: wrapper that controls access.
- Client: calls the subject interface.

### Simple Diagram

```text
Client -> Proxy -> RealSubject
```

### When To Use

- Object creation is expensive and should be lazy.
- Access needs permission checks.
- Calls should be logged, cached, or sent remotely.

### When Not To Use

- Do not use it if direct access is simple and safe.
- Avoid proxies that hide too much unexpected behavior.

### Advantages

- Controls access without changing real object.
- Can add lazy loading or security.
- Client still uses the same interface.

### Disadvantages And Trade-Offs

- Adds indirection.
- May make performance behavior less obvious.

### Do Not Confuse This With

- Proxy vs Decorator: Proxy controls access; Decorator adds features.
- Proxy vs Adapter: Proxy keeps the same interface; Adapter changes the interface.

### How To Run The Learning Examples

From the project root, use `-d out` so compiled files go into the `out` folder.

```bash
javac -d out src/DesignPatterns/structural/proxy/Proxy1.java
java -cp out DesignPatterns.structural.proxy.Proxy1
javac -d out src/DesignPatterns/structural/proxy/Proxy2.java
java -cp out DesignPatterns.structural.proxy.Proxy2
javac -d out src/DesignPatterns/structural/proxy/Proxy3.java
java -cp out DesignPatterns.structural.proxy.Proxy3
```

### Interview Q&A

### Does Proxy implement the same interface as real object?

Yes.

### What is lazy proxy?

It creates the real object only when needed.

### What is protection proxy?

It checks permission before calling the real object.
