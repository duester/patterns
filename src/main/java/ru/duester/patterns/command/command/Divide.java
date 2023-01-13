package ru.duester.patterns.command.command;

import ru.duester.patterns.command.stack.CalculationStack;

public class Divide implements Command {
    @Override
    public void execute() {
        CalculationStack stack = CalculationStack.getInstance();
        double a = stack.pop();
        double b = stack.pop();
        stack.push(b / a);
    }

    @Override
    public String toString() {
        return "/";
    }
}
