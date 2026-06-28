package DesignPatterns.creational.factoryMethod.miniProject;

/*
Concrete Product

This class represents real SMS notification.
*/
public class SMSNotification implements Notification {

    private final String phoneNumber;

    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        System.out.println("SMS");
        System.out.println("To      : " + phoneNumber);
        System.out.println("Message : " + message);
        System.out.println();
    }
}
