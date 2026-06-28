package DesignPatterns.behavioural.visitor.miniProject;

public class App {
    public static void main(String[] args) {
        CartItem[] items = {
                new BookItem("Java Basics", 500),
                new MobileItem("Pixel", 60000)
        };

        CartVisitor priceVisitor = new PriceVisitor();
        CartVisitor shippingVisitor = new ShippingVisitor();

        for (CartItem item : items) {
            item.accept(priceVisitor);
            item.accept(shippingVisitor);
        }
    }
}

interface CartItem {
    void accept(CartVisitor visitor);
}

interface CartVisitor {
    void visit(BookItem book);

    void visit(MobileItem mobile);
}

class BookItem implements CartItem {
    private final String title;
    private final double price;

    public BookItem(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}

class MobileItem implements CartItem {
    private final String model;
    private final double price;

    public MobileItem(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}

class PriceVisitor implements CartVisitor {
    @Override
    public void visit(BookItem book) {
        System.out.println(book.getTitle() + " final price: " + (book.getPrice() + 20));
    }

    @Override
    public void visit(MobileItem mobile) {
        System.out.println(mobile.getModel() + " final price: " + (mobile.getPrice() + 5000));
    }
}

class ShippingVisitor implements CartVisitor {
    @Override
    public void visit(BookItem book) {
        System.out.println(book.getTitle() + " shipping: 40");
    }

    @Override
    public void visit(MobileItem mobile) {
        System.out.println(mobile.getModel() + " shipping: 100");
    }
}
