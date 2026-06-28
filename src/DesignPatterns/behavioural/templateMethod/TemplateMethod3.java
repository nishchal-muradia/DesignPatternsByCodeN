package DesignPatterns.behavioural.templateMethod;

/*
TemplateMethod3.java

Hook method lets child decide whether optional step should run.
*/
public class TemplateMethod3 {
    public static void main(String[] args) {
        Beverage3 plainTea = new PlainTea3();
        plainTea.prepare();
    }
}

abstract class Beverage3 {
    public final void prepare() {
        boilWater();
        addMainIngredient();
        pourInCup();

        if (customerWantsExtra()) {
            addExtra();
        }
    }

    private void boilWater() {
        System.out.println("Boil water");
    }

    protected abstract void addMainIngredient();

    private void pourInCup() {
        System.out.println("Pour in cup");
    }

    protected abstract void addExtra();

    protected boolean customerWantsExtra() {
        return true;
    }
}

class PlainTea3 extends Beverage3 {
    @Override
    protected void addMainIngredient() {
        System.out.println("Add tea leaves");
    }

    @Override
    protected void addExtra() {
        System.out.println("Add lemon");
    }

    @Override
    protected boolean customerWantsExtra() {
        return false;
    }
}
