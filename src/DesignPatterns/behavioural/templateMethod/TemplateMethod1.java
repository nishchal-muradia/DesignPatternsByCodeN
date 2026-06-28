package DesignPatterns.behavioural.templateMethod;

/*
TemplateMethod1.java

Problem:

Tea and coffee repeat the same process steps.
*/
public class TemplateMethod1 {
    public static void main(String[] args) {
        Tea1 tea = new Tea1();
        tea.prepare();

        Coffee1 coffee = new Coffee1();
        coffee.prepare();
    }
}

class Tea1 {
    public void prepare() {
        System.out.println("Boil water");
        System.out.println("Add tea leaves");
        System.out.println("Pour in cup");
        System.out.println("Add lemon");
    }
}

class Coffee1 {
    public void prepare() {
        System.out.println("Boil water");
        System.out.println("Add coffee powder");
        System.out.println("Pour in cup");
        System.out.println("Add sugar");
    }
}
