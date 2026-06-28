package DesignPatterns.behavioural.templateMethod;

/*
TemplateMethod2.java

Parent class defines common algorithm.
Child classes implement changing steps.
*/
public class TemplateMethod2 {
    public static void main(String[] args) {
        Beverage2 tea = new Tea2();
        tea.prepare();

        Beverage2 coffee = new Coffee2();
        coffee.prepare();
    }
}

abstract class Beverage2 {
    public final void prepare() {
        boilWater();
        addMainIngredient();
        pourInCup();
        addExtra();
    }

    private void boilWater() {
        System.out.println("Boil water");
    }

    protected abstract void addMainIngredient();

    private void pourInCup() {
        System.out.println("Pour in cup");
    }

    protected abstract void addExtra();
}

class Tea2 extends Beverage2 {
    @Override
    protected void addMainIngredient() {
        System.out.println("Add tea leaves");
    }

    @Override
    protected void addExtra() {
        System.out.println("Add lemon");
    }
}

class Coffee2 extends Beverage2 {
    @Override
    protected void addMainIngredient() {
        System.out.println("Add coffee powder");
    }

    @Override
    protected void addExtra() {
        System.out.println("Add sugar");
    }
}
