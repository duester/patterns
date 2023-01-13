package ru.duester.patterns.interpreter.bool;

import ru.duester.patterns.interpreter.bool.expression.*;

public class Main {
    public static void main(String[] args) {
        // (false || true) && (! true)
        // = false
        Expression expression = new And(
                new Or(
                        new Constant(false), new Constant(true)
                ),
                new Not(new Constant(true))
        );
        System.out.println(expression + " = " + expression.evaluate());
    }
}
