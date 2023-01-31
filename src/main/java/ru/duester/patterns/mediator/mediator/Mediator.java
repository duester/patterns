package ru.duester.patterns.mediator.mediator;

import ru.duester.patterns.mediator.employee.Employee;

public interface Mediator {
    void send(String message, Employee employee);
}
