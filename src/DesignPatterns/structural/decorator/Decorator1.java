package DesignPatterns.structural.decorator;

/*
Decorator1.java

Problem:

If every coffee combination becomes a subclass,
the number of classes grows quickly.
*/
public class Decorator1 {
    public static void main(String[] args) {
        MilkSugarCoffee1 coffee = new MilkSugarCoffee1();
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}

class MilkSugarCoffee1 {
    public String getDescription() {
        return "Coffee with milk and sugar";
    }

    public double getCost() {
        return 80;
    }
}
