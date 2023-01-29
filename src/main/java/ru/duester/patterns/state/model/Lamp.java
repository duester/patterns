package ru.duester.patterns.state.model;

import ru.duester.patterns.state.state.OffState;
import ru.duester.patterns.state.state.State;

public class Lamp {
    private State state;

    public Lamp() {
        this.state = new OffState();
    }

    public void turnOn() {
        System.out.println("Включаем лампу:");
        state.turnOn(this);
    }

    public void turnOff() {
        System.out.println("Выключаем лампу:");
        state.turnOff(this);
    }

    public void setState(State state) {
        System.out.println("  изменяем состояние на " + state.getName() + "...");
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
