package DesignPatterns.structural.adapter.miniProject;

public class App {
    public static void main(String[] args) {
        ExternalPaymentGateway externalGateway = new ExternalPaymentGateway();
        PaymentService paymentService = new ExternalGatewayAdapter(externalGateway);

        Checkout checkout = new Checkout(paymentService);
        checkout.placeOrder("ORDER-101", 2499);
    }
}

interface PaymentService {
    void pay(String orderId, double amount);
}

class Checkout {
    private final PaymentService paymentService;

    public Checkout(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(String orderId, double amount) {
        System.out.println("Creating order: " + orderId);
        paymentService.pay(orderId, amount);
        System.out.println("Order completed");
    }
}

class ExternalPaymentGateway {
    public void sendMoney(String referenceNumber, String amountText) {
        System.out.println("External gateway reference: " + referenceNumber);
        System.out.println("External gateway amount: Rs. " + amountText);
    }
}

class ExternalGatewayAdapter implements PaymentService {
    private final ExternalPaymentGateway gateway;

    public ExternalGatewayAdapter(ExternalPaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void pay(String orderId, double amount) {
        gateway.sendMoney(orderId, String.valueOf(amount));
    }
}
