package DesignPatterns.creational.factoryMethod;

/*
FactoryMethod1.java

Before learning Factory Method, first understand the problem.

Here we are NOT using Factory Method yet.
Here the client code is directly creating objects using the new keyword.

This file is intentionally simple because the first step is to feel the pain clearly.
*/
public class FactoryMethod1 {
    public static void main(String[] args) {

        /*
        Suppose our application wants to send an email notification.

        To do that, we are directly creating EmailNotification1 object here.

        This main method is client code.
        Client code means the code that wants to use the object.
        */
        EmailNotification1 emailNotification = new EmailNotification1();
        emailNotification.send("Your order has been placed.");

        /*
        Now suppose business asks:
        "Can we also send SMS notification?"

        We come back to client code and create another concrete class directly.
        */
        SMSNotification1 smsNotification = new SMSNotification1();
        smsNotification.send("Your order has been shipped.");

        /*
        Problem:

        Client code knows exact class names:
        - EmailNotification1
        - SMSNotification1

        This creates tight coupling.

        Tight coupling means this main method is strongly connected with concrete classes.

        If tomorrow object creation becomes complex, this client code will also become messy.
        Example:
        - Email notification may need SMTP server details
        - SMS notification may need API key
        - Push notification may need device token

        We do not want all creation details inside client code.

        Let's improve this in FactoryMethod2.java.
        */
    }
}

class EmailNotification1 {
    public void send(String message) {
        System.out.println("Sending EMAIL notification: " + message);
    }
}

class SMSNotification1 {
    public void send(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
