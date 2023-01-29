package ru.duester.patterns.observer.listener;

import ru.duester.patterns.observer.publisher.Car;

public class CallPoliceListener implements CarEventListener {
    @Override
    public void update(Car.Event event) {
        StringBuilder sb = new StringBuilder();
        sb.append("Звоним в полицию");
        String description = switch (event) {
            case HACK -> "машину вскрыли!";
            default -> "кажется, ошиблись номером";
        };
        sb.append(": ").append(description);
        System.out.println(sb);
    }
}
