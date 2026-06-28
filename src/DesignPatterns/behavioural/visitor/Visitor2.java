package DesignPatterns.behavioural.visitor;

/*
Visitor2.java

Tax calculation moves into visitor.
Products accept visitor.
*/
public class Visitor2 {
    public static void main(String[] args) {
        TaxVisitor2 visitor = new TaxVisitor2();

        Product2 book = new Book2(500);
        Product2 laptop = new Laptop2(60000);

        book.accept(visitor);
        laptop.accept(visitor);
    }
}

interface Product2 {
    void accept(ProductVisitor2 visitor);
}

interface ProductVisitor2 {
    void visit(Book2 book);

    void visit(Laptop2 laptop);
}

class Book2 implements Product2 {
    private final double price;

    public Book2(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(ProductVisitor2 visitor) {
        visitor.visit(this);
    }
}

class Laptop2 implements Product2 {
    private final double price;

    public Laptop2(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(ProductVisitor2 visitor) {
        visitor.visit(this);
    }
}

class TaxVisitor2 implements ProductVisitor2 {
    @Override
    public void visit(Book2 book) {
        System.out.println("Book price with tax: " + (book.getPrice() + 20));
    }

    @Override
    public void visit(Laptop2 laptop) {
        System.out.println("Laptop price with tax: " + (laptop.getPrice() + 5000));
    }
}
