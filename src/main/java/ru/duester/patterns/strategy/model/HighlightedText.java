package ru.duester.patterns.strategy.model;

public class HighlightedText implements Block {
    private final String text;

    public HighlightedText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
