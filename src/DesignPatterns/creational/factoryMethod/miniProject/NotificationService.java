package DesignPatterns.creational.factoryMethod.miniProject;

/*
Creator

This abstract class contains the factory method.

The factory method is createNotification().

Why is this class abstract?

Because this parent class knows the common flow:

1. Create notification
2. Send message using that notification

But this parent class does not know which exact notification should be created.

That decision is given to child classes.
*/
public abstract class NotificationService {

    /*
    Factory Method

    This method returns Notification interface.

    It does not return EmailNotification, SMSNotification, or PushNotification directly.

    This keeps the common service flow dependent on abstraction.
    */
    protected abstract Notification createNotification();

    /*
    This is the common business operation.

    Every notification service follows the same high-level steps:

    1. Create the proper notification object
    2. Send the message

    The creation step is delegated to createNotification().
    */
    public void notifyUser(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
