package DesignPatterns.structural.decorator.miniProject;

public class App {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new OliveDecorator(pizza);
        pizza = new PaneerDecorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println("Total cost: " + pizza.getCost());
    }
}

interface Pizza {
    String getDescription();

    double getCost();
}

class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public double getCost() {
        return 100;
    }
}

abstract class PizzaDecorator implements Pizza {
    protected final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 40;
    }
}

class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", olives";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 25;
    }
}

class PaneerDecorator extends PizzaDecorator {
    public PaneerDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", paneer";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50;
    }
}
