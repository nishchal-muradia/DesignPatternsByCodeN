package DesignPatterns.behavioural.strategy.miniProject;

public class App {
    public static void main(String[] args) {
        Cart cart = new Cart(2000);

        cart.setShippingStrategy(new StandardShipping());
        cart.printTotal();

        cart.setShippingStrategy(new SameDayShipping());
        cart.printTotal();
    }
}

interface ShippingStrategy {
    double calculate(double cartAmount);
}

class StandardShipping implements ShippingStrategy {
    @Override
    public double calculate(double cartAmount) {
        return 50;
    }
}

class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculate(double cartAmount) {
        return 120;
    }
}

class SameDayShipping implements ShippingStrategy {
    @Override
    public double calculate(double cartAmount) {
        return 250;
    }
}

class Cart {
    private final double cartAmount;
    private ShippingStrategy shippingStrategy;

    public Cart(double cartAmount) {
        this.cartAmount = cartAmount;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void printTotal() {
        double shipping = shippingStrategy.calculate(cartAmount);
        System.out.println("Cart amount: " + cartAmount);
        System.out.println("Shipping: " + shipping);
        System.out.println("Total: " + (cartAmount + shipping));
    }
}
