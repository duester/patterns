package ru.duester.patterns.observer.listener;

import ru.duester.patterns.observer.publisher.Car;

public class TakePhotoListener implements CarEventListener {
    @Override
    public void update(Car.Event event) {
        String description = switch (event) {
            case HACK -> "Машина вскрыта! Снимаем фото взломщика.";
            default -> "Ложная тревога";
        };
        System.out.println(description);
    }
}
