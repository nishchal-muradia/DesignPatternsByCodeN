# Document Template Mini Project

## Overview

This mini project shows Prototype using document templates.

A company may have ready templates:

- Offer letter
- Invoice
- Experience letter

Instead of building every document from zero, we copy a ready template and fill specific values.

## Why Prototype Here?

Templates have repeated data:

- Company name
- Header
- Footer
- Base content

Only a few fields change.

Prototype allows us to keep ready templates and clone them when needed.

## Pattern Mapping

Prototype:

- Document

Prototype Registry:

- DocumentTemplateRegistry

Client:

- App

## How to Run

From project root:

```bash
javac -d out src/DesignPatterns/creational/prototype/miniProject/*.java
java -cp out DesignPatterns.creational.prototype.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how ready document templates can be copied and customized instead of being created from zero each time.

### Pattern Mapping

- Prototype: Document
- Copy method: copy()
- Registry: DocumentTemplateRegistry
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/creational/prototype/miniProject/*.java
java -cp out DesignPatterns.creational.prototype.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Offer Letter
CodeN Technologies
To: Nishchal
We are happy to offer you the Java Developer role.
Regards, HR Team

Invoice
CodeN Billing Department
To: ABC Pvt Ltd
Invoice amount: Rs. 50000
Payment due within 15 days
```
