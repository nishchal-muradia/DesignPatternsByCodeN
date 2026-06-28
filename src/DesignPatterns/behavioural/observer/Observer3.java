package DesignPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/*
Observer3.java

Now observers can unsubscribe also.
*/
public class Observer3 {
    public static void main(String[] args) {
        Channel3 channel = new Channel3();

        Subscriber3 amit = new Subscriber3("Amit");
        Subscriber3 neha = new Subscriber3("Neha");

        channel.subscribe(amit);
        channel.subscribe(neha);
        channel.uploadVideo("Observer Pattern");

        channel.unsubscribe(neha);
        channel.uploadVideo("State Pattern");
    }
}

interface ObserverExample3 {
    void update(String message);
}

class Subscriber3 implements ObserverExample3 {
    private final String name;

    public Subscriber3(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class Channel3 {
    private final List<ObserverExample3> observers = new ArrayList<ObserverExample3>();

    public void subscribe(ObserverExample3 observer) {
        observers.add(observer);
    }

    public void unsubscribe(ObserverExample3 observer) {
        observers.remove(observer);
    }

    public void uploadVideo(String title) {
        for (ObserverExample3 observer : observers) {
            observer.update("New video uploaded: " + title);
        }
    }
}
