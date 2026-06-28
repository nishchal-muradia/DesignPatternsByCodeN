package DesignPatterns.creational.factoryMethod.miniProject;

/*
Concrete Creator

This service decides to create PushNotification.
*/
public class PushNotificationService extends NotificationService {

    private final String deviceId;

    public PushNotificationService(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    protected Notification createNotification() {
        return new PushNotification(deviceId);
    }
}
