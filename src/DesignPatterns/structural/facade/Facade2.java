package DesignPatterns.structural.facade;

/*
Facade2.java

Now OrderFacade2 provides one simple method.

Client does not need to know all subsystem steps.
*/
public class Facade2 {
    public static void main(String[] args) {
        OrderFacade2 facade = new OrderFacade2();
        facade.placeOrder();
    }
}

class Inventory2 {
    public void checkStock() {
        System.out.println("Checking stock");
    }
}

class Payment2 {
    public void collectPayment() {
        System.out.println("Collecting payment");
    }
}

class Shipping2 {
    public void createShipment() {
        System.out.println("Creating shipment");
    }
}

class OrderFacade2 {
    private final Inventory2 inventory = new Inventory2();
    private final Payment2 payment = new Payment2();
    private final Shipping2 shipping = new Shipping2();

    public void placeOrder() {
        inventory.checkStock();
        payment.collectPayment();
        shipping.createShipment();
        System.out.println("Order placed successfully");
    }
}
