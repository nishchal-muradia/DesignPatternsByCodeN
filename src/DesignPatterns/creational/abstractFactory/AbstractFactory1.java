package DesignPatterns.creational.abstractFactory;

/*
AbstractFactory1.java

Before learning Abstract Factory, first understand the problem.

Here we are creating UI components directly in the client code.
This can accidentally mix products from different families.
*/
public class AbstractFactory1 {
    public static void main(String[] args) {

        /*
        Suppose we are building UI for Windows.

        We create WindowsButton1 directly.
        */
        WindowsButton1 button = new WindowsButton1();

        /*
        Mistake:

        We accidentally create MacCheckbox1 with WindowsButton1.

        Code compiles because both are normal classes.
        But design-wise this is wrong because the UI family is mixed.
        */
        MacCheckbox1 checkbox = new MacCheckbox1();

        button.render();
        checkbox.render();

        /*
        Problem:

        Client code knows exact concrete classes.
        Client code is responsible for choosing matching objects.

        If the application has many UI components, this gets messy quickly.

        Let's improve this in AbstractFactory2.java.
        */
    }
}

class WindowsButton1 {
    public void render() {
        System.out.println("Rendering Windows button");
    }
}

class MacCheckbox1 {
    public void render() {
        System.out.println("Rendering Mac checkbox");
    }
}
