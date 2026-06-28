package DesignPatterns.structural.facade;

/*
Facade3.java

Home theater example.

Client calls one method: watchMovie().
Facade handles the internal sequence.
*/
public class Facade3 {
    public static void main(String[] args) {
        HomeTheaterFacade3 homeTheater = new HomeTheaterFacade3();
        homeTheater.watchMovie();
    }
}

class Projector3 {
    public void on() {
        System.out.println("Projector ON");
    }
}

class SoundSystem3 {
    public void on() {
        System.out.println("Sound system ON");
    }
}

class Lights3 {
    public void dim() {
        System.out.println("Lights dimmed");
    }
}

class HomeTheaterFacade3 {
    private final Projector3 projector = new Projector3();
    private final SoundSystem3 soundSystem = new SoundSystem3();
    private final Lights3 lights = new Lights3();

    public void watchMovie() {
        lights.dim();
        projector.on();
        soundSystem.on();
        System.out.println("Movie started");
    }
}
