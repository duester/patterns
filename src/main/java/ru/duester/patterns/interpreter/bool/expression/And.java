package ru.duester.patterns.interpreter.bool.expression;

public class And implements Expression {
    private final ru.duester.patterns.interpreter.bool.expression.Expression left;
    private final ru.duester.patterns.interpreter.bool.expression.Expression right;

    public And(ru.duester.patterns.interpreter.bool.expression.Expression left, ru.duester.patterns.interpreter.bool.expression.Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean evaluate() {
        return left.evaluate() && right.evaluate();
    }

    @Override
    public String toString() {
        return "(" + left + " & " + right + ")";
    }
}
