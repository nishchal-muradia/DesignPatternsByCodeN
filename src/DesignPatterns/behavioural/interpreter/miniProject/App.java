package DesignPatterns.behavioural.interpreter.miniProject;

public class App {
    public static void main(String[] args) {
        OrderContext order = new OrderContext(true, 7500);

        RuleExpression discountRule = new AndRule(
                new PremiumCustomerRule(),
                new CartTotalRule(5000)
        );

        if (discountRule.interpret(order)) {
            System.out.println("Discount applied");
        } else {
            System.out.println("Discount not applied");
        }
    }
}

class OrderContext {
    private final boolean premiumCustomer;
    private final double cartTotal;

    public OrderContext(boolean premiumCustomer, double cartTotal) {
        this.premiumCustomer = premiumCustomer;
        this.cartTotal = cartTotal;
    }

    public boolean isPremiumCustomer() {
        return premiumCustomer;
    }

    public double getCartTotal() {
        return cartTotal;
    }
}

interface RuleExpression {
    boolean interpret(OrderContext context);
}

class PremiumCustomerRule implements RuleExpression {
    @Override
    public boolean interpret(OrderContext context) {
        return context.isPremiumCustomer();
    }
}

class CartTotalRule implements RuleExpression {
    private final double minimumAmount;

    public CartTotalRule(double minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    @Override
    public boolean interpret(OrderContext context) {
        return context.getCartTotal() >= minimumAmount;
    }
}

class AndRule implements RuleExpression {
    private final RuleExpression left;
    private final RuleExpression right;

    public AndRule(RuleExpression left, RuleExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(OrderContext context) {
        return left.interpret(context) && right.interpret(context);
    }
}
