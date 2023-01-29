package ru.duester.patterns.visitor.visitor;

import ru.duester.patterns.visitor.model.Document;
import ru.duester.patterns.visitor.model.HighlightedText;
import ru.duester.patterns.visitor.model.Paragraph;
import ru.duester.patterns.visitor.model.Table;

import java.util.stream.Collectors;

public interface Visitor {
    String visit(Paragraph paragraph);

    String visit(HighlightedText text);

    String visit(Table table);

    default String visit(Document document) {
        return document.getBlocks().stream().map(block -> block.accept(this))
                .collect(Collectors.joining("\n"));
    }
}
