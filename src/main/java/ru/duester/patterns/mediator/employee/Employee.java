package ru.duester.patterns.mediator.employee;

import ru.duester.patterns.mediator.mediator.Mediator;

public abstract class Employee {
    protected Mediator mediator;

    public Employee(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    abstract public void notify(String message);
}
