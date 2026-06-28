Singleton Design Pattern in Java
Overview

The Singleton Design Pattern is a creational pattern that ensures a class has only one instance and
provides a global point of access to it.

It is widely used in scenarios where a single object should control certain actions,
like configuration management, logging, or database connections.

Key Features

Single Instance: Only one object of the class exists throughout the application.
Global Access: The instance can be accessed from anywhere using a static method.
Lazy Initialization (optional): The instance can be created only when it is first needed.
Thread-Safe: Can be implemented in a thread-safe way to prevent multiple threads from creating multiple instances.

When to Use Singleton
Logging systems
Configuration manager (centralized configuration)
Database connection pool
Caching mechanisms
Any scenario where global state is required