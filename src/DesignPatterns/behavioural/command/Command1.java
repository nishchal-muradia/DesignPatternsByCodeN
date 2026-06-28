package DesignPatterns.behavioural.command;

/*
Command1.java

Problem:

Remote directly knows Light class and calls its method.
*/
public class Command1 {
    public static void main(String[] args) {
        Light1 light = new Light1();
        light.turnOn();
    }
}

class Light1 {
    public void turnOn() {
        System.out.println("Light ON");
    }
}
