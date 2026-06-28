package DesignPatterns.creational.factoryMethod;

/*
FactoryMethod2.java

Now we are improving the code.

In FactoryMethod1.java, client code directly created objects.

Here we will create objects through one method.
That method will act like a factory method.
*/
public class FactoryMethod2 {
    public static void main(String[] args) {

        /*
        Client code is no longer writing:

        new EmailNotification2()
        new SMSNotification2()

        Instead, it asks NotificationFactory2 to create the object.
        */
        Notification2 emailNotification = NotificationFactory2.createNotification("EMAIL");
        emailNotification.send("Your payment was successful.");

        Notification2 smsNotification = NotificationFactory2.createNotification("SMS");
        smsNotification.send("Your OTP is 123456.");

        /*
        What improved?

        Object creation logic moved away from main method.

        Main method only says what type it wants.
        Factory method decides which class object should be returned.

        This is cleaner than FactoryMethod1.java.

        But there is still one issue:

        If we add a new type like PUSH, we must modify the if-else inside factory.

        In FactoryMethod3.java, we will move toward the classic Factory Method pattern
        using Creator and Concrete Creator classes.
        */
    }
}

/*
This is the Product.

Product means common parent type.

Both EmailNotification2 and SMSNotification2 will follow this contract.

Contract means:
Every notification must have a send method.
*/
interface Notification2 {
    void send(String message);
}

/*
Concrete Product 1

This is a real notification class.
It knows how to send email notification.
*/
class EmailNotification2 implements Notification2 {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL notification: " + message);
    }
}

/*
Concrete Product 2

This is another real notification class.
It knows how to send SMS notification.
*/
class SMSNotification2 implements Notification2 {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

class NotificationFactory2 {

    /*
    This method is responsible for object creation.

    Because this method creates and returns notification objects,
    we can call it a factory method.

    Notice the return type is Notification2, not EmailNotification2 or SMSNotification2.

    Why?

    Because client code should depend on the common interface.
    Client code should not be forced to depend on concrete classes.
    */
    public static Notification2 createNotification(String type) {

        if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification2();
        }

        if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification2();
        }

        /*
        If someone passes a wrong type, we throw an exception.

        This is better than returning null because null can create
        NullPointerException later in some other line.

        With exception, we fail fast and clearly.
        */
        throw new IllegalArgumentException("Unknown notification type: " + type);
    }
}
