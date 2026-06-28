package DesignPatterns.structural.facade.miniProject;

public class App {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("Laptop", 75000);
    }
}

class OrderFacade {
    private final InventoryService inventoryService = new InventoryService();
    private final PaymentService paymentService = new PaymentService();
    private final InvoiceService invoiceService = new InvoiceService();
    private final ShippingService shippingService = new ShippingService();

    public void placeOrder(String product, double amount) {
        inventoryService.check(product);
        paymentService.pay(amount);
        invoiceService.generate(product, amount);
        shippingService.ship(product);
        System.out.println("Order flow completed");
    }
}

class InventoryService {
    public void check(String product) {
        System.out.println("Inventory checked for " + product);
    }
}

class PaymentService {
    public void pay(double amount) {
        System.out.println("Payment processed: " + amount);
    }
}

class InvoiceService {
    public void generate(String product, double amount) {
        System.out.println("Invoice generated for " + product + ", amount=" + amount);
    }
}

class ShippingService {
    public void ship(String product) {
        System.out.println("Shipment created for " + product);
    }
}
