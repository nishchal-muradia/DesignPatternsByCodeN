package DesignPatterns.behavioural.visitor;

/*
Visitor3.java

Now we add DiscountVisitor3 as a new operation.

Book3 and Laptop3 do not need discount methods.
*/
public class Visitor3 {
    public static void main(String[] args) {
        Product3 book = new Book3(500);
        Product3 laptop = new Laptop3(60000);

        ProductVisitor3 discountVisitor = new DiscountVisitor3();
        book.accept(discountVisitor);
        laptop.accept(discountVisitor);
    }
}

interface Product3 {
    void accept(ProductVisitor3 visitor);
}

interface ProductVisitor3 {
    void visit(Book3 book);

    void visit(Laptop3 laptop);
}

class Book3 implements Product3 {
    private final double price;

    public Book3(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(ProductVisitor3 visitor) {
        visitor.visit(this);
    }
}

class Laptop3 implements Product3 {
    private final double price;

    public Laptop3(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(ProductVisitor3 visitor) {
        visitor.visit(this);
    }
}

class DiscountVisitor3 implements ProductVisitor3 {
    @Override
    public void visit(Book3 book) {
        System.out.println("Book price after discount: " + (book.getPrice() - 50));
    }

    @Override
    public void visit(Laptop3 laptop) {
        System.out.println("Laptop price after discount: " + (laptop.getPrice() - 3000));
    }
}
