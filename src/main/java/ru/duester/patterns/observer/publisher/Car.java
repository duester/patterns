package ru.duester.patterns.observer.publisher;

import ru.duester.patterns.observer.listener.CarEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Car {
    public enum Event {
        SNOW, HACK
    }

    private final Map<Event, List<CarEventListener>> listeners = new HashMap<>();

    public Car() {
        for (Event event : Event.values()) {
            listeners.put(event, new ArrayList<>());
        }
    }

    public void letItSnow() {
        notify(Event.SNOW);
    }

    public void hack() {
        notify(Event.HACK);
    }

    public void subscribe(Event eventType, CarEventListener listener) {
        listeners.get(eventType).add(listener);
    }

    public void unsubscribe(Event eventType, CarEventListener listener) {
        listeners.get(eventType).remove(listener);
    }

    public void notify(Event eventType) {
        listeners.get(eventType).forEach(listener -> listener.update(eventType));
    }
}
