package ru.duester.patterns.command.program;

import ru.duester.patterns.command.command.Command;
import ru.duester.patterns.command.stack.CalculationStack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    private final List<Command> commands;

    public Program(Command... commands) {
        this.commands = Arrays.asList(commands);
    }

    public double execute() {
        for (Command command : commands) {
            command.execute();
        }
        return CalculationStack.getInstance().getResult();
    }

    @Override
    public String toString() {
        return commands.stream().map(Command::toString).collect(Collectors.joining(" "));
    }
}
