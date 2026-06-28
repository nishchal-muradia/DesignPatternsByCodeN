# Secure Document Proxy Mini Project

## Overview

This mini project shows Proxy using secure document access.

The real document contains sensitive data.

The proxy checks user role before opening it.

## Pattern Mapping

Subject:

- Document

Real Subject:

- ConfidentialDocument

Proxy:

- SecureDocumentProxy

Client:

- App

## How to Run

```bash
javac -d out src/DesignPatterns/structural/proxy/miniProject/*.java
java -cp out DesignPatterns.structural.proxy.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how a proxy can check access before allowing the real document to be read.

### Pattern Mapping

- Subject: Document
- Real Subject: ConfidentialDocument
- Proxy: SecureDocumentProxy
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/structural/proxy/miniProject/*.java
java -cp out DesignPatterns.structural.proxy.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Reading confidential salary document
Access denied for role: intern
```
