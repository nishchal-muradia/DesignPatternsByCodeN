package DesignPatterns.structural.bridge;

/*
Bridge2.java

Now Remote and Device are separated.

Remote is abstraction.
Device is implementation.

Remote talks to Device through an interface.
*/
public class Bridge2 {
    public static void main(String[] args) {
        Device2 tv = new TV2();
        Remote2 tvRemote = new BasicRemote2(tv);
        tvRemote.turnOn();

        Device2 radio = new Radio2();
        Remote2 radioRemote = new BasicRemote2(radio);
        radioRemote.turnOn();
    }
}

interface Device2 {
    void turnOn();
}

class TV2 implements Device2 {
    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }
}

class Radio2 implements Device2 {
    @Override
    public void turnOn() {
        System.out.println("Radio is ON");
    }
}

abstract class Remote2 {
    protected final Device2 device;

    public Remote2(Device2 device) {
        this.device = device;
    }

    public abstract void turnOn();
}

class BasicRemote2 extends Remote2 {
    public BasicRemote2(Device2 device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }
}
