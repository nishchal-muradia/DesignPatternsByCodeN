package DesignPatterns.behavioural.strategy;

/*
Strategy3.java

Strategy can be changed at runtime.
*/
public class Strategy3 {
    public static void main(String[] args) {
        Checkout3 checkout = new Checkout3();

        checkout.setPaymentStrategy(new CardPaymentStrategy3());
        checkout.pay(1500);

        checkout.setPaymentStrategy(new WalletPaymentStrategy3());
        checkout.pay(700);
    }
}

interface PaymentStrategy3 {
    void pay(double amount);
}

class CardPaymentStrategy3 implements PaymentStrategy3 {
    @Override
    public void pay(double amount) {
        System.out.println("Paid by card: " + amount);
    }
}

class WalletPaymentStrategy3 implements PaymentStrategy3 {
    @Override
    public void pay(double amount) {
        System.out.println("Paid by wallet: " + amount);
    }
}

class Checkout3 {
    private PaymentStrategy3 paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy3 paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}
