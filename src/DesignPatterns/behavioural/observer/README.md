# Observer Design Pattern in Java

## Overview

Observer is a behavioral design pattern.

It lets one object notify many dependent objects when its state changes.

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
