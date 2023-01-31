package ru.duester.patterns.mediator.employee;

import ru.duester.patterns.mediator.mediator.Mediator;

public class TesterEmployee extends Employee {
    public TesterEmployee(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение для тестировщика: " + message);
    }
}
