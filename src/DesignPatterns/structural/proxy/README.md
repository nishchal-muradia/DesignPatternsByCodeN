# Proxy Design Pattern in Java

## Overview

Proxy is a structural design pattern.

It provides a placeholder or wrapper for another object.

The proxy controls access to the real object.

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
