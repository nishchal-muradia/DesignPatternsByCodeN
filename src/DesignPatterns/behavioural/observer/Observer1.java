package DesignPatterns.behavioural.observer;

/*
Observer1.java

Problem:

Channel manually calls each subscriber.
*/
public class Observer1 {
    public static void main(String[] args) {
        Subscriber1 amit = new Subscriber1("Amit");
        Subscriber1 neha = new Subscriber1("Neha");

        amit.update("New Java video uploaded");
        neha.update("New Java video uploaded");
    }
}

class Subscriber1 {
    private final String name;

    public Subscriber1(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}
