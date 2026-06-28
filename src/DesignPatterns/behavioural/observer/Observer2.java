package DesignPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/*
Observer2.java

Now subscribers register with channel.
Channel notifies all observers.
*/
public class Observer2 {
    public static void main(String[] args) {
        Channel2 channel = new Channel2();
        channel.subscribe(new Subscriber2("Amit"));
        channel.subscribe(new Subscriber2("Neha"));

        channel.uploadVideo("Factory Method in Java");
    }
}

interface ObserverExample2 {
    void update(String message);
}

class Subscriber2 implements ObserverExample2 {
    private final String name;

    public Subscriber2(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class Channel2 {
    private final List<ObserverExample2> observers = new ArrayList<ObserverExample2>();

    public void subscribe(ObserverExample2 observer) {
        observers.add(observer);
    }

    public void uploadVideo(String title) {
        for (ObserverExample2 observer : observers) {
            observer.update("New video uploaded: " + title);
        }
    }
}
