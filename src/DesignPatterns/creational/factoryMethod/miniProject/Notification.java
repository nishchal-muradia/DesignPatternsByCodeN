package DesignPatterns.creational.factoryMethod.miniProject;

/*
Product

This is the common interface for all notification types.

Every notification in this mini project must know how to send a message.
*/
public interface Notification {
    void send(String message);
}
