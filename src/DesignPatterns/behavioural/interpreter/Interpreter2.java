package DesignPatterns.behavioural.interpreter;

/*
Interpreter2.java

Now number and plus are expression objects.
*/
public class Interpreter2 {
    public static void main(String[] args) {
        Expression2 expression = new PlusExpression2(
                new NumberExpression2(5),
                new NumberExpression2(10)
        );

        System.out.println(expression.interpret());
    }
}

interface Expression2 {
    int interpret();
}

class NumberExpression2 implements Expression2 {
    private final int number;

    public NumberExpression2(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}

class PlusExpression2 implements Expression2 {
    private final Expression2 left;
    private final Expression2 right;

    public PlusExpression2(Expression2 left, Expression2 right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
