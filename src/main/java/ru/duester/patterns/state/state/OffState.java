package ru.duester.patterns.state.state;

import ru.duester.patterns.state.model.Lamp;

public class OffState implements State {
    @Override
    public String getName() {
        return "ВЫКЛ";
    }

    @Override
    public void turnOn(Lamp lamp) {
        lamp.setState(new OnState());
    }

    @Override
    public void turnOff(Lamp lamp) {
        System.out.println("  Лампа уже выключена");
    }
}
