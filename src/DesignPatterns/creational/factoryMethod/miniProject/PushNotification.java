package DesignPatterns.creational.factoryMethod.miniProject;

/*
Concrete Product

This class represents real push notification.
*/
public class PushNotification implements Notification {

    private final String deviceId;

    public PushNotification(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void send(String message) {
        System.out.println("PUSH");
        System.out.println("Device  : " + deviceId);
        System.out.println("Message : " + message);
        System.out.println();
    }
}
