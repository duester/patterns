package ru.duester.patterns.visitor.model;

import ru.duester.patterns.visitor.visitor.Visitor;

public interface Block {
    String accept(Visitor visitor);
}
