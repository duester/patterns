package ru.duester.patterns.state;

import ru.duester.patterns.state.model.Lamp;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.turnOn();
        lamp.turnOn();
        lamp.turnOff();
    }
}
