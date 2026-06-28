package DesignPatterns.structural.decorator;

/*
Decorator3.java

Decorators can be stacked.

Simple coffee can become:
Simple coffee + milk + sugar + chocolate
*/
public class Decorator3 {
    public static void main(String[] args) {
        Coffee3 coffee = new SimpleCoffee3();
        coffee = new MilkDecorator3(coffee);
        coffee = new SugarDecorator3(coffee);
        coffee = new ChocolateDecorator3(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}

interface Coffee3 {
    String getDescription();

    double getCost();
}

class SimpleCoffee3 implements Coffee3 {
    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double getCost() {
        return 50;
    }
}

abstract class CoffeeDecorator3 implements Coffee3 {
    protected final Coffee3 coffee;

    public CoffeeDecorator3(Coffee3 coffee) {
        this.coffee = coffee;
    }
}

class MilkDecorator3 extends CoffeeDecorator3 {
    public MilkDecorator3(Coffee3 coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 15;
    }
}

class SugarDecorator3 extends CoffeeDecorator3 {
    public SugarDecorator3(Coffee3 coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 5;
    }
}

class ChocolateDecorator3 extends CoffeeDecorator3 {
    public ChocolateDecorator3(Coffee3 coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", chocolate";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 20;
    }
}
