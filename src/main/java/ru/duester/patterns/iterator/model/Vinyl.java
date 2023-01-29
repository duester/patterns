package ru.duester.patterns.iterator.model;

public class Vinyl {
    private final String title;
    private final String interpreter;
    private final int durationInMinutes;

    public Vinyl(String title, String interpreter, int durationInMinutes) {
        this.title = title;
        this.interpreter = interpreter;
        this.durationInMinutes = durationInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public String getInterpreter() {
        return interpreter;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public String toString() {
        return title + ", автор/исполнитель: " + interpreter + ", продолжительность: " + durationInMinutes + " мин";
    }
}
