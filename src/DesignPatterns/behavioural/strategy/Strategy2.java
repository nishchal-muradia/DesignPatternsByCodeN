package DesignPatterns.behavioural.strategy;

/*
Strategy2.java

Each payment method is now a separate strategy class.
*/
public class Strategy2 {
    public static void main(String[] args) {
        Checkout2 checkout = new Checkout2(new UPIPaymentStrategy2());
        checkout.pay(1000);
    }
}

interface PaymentStrategy2 {
    void pay(double amount);
}

class CardPaymentStrategy2 implements PaymentStrategy2 {
    @Override
    public void pay(double amount) {
        System.out.println("Paid by card: " + amount);
    }
}

class UPIPaymentStrategy2 implements PaymentStrategy2 {
    @Override
    public void pay(double amount) {
        System.out.println("Paid by UPI: " + amount);
    }
}

class Checkout2 {
    private final PaymentStrategy2 paymentStrategy;

    public Checkout2(PaymentStrategy2 paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}
