package DesignPatterns.behavioural.state;

/*
State1.java

Problem:

Behavior depends on string state and if-else checks.
*/
public class State1 {
    public static void main(String[] args) {
        Order1 order = new Order1();
        order.setState("NEW");
        order.cancel();

        order.setState("SHIPPED");
        order.cancel();
    }
}

class Order1 {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public void cancel() {
        if (state.equals("NEW")) {
            System.out.println("Order cancelled");
        } else if (state.equals("SHIPPED")) {
            System.out.println("Cannot cancel shipped order");
        }
    }
}
