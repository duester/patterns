package ru.duester.patterns.command;

import ru.duester.patterns.command.command.Add;
import ru.duester.patterns.command.command.Multiply;
import ru.duester.patterns.command.command.Number;
import ru.duester.patterns.command.command.SquareRoot;
import ru.duester.patterns.command.program.Program;

public class Main {
    public static void main(String[] args) {
        // sqrt((3 + 5) * 2)
        // => 3 5 + 2 * sqrt
        // = 4
        Program program = new Program(
                new Number(3.0),
                new Number(5.0),
                new Add(),
                new Number(2.0),
                new Multiply(),
                new SquareRoot()
        );
        System.out.println("[" + program + "] = " + program.execute());
    }
}
