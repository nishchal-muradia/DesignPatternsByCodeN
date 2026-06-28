package DesignPatterns.creational.abstractFactory;

/*
AbstractFactory2.java

Here we move object creation into factory methods.

This is better than direct new in client code.
But this still creates products one by one.

It does not strongly protect us from mixing families.
*/
public class AbstractFactory2 {
    public static void main(String[] args) {

        Button2 button = UIFactory2.createButton("WINDOWS");
        Checkbox2 checkbox = UIFactory2.createCheckbox("WINDOWS");

        button.render();
        checkbox.render();

        /*
        This is cleaner.

        But the client still passes "WINDOWS" two times.

        What if someone writes:

        Button2 button = UIFactory2.createButton("WINDOWS");
        Checkbox2 checkbox = UIFactory2.createCheckbox("MAC");

        Again family mismatch can happen.

        Abstract Factory fixes this by giving one factory object for the whole family.
        */
    }
}

interface Button2 {
    void render();
}

interface Checkbox2 {
    void render();
}

class WindowsButton2 implements Button2 {
    @Override
    public void render() {
        System.out.println("Rendering Windows button");
    }
}

class MacButton2 implements Button2 {
    @Override
    public void render() {
        System.out.println("Rendering Mac button");
    }
}

class WindowsCheckbox2 implements Checkbox2 {
    @Override
    public void render() {
        System.out.println("Rendering Windows checkbox");
    }
}

class MacCheckbox2 implements Checkbox2 {
    @Override
    public void render() {
        System.out.println("Rendering Mac checkbox");
    }
}

class UIFactory2 {
    public static Button2 createButton(String os) {
        if (os.equalsIgnoreCase("WINDOWS")) {
            return new WindowsButton2();
        }
        if (os.equalsIgnoreCase("MAC")) {
            return new MacButton2();
        }
        throw new IllegalArgumentException("Unknown OS: " + os);
    }

    public static Checkbox2 createCheckbox(String os) {
        if (os.equalsIgnoreCase("WINDOWS")) {
            return new WindowsCheckbox2();
        }
        if (os.equalsIgnoreCase("MAC")) {
            return new MacCheckbox2();
        }
        throw new IllegalArgumentException("Unknown OS: " + os);
    }
}
