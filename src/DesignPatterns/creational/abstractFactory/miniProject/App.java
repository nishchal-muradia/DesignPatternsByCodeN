package DesignPatterns.creational.abstractFactory.miniProject;

public class App {
    public static void main(String[] args) {

        /*
        Client chooses one furniture family.

        After this, the App does not manually create ModernChair, ModernSofa, etc.
        */
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Room modernRoom = new Room(modernFactory);
        modernRoom.showFurniture();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Room victorianRoom = new Room(victorianFactory);
        victorianRoom.showFurniture();
    }
}

class Room {
    private final Chair chair;
    private final Sofa sofa;
    private final CoffeeTable coffeeTable;

    public Room(FurnitureFactory factory) {
        /*
        This constructor receives a factory.

        The factory decides the actual furniture family.
        Room only asks for required products.
        */
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
    }

    public void showFurniture() {
        chair.sitOn();
        sofa.relaxOn();
        coffeeTable.placeCup();
        System.out.println();
    }
}

interface Chair {
    void sitOn();
}

interface Sofa {
    void relaxOn();
}

interface CoffeeTable {
    void placeCup();
}

interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();

    CoffeeTable createCoffeeTable();
}

class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}

class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a clean modern chair");
    }
}

class ModernSofa implements Sofa {
    @Override
    public void relaxOn() {
        System.out.println("Relaxing on a minimal modern sofa");
    }
}

class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void placeCup() {
        System.out.println("Placing cup on a glass modern coffee table");
    }
}

class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a royal Victorian chair");
    }
}

class VictorianSofa implements Sofa {
    @Override
    public void relaxOn() {
        System.out.println("Relaxing on a detailed Victorian sofa");
    }
}

class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void placeCup() {
        System.out.println("Placing cup on a carved Victorian coffee table");
    }
}
