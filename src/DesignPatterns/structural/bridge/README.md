# Bridge Design Pattern in Java

## Overview

Bridge is a structural design pattern.

It separates an abstraction from its implementation so both can change independently.

## Very Simple Meaning

Imagine a remote control and devices.

Remote can be:

- Basic remote
- Advanced remote

Device can be:

- TV
- Radio

Without Bridge, we may create many classes:

- BasicTVRemote
- AdvancedTVRemote
- BasicRadioRemote
- AdvancedRadioRemote

Bridge avoids this class explosion.

Remote has a Device reference.

Now remotes and devices can grow separately.

## When to Use

Use Bridge when:

- You have two dimensions that can vary independently.
- Inheritance is creating too many combinations.
- You want composition instead of large class hierarchies.

## Files in This Folder

### Bridge1.java

Shows the class explosion problem.

### Bridge2.java

Introduces a bridge between Remote and Device.

### Bridge3.java

Shows how we can add a new remote or new device independently.

## One-Line Definition

Bridge is a pattern where one abstraction holds a reference to an implementation, so both sides can evolve separately.
