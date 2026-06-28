package DesignPatterns.behavioural.mediator;

/*
Mediator1.java

Problem:

Users directly call each other.
With many users, connections become messy.
*/
public class Mediator1 {
    public static void main(String[] args) {
        User1 amit = new User1("Amit");
        User1 neha = new User1("Neha");

        amit.sendDirect(neha, "Hello");
    }
}

class User1 {
    private final String name;

    public User1(String name) {
        this.name = name;
    }

    public void sendDirect(User1 user, String message) {
        user.receive(name + ": " + message);
    }

    public void receive(String message) {
        System.out.println(name + " received " + message);
    }
}
