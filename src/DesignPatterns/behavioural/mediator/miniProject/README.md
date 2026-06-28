# Air Traffic Control Mediator Mini Project

## Overview

This mini project shows Mediator using air traffic control.

Airplanes do not directly coordinate with each other.

They ask the control tower.

The tower decides whether landing is allowed.

## Pattern Mapping

Mediator:

- ControlTower

Concrete Mediator:

- AirportControlTower

Colleague:

- Airplane

## How to Run

```bash
javac -d out src/DesignPatterns/behavioural/mediator/miniProject/*.java
java -cp out DesignPatterns.behavioural.mediator.miniProject.App
```
---

## Beginner Notes

### What This Mini Project Proves

This project proves how airplanes coordinate through a control tower instead of directly coordinating with each other.

### Pattern Mapping

- Mediator: ControlTower
- Concrete Mediator: AirportControlTower
- Colleague: Airplane
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/behavioural/mediator/miniProject/*.java
java -cp out DesignPatterns.behavioural.mediator.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
Indigo 101 allowed to land.
Vistara 202 must wait. Runway busy.
Indigo 101 finished landing. Runway free.
Vistara 202 allowed to land.
```
