package ru.duester.patterns.mediator.employee;

import ru.duester.patterns.mediator.mediator.Mediator;

public class AnalystEmployee extends Employee {
    public AnalystEmployee(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение для аналитика: " + message);
    }
}
