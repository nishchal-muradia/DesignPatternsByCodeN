package DesignPatterns.behavioural.state;

/*
State3.java

State can also change the context's current state.
*/
public class State3 {
    public static void main(String[] args) {
        Order3 order = new Order3();
        order.next();
        order.next();
        order.cancel();
    }
}

interface OrderState3 {
    void next(Order3 order);

    void cancel(Order3 order);
}

class NewOrderState3 implements OrderState3 {
    @Override
    public void next(Order3 order) {
        System.out.println("Order moved to packed");
        order.setState(new PackedOrderState3());
    }

    @Override
    public void cancel(Order3 order) {
        System.out.println("New order cancelled");
    }
}

class PackedOrderState3 implements OrderState3 {
    @Override
    public void next(Order3 order) {
        System.out.println("Order moved to shipped");
        order.setState(new ShippedOrderState3());
    }

    @Override
    public void cancel(Order3 order) {
        System.out.println("Packed order cancelled");
    }
}

class ShippedOrderState3 implements OrderState3 {
    @Override
    public void next(Order3 order) {
        System.out.println("Order already shipped");
    }

    @Override
    public void cancel(Order3 order) {
        System.out.println("Cannot cancel shipped order");
    }
}

class Order3 {
    private OrderState3 state = new NewOrderState3();

    public void setState(OrderState3 state) {
        this.state = state;
    }

    public void next() {
        state.next(this);
    }

    public void cancel() {
        state.cancel(this);
    }
}
