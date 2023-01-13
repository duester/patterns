package ru.duester.patterns.command.command;

import ru.duester.patterns.command.stack.CalculationStack;

public class Number implements Command {
    private final double number;

    public Number(double number) {
        this.number = number;
    }

    @Override
    public void execute() {
        CalculationStack.getInstance().push(number);
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
