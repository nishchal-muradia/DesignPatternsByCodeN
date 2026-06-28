package DesignPatterns.structural.decorator;

/*
Decorator2.java

Now we wrap SimpleCoffee2 with MilkDecorator2.
*/
public class Decorator2 {
    public static void main(String[] args) {
        Coffee2 coffee = new SimpleCoffee2();
        Coffee2 milkCoffee = new MilkDecorator2(coffee);

        System.out.println(milkCoffee.getDescription());
        System.out.println(milkCoffee.getCost());
    }
}

interface Coffee2 {
    String getDescription();

    double getCost();
}

class SimpleCoffee2 implements Coffee2 {
    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double getCost() {
        return 50;
    }
}

class MilkDecorator2 implements Coffee2 {
    private final Coffee2 coffee;

    public MilkDecorator2(Coffee2 coffee) {
        this.coffee = coffee;
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
