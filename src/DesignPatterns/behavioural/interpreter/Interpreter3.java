package DesignPatterns.behavioural.interpreter;

import java.util.HashMap;
import java.util.Map;

/*
Interpreter3.java

Now expression can use variables from context.
*/
public class Interpreter3 {
    public static void main(String[] args) {
        Map<String, Integer> context = new HashMap<String, Integer>();
        context.put("a", 5);
        context.put("b", 10);

        Expression3 expression = new PlusExpression3(
                new VariableExpression3("a"),
                new VariableExpression3("b")
        );

        System.out.println(expression.interpret(context));
    }
}

interface Expression3 {
    int interpret(Map<String, Integer> context);
}

class VariableExpression3 implements Expression3 {
    private final String name;

    public VariableExpression3(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return context.get(name);
    }
}

class PlusExpression3 implements Expression3 {
    private final Expression3 left;
    private final Expression3 right;

    public PlusExpression3(Expression3 left, Expression3 right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
}
