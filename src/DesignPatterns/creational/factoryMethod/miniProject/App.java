package DesignPatterns.creational.factoryMethod.miniProject;

public class App {
    public static void main(String[] args) {

        /*
        Imagine this App class is our real application.

        Maybe this is an ecommerce app.
        After order placement, we want to notify the user.

        We can notify by email, SMS, or push notification.

        Important:
        App class will not create concrete notification objects directly.
        App class will use NotificationService.
        */

        NotificationService emailService = new EmailNotificationService("customer@example.com");
        emailService.notifyUser("Your order has been placed.");

        NotificationService smsService = new SMSNotificationService("+91-9999999999");
        smsService.notifyUser("Your order has been packed.");

        NotificationService pushService = new PushNotificationService("DEVICE-ABC-123");
        pushService.notifyUser("Your order is out for delivery.");

        /*
        Notice the same method call everywhere:

        notifyUser(message)

        The App class does not worry about:
        - how email object is created
        - how SMS object is created
        - how push object is created

        That object creation responsibility belongs to the concrete service classes.
        */
    }
}
