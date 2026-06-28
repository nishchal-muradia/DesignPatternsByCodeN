package DesignPatterns.creational.factoryMethod;

/*
FactoryMethod3.java

Now we are implementing Factory Method in a more proper design-pattern style.

We will use:

1. Product
2. Concrete Product
3. Creator
4. Concrete Creator

Do not worry about these names.
Once you see the code, the idea is simple.
*/
public class FactoryMethod3 {
    public static void main(String[] args) {

        /*
        Creator reference can point to EmailNotificationCreator3.

        This is polymorphism.

        Polymorphism means parent type reference can hold child type object.
        */
        NotificationCreator3 emailCreator = new EmailNotificationCreator3();

        /*
        Client does not directly create EmailNotification3.

        Client asks creator to send notification.

        Internally, the creator will call its factory method and create the object.
        */
        emailCreator.sendNotification("Welcome to the application.");

        NotificationCreator3 smsCreator = new SMSNotificationCreator3();
        smsCreator.sendNotification("Your login OTP is 987654.");

        /*
        Main benefit:

        Client code works with NotificationCreator3.
        Concrete creator decides which notification object to create.
        */
    }
}

/*
PRODUCT

This interface represents the object we want to create.

Every notification type must implement this interface.
*/
interface Notification3 {
    void send(String message);
}

/*
CONCRETE PRODUCT

This is one real implementation of Notification3.
*/
class EmailNotification3 implements Notification3 {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL notification: " + message);
    }
}

/*
CONCRETE PRODUCT

This is another real implementation of Notification3.
*/
class SMSNotification3 implements Notification3 {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}

/*
CREATOR

This class contains the factory method.

The factory method is createNotification().

Notice:
This class does not know whether EmailNotification3 or SMSNotification3 will be created.

It only says:
"Child class, please tell me which Notification3 object to create."
*/
abstract class NotificationCreator3 {

    /*
    This is the Factory Method.

    It returns Notification3 interface.

    The method is abstract because this parent creator does not decide the exact class.
    Concrete creators will decide that.
    */
    public abstract Notification3 createNotification();

    /*
    This method is normal business logic.

    It uses the object created by the factory method.

    Important point:
    This method does not care whether the object is email or SMS.
    It only cares that the object has send method.
    */
    public void sendNotification(String message) {
        Notification3 notification = createNotification();
        notification.send(message);
    }
}

/*
CONCRETE CREATOR

This class decides to create EmailNotification3.
*/
class EmailNotificationCreator3 extends NotificationCreator3 {
    @Override
    public Notification3 createNotification() {
        return new EmailNotification3();
    }
}

/*
CONCRETE CREATOR

This class decides to create SMSNotification3.
*/
class SMSNotificationCreator3 extends NotificationCreator3 {
    @Override
    public Notification3 createNotification() {
        return new SMSNotification3();
    }
}
