package DesignPatterns.behavioural.state;

/*
State2.java

Now each state has its own class.
*/
public class State2 {
    public static void main(String[] args) {
        Order2 order = new Order2();

        order.setState(new NewOrderState2());
        order.cancel();

        order.setState(new ShippedOrderState2());
        order.cancel();
    }
}

interface OrderState2 {
    void cancel();
}

class NewOrderState2 implements OrderState2 {
    @Override
    public void cancel() {
        System.out.println("Order cancelled");
    }
}

class ShippedOrderState2 implements OrderState2 {
    @Override
    public void cancel() {
        System.out.println("Cannot cancel shipped order");
    }
}

class Order2 {
    private OrderState2 state;

    public void setState(OrderState2 state) {
        this.state = state;
    }

    public void cancel() {
        state.cancel();
    }
}
