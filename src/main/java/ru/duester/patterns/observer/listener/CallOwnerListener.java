package ru.duester.patterns.observer.listener;

import ru.duester.patterns.observer.publisher.Car;

public class CallOwnerListener implements CarEventListener {
    private final String phoneNumber;

    public CallOwnerListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(Car.Event event) {
        StringBuilder sb = new StringBuilder();
        sb.append("Звоним собственнику по номеру ").append(phoneNumber);
        String description = switch (event) {
            case SNOW -> "машину засыпало снегом!";
            case HACK -> "машину вскрыли!";
        };
        sb.append(": ").append(description);
        System.out.println(sb);
    }
}
