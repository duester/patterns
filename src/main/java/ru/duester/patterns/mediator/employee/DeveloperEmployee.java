package ru.duester.patterns.mediator.employee;

import ru.duester.patterns.mediator.mediator.Mediator;

public class DeveloperEmployee extends Employee {
    public DeveloperEmployee(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение для разработчика: " + message);
    }
}
