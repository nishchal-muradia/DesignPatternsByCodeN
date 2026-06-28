package DesignPatterns.behavioural.visitor;

/*
Visitor1.java

Problem:

If we keep adding operations inside product classes,
product classes keep changing.
*/
public class Visitor1 {
    public static void main(String[] args) {
        Book1 book = new Book1(500);
        Laptop1 laptop = new Laptop1(60000);

        System.out.println(book.getPriceWithTax());
        System.out.println(laptop.getPriceWithTax());
    }
}

class Book1 {
    private final double price;

    public Book1(double price) {
        this.price = price;
    }

    public double getPriceWithTax() {
        return price + 20;
    }
}

class Laptop1 {
    private final double price;

    public Laptop1(double price) {
        this.price = price;
    }

    public double getPriceWithTax() {
        return price + 5000;
    }
}
