package DesignPatterns.behavioural.strategy;

/*
Strategy1.java

Problem:

Payment logic is selected using if-else.
*/
public class Strategy1 {
    public static void main(String[] args) {
        Checkout1 checkout = new Checkout1();
        checkout.pay("UPI", 1000);
    }
}

class Checkout1 {
    public void pay(String type, double amount) {
        if (type.equalsIgnoreCase("CARD")) {
            System.out.println("Paid by card: " + amount);
        } else if (type.equalsIgnoreCase("UPI")) {
            System.out.println("Paid by UPI: " + amount);
        } else {
            System.out.println("Unknown payment type");
        }
    }
}
