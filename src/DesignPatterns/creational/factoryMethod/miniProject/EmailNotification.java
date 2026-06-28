package DesignPatterns.creational.factoryMethod.miniProject;

/*
Concrete Product

This class represents real email notification.
*/
public class EmailNotification implements Notification {

    private final String emailAddress;

    public EmailNotification(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void send(String message) {
        System.out.println("EMAIL");
        System.out.println("To      : " + emailAddress);
        System.out.println("Message : " + message);
        System.out.println();
    }
}
