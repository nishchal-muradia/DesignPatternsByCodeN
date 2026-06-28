package DesignPatterns.creational.factoryMethod;

/*
FactoryMethod4.java

Now we will see the real power of Factory Method.

Requirement changed:

Earlier we had EMAIL and SMS.
Now we want PUSH notification also.

Question:
Can we add PUSH notification without changing old creator logic?

Yes.

We will add:
1. New Concrete Product: PushNotification4
2. New Concrete Creator: PushNotificationCreator4

Old Email and SMS classes do not need to change.
*/
public class FactoryMethod4 {
    public static void main(String[] args) {

        NotificationCreator4 emailCreator = new EmailNotificationCreator4();
        emailCreator.sendNotification("Email invoice generated.");

        NotificationCreator4 smsCreator = new SMSNotificationCreator4();
        smsCreator.sendNotification("SMS delivery update.");

        /*
        New requirement:
        Send push notification.

        We created a new creator and used it here.
        The common flow remains same:

        creator.sendNotification(message)
        */
        NotificationCreator4 pushCreator = new PushNotificationCreator4();
        pushCreator.sendNotification("Push alert: Your driver is arriving.");

        /*
        This is the Open/Closed Principle in action.

        Open for extension:
        We added PushNotification4 and PushNotificationCreator4.

        Closed for modification:
        We did not need to change old EmailNotificationCreator4 or SMSNotificationCreator4.
        */
    }
}

interface Notification4 {
    void send(String message);
}

class EmailNotification4 implements Notification4 {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL notification: " + message);
    }
}

class SMSNotification4 implements Notification4 {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

/*
New Concrete Product

This class is added because the business now wants push notification.
*/
class PushNotification4 implements Notification4 {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH notification: " + message);
    }
}

abstract class NotificationCreator4 {
    public abstract Notification4 createNotification();

    public void sendNotification(String message) {
        Notification4 notification = createNotification();
        notification.send(message);
    }
}

class EmailNotificationCreator4 extends NotificationCreator4 {
    @Override
    public Notification4 createNotification() {
        return new EmailNotification4();
    }
}

class SMSNotificationCreator4 extends NotificationCreator4 {
    @Override
    public Notification4 createNotification() {
        return new SMSNotification4();
    }
}

/*
New Concrete Creator

This class decides to create PushNotification4.
*/
class PushNotificationCreator4 extends NotificationCreator4 {
    @Override
    public Notification4 createNotification() {
        return new PushNotification4();
    }
}
