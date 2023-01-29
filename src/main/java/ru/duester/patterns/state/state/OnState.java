package ru.duester.patterns.state.state;

import ru.duester.patterns.state.model.Lamp;

public class OnState implements State {
    @Override
    public String getName() {
        return "ВКЛ";
    }

    @Override
    public void turnOn(Lamp lamp) {
        System.out.println("  Лампа уже включена");
    }

    @Override
    public void turnOff(Lamp lamp) {
        lamp.setState(new OffState());
    }
}
