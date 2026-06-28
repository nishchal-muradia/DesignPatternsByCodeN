package DesignPatterns.behavioural.mediator.miniProject;

public class App {
    public static void main(String[] args) {
        ControlTower tower = new AirportControlTower();

        Airplane indigo = new Airplane("Indigo 101", tower);
        Airplane vistara = new Airplane("Vistara 202", tower);

        indigo.requestLanding();
        vistara.requestLanding();
        indigo.finishLanding();
        vistara.requestLanding();
    }
}

interface ControlTower {
    void requestLanding(Airplane airplane);

    void finishLanding(Airplane airplane);
}

class AirportControlTower implements ControlTower {
    private boolean runwayBusy;

    @Override
    public void requestLanding(Airplane airplane) {
        if (runwayBusy) {
            System.out.println(airplane.getName() + " must wait. Runway busy.");
        } else {
            runwayBusy = true;
            System.out.println(airplane.getName() + " allowed to land.");
        }
    }

    @Override
    public void finishLanding(Airplane airplane) {
        runwayBusy = false;
        System.out.println(airplane.getName() + " finished landing. Runway free.");
    }
}

class Airplane {
    private final String name;
    private final ControlTower tower;

    public Airplane(String name, ControlTower tower) {
        this.name = name;
        this.tower = tower;
    }

    public String getName() {
        return name;
    }

    public void requestLanding() {
        tower.requestLanding(this);
    }

    public void finishLanding() {
        tower.finishLanding(this);
    }
}
