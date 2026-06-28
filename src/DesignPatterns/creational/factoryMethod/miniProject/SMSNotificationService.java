package DesignPatterns.creational.factoryMethod.miniProject;

/*
Concrete Creator

This service decides to create SMSNotification.
*/
public class SMSNotificationService extends NotificationService {

    private final String phoneNumber;

    public SMSNotificationService(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    protected Notification createNotification() {
        return new SMSNotification(phoneNumber);
    }
}
