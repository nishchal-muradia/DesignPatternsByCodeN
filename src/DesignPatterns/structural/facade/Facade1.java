package DesignPatterns.structural.facade;

/*
Facade1.java

Problem:

Client has to call many classes in correct order.
*/
public class Facade1 {
    public static void main(String[] args) {
        Inventory1 inventory = new Inventory1();
        Payment1 payment = new Payment1();
        Shipping1 shipping = new Shipping1();

        inventory.checkStock();
        payment.collectPayment();
        shipping.createShipment();
    }
}

class Inventory1 {
    public void checkStock() {
        System.out.println("Checking stock");
    }
}

class Payment1 {
    public void collectPayment() {
        System.out.println("Collecting payment");
    }
}

class Shipping1 {
    public void createShipment() {
        System.out.println("Creating shipment");
    }
}
