package ru.duester.patterns.mediator.employee;

import ru.duester.patterns.mediator.mediator.Mediator;

public class CustomerEmployee extends Employee {
    public CustomerEmployee(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение для заказчика: " + message);
    }
}
