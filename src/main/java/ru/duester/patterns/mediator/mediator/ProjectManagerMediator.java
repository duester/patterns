package ru.duester.patterns.mediator.mediator;

import ru.duester.patterns.mediator.employee.*;

public class ProjectManagerMediator implements Mediator {
    public CustomerEmployee customer;
    public AnalystEmployee analyst;
    public DeveloperEmployee developer;
    public TesterEmployee tester;

    @Override
    public void send(String message, Employee employee) {
        if (employee == customer) {
            analyst.notify(message);
        } else if (employee == analyst) {
            developer.notify(message);
        } else if (employee == developer) {
            tester.notify(message);
        } else if (employee == tester) {
            customer.notify(message);
        }
    }
}
