package DesignPatterns.behavioural.state.miniProject;

public class App {
    public static void main(String[] args) {
        Order order = new Order();

        order.next();
        order.next();
        order.cancel();
        order.next();
        order.next();
    }
}

interface OrderState {
    void next(Order order);

    void cancel(Order order);
}

class Order {
    private OrderState state = new PlacedState();

    public void setState(OrderState state) {
        this.state = state;
    }

    public void next() {
        state.next(this);
    }

    public void cancel() {
        state.cancel(this);
    }
}

class PlacedState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order packed");
        order.setState(new PackedState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Placed order cancelled");
    }
}

class PackedState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order shipped");
        order.setState(new ShippedState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Packed order cancelled");
    }
}

class ShippedState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order delivered");
        order.setState(new DeliveredState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel shipped order");
    }
}

class DeliveredState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order already delivered");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel delivered order");
    }
}
