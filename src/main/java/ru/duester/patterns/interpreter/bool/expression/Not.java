package ru.duester.patterns.interpreter.bool.expression;

public class Not implements ru.duester.patterns.interpreter.bool.expression.Expression {
    private final ru.duester.patterns.interpreter.bool.expression.Expression operand;

    public Not(ru.duester.patterns.interpreter.bool.expression.Expression operand) {
        this.operand = operand;
    }

    @Override
    public boolean evaluate() {
        return !operand.evaluate();
    }

    @Override
    public String toString() {
        return "! " + operand;
    }
}
