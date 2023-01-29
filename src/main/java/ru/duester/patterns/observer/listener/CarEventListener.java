package ru.duester.patterns.observer.listener;

import ru.duester.patterns.observer.publisher.Car;

public interface CarEventListener {
    void update(Car.Event event);
}
