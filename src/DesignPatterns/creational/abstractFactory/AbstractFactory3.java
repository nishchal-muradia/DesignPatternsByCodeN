package DesignPatterns.creational.abstractFactory;

/*
AbstractFactory3.java

This is the proper Abstract Factory structure.

We will create one factory for each family:

1. WindowsFactory3
2. MacFactory3

Each factory creates all related products from the same family.
*/
public class AbstractFactory3 {
    public static void main(String[] args) {

        /*
        If we want Windows UI, we create WindowsFactory3.

        After this point, the client does not create WindowsButton3 or WindowsCheckbox3 directly.
        */
        GUIFactory3 factory = new WindowsFactory3();
        renderScreen(factory);

        /*
        If tomorrow app runs on Mac, only the factory object changes.

        The renderScreen method remains same.
        */
        GUIFactory3 macFactory = new MacFactory3();
        renderScreen(macFactory);
    }

    private static void renderScreen(GUIFactory3 factory) {
        /*
        Client asks factory for related products.

        If factory is WindowsFactory3:
        - createButton gives WindowsButton3
        - createCheckbox gives WindowsCheckbox3

        If factory is MacFactory3:
        - createButton gives MacButton3
        - createCheckbox gives MacCheckbox3
        */
        Button3 button = factory.createButton();
        Checkbox3 checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
        System.out.println();
    }
}

/*
Abstract Product 1
*/
interface Button3 {
    void render();
}

/*
Abstract Product 2
*/
interface Checkbox3 {
    void render();
}

class WindowsButton3 implements Button3 {
    @Override
    public void render() {
        System.out.println("Rendering Windows button");
    }
}

class WindowsCheckbox3 implements Checkbox3 {
    @Override
    public void render() {
        System.out.println("Rendering Windows checkbox");
    }
}

class MacButton3 implements Button3 {
    @Override
    public void render() {
        System.out.println("Rendering Mac button");
    }
}

class MacCheckbox3 implements Checkbox3 {
    @Override
    public void render() {
        System.out.println("Rendering Mac checkbox");
    }
}

/*
Abstract Factory

This factory creates a family of products.
*/
interface GUIFactory3 {
    Button3 createButton();

    Checkbox3 createCheckbox();
}

/*
Concrete Factory for Windows family
*/
class WindowsFactory3 implements GUIFactory3 {
    @Override
    public Button3 createButton() {
        return new WindowsButton3();
    }

    @Override
    public Checkbox3 createCheckbox() {
        return new WindowsCheckbox3();
    }
}

/*
Concrete Factory for Mac family
*/
class MacFactory3 implements GUIFactory3 {
    @Override
    public Button3 createButton() {
        return new MacButton3();
    }

    @Override
    public Checkbox3 createCheckbox() {
        return new MacCheckbox3();
    }
}
