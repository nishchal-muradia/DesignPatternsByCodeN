package DesignPatterns.structural.adapter;

/*
Adapter3.java

This example is closer to real projects.

Our app expects PaymentProcessor3.
Third-party gateway has a different method name and data format.
Adapter makes it compatible.
*/
public class Adapter3 {
    public static void main(String[] args) {
        ThirdPartyGateway3 gateway = new ThirdPartyGateway3();
        PaymentProcessor3 processor = new PaymentGatewayAdapter3(gateway);

        Checkout3 checkout = new Checkout3(processor);
        checkout.pay(1500);
    }
}

interface PaymentProcessor3 {
    void payAmount(double amount);
}

class Checkout3 {
    private final PaymentProcessor3 processor;

    public Checkout3(PaymentProcessor3 processor) {
        this.processor = processor;
    }

    public void pay(double amount) {
        processor.payAmount(amount);
    }
}

class ThirdPartyGateway3 {
    public void makePayment(String amountText) {
        System.out.println("Third-party gateway paid Rs. " + amountText);
    }
}

class PaymentGatewayAdapter3 implements PaymentProcessor3 {
    private final ThirdPartyGateway3 gateway;

    public PaymentGatewayAdapter3(ThirdPartyGateway3 gateway) {
        this.gateway = gateway;
    }

    @Override
    public void payAmount(double amount) {
        String gatewayAmount = String.valueOf(amount);
        gateway.makePayment(gatewayAmount);
    }
}
