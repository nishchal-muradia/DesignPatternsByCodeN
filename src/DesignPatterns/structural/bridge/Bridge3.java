package DesignPatterns.structural.bridge;

/*
Bridge3.java

Now we add AdvancedRemote3 without changing TV3 or Radio3.

That is the benefit of Bridge.
Abstraction side and implementation side can grow separately.
*/
public class Bridge3 {
    public static void main(String[] args) {
        Remote3 advancedTVRemote = new AdvancedRemote3(new TV3());
        advancedTVRemote.turnOn();

        Remote3 advancedRadioRemote = new AdvancedRemote3(new Radio3());
        advancedRadioRemote.turnOn();
    }
}

interface Device3 {
    void turnOn();

    void setVolume(int volume);
}

class TV3 implements Device3 {
    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}

class Radio3 implements Device3 {
    @Override
    public void turnOn() {
        System.out.println("Radio is ON");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Radio volume set to " + volume);
    }
}

abstract class Remote3 {
    protected final Device3 device;

    public Remote3(Device3 device) {
        this.device = device;
    }

    public abstract void turnOn();
}

class AdvancedRemote3 extends Remote3 {
    public AdvancedRemote3(Device3 device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
        device.setVolume(20);
    }
}
