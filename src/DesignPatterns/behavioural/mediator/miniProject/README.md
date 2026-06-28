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
javac src/DesignPatterns/behavioural/mediator/miniProject/App.java
java -cp src DesignPatterns.behavioural.mediator.miniProject.App
```
