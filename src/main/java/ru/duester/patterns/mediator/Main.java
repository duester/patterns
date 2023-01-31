package ru.duester.patterns.mediator;

import ru.duester.patterns.mediator.employee.AnalystEmployee;
import ru.duester.patterns.mediator.employee.CustomerEmployee;
import ru.duester.patterns.mediator.employee.DeveloperEmployee;
import ru.duester.patterns.mediator.employee.TesterEmployee;
import ru.duester.patterns.mediator.mediator.ProjectManagerMediator;

public class Main {
    public static void main(String[] args) {
        ProjectManagerMediator mediator = new ProjectManagerMediator();

        CustomerEmployee customer = new CustomerEmployee(mediator);
        AnalystEmployee analyst = new AnalystEmployee(mediator);
        DeveloperEmployee developer = new DeveloperEmployee(mediator);
        TesterEmployee tester = new TesterEmployee(mediator);

        mediator.customer = customer;
        mediator.analyst = analyst;
        mediator.developer = developer;
        mediator.tester = tester;

        customer.send("Нужна новая фича, пиши технические требования");
        analyst.send("Требования написаны, пора кодить");
        developer.send("Всё разработано, гляньте одним глазом");
        tester.send("Багов нет, в прод!");
    }
}
