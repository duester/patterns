package ru.duester.patterns.visitor.model;

import ru.duester.patterns.visitor.visitor.Visitor;

public class HighlightedText implements Block {
    private final String text;

    public HighlightedText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
