package ru.duester.patterns.strategy.model;

public class Paragraph implements Block {
    private final String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
