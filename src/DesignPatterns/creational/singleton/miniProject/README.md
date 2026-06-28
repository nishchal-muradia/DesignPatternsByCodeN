# 🏦 Configuration Manager Mini-Project

###  Overview
A **real-world Singleton project** in Java.
This Configuration Manager reads config values once and shares them across the application.

---

##  Why Singleton?
- Ensures **one shared instance** across modules
- Avoids repeated file I/O
- Thread-safe
- Centralized configuration control
---

## Beginner Notes

### What This Mini Project Proves

This project proves why one shared configuration object is useful. Multiple threads ask for configuration, but only one ConfigManager instance should load and serve the data.

### Pattern Mapping

- Singleton: ConfigManager
- Static access method: getInstance()
- Shared resource: loaded properties
- Client: App

### Better Run Command

Use `-d out` so `.class` files are not created inside the source folders.

```bash
javac -d out src/DesignPatterns/creational/singleton/miniProject/*.java
java -cp out DesignPatterns.creational.singleton.miniProject.App
```

### Expected Output

The exact order can differ in examples that use threads, but the output will be similar to this:

```text
INSTANCE CREATED
 Configuration loaded successfully.
 All Configurations:
 Loaded Configurations:
database.username = root
environment = production
database.password = admin123
database.url = jdbc:mysql://localhost:3306/flipfit
app.name = FlipFit
Thread-2 → app.name: FlipFit
app.version = 1.0.0
Thread-1 → app.name: FlipFit
Thread-3 → app.name: FlipFit
```
