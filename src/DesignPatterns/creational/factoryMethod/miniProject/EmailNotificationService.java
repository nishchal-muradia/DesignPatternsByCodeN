package DesignPatterns.creational.factoryMethod.miniProject;

/*
Concrete Creator

This service decides to create EmailNotification.
*/
public class EmailNotificationService extends NotificationService {

    private final String emailAddress;

    public EmailNotificationService(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    protected Notification createNotification() {
        return new EmailNotification(emailAddress);
    }
}
