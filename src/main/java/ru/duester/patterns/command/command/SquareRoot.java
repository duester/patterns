package ru.duester.patterns.command.command;

import ru.duester.patterns.command.stack.CalculationStack;

public class SquareRoot implements Command {
    @Override
    public void execute() {
        CalculationStack stack = CalculationStack.getInstance();
        double a = stack.pop();
        stack.push(Math.sqrt(a));
    }

    @Override
    public String toString() {
        return "sqrt";
    }
}
