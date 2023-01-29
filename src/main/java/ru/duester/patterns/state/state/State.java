package ru.duester.patterns.state.state;

import ru.duester.patterns.state.model.Lamp;

public interface State {
    public abstract String getName();

    public abstract void turnOn(Lamp lamp);

    public abstract void turnOff(Lamp lamp);
}
