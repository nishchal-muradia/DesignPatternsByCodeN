package DesignPatterns.structural.bridge;

/*
Bridge1.java

First see the problem.

Remote type and device type are mixed into separate classes.
This can create too many combinations.
*/
public class Bridge1 {
    public static void main(String[] args) {
        BasicTVRemote1 tvRemote = new BasicTVRemote1();
        tvRemote.turnOn();

        BasicRadioRemote1 radioRemote = new BasicRadioRemote1();
        radioRemote.turnOn();
    }
}

class BasicTVRemote1 {
    public void turnOn() {
        System.out.println("Basic remote turns on TV");
    }
}

class BasicRadioRemote1 {
    public void turnOn() {
        System.out.println("Basic remote turns on Radio");
    }
}
