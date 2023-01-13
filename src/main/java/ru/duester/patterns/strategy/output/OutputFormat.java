package ru.duester.patterns.strategy.output;

import ru.duester.patterns.strategy.model.*;

import java.util.stream.Collectors;

public abstract class OutputFormat {
    public String output(Document document) {
        return document.getBlocks().stream().map(this::output)
                .collect(Collectors.joining("\n"));
    }

    private String output(Block block) {
        if (block instanceof Paragraph p) {
            return output(p);
        }
        if (block instanceof HighlightedText ht) {
            return output(ht);
        }
        if (block instanceof Table t) {
            return output(t);
        }
        throw new IllegalArgumentException("Неподдерживаемый тип блока: " + block.getClass().getSimpleName());
    }

    abstract public String output(Paragraph paragraph);

    abstract public String output(HighlightedText text);

    abstract public String output(Table table);
}
