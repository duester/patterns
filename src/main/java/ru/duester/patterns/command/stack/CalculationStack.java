package ru.duester.patterns.command.stack;

import java.util.Stack;

public class CalculationStack {
    private static final CalculationStack instance = new CalculationStack();

    private final Stack<Double> stack = new Stack<>();

    private CalculationStack() {
    }

    public static CalculationStack getInstance() {
        return instance;
    }

    public void push(double value) {
        stack.push(value);
    }

    public double pop() {
        return stack.pop();
    }

    public double getResult() {
        return stack.peek();
    }
}
