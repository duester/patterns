package ru.duester.patterns.strategy;

import ru.duester.patterns.strategy.model.Document;
import ru.duester.patterns.strategy.model.HighlightedText;
import ru.duester.patterns.strategy.model.Paragraph;
import ru.duester.patterns.strategy.model.Table;
import ru.duester.patterns.strategy.output.Html;
import ru.duester.patterns.strategy.output.Markdown;
import ru.duester.patterns.strategy.output.OutputFormat;
import ru.duester.patterns.strategy.output.PlainText;

public class Main {
    public static void main(String[] args) {
        Document document = createDocument();
        OutputFormat format = new Html();
        String output = format.output(document);
        System.out.println(output);
    }

    private static Document createDocument() {
        return new Document(
                new HighlightedText("Стих"),
                new Paragraph("Однажды в студёную зимнюю пору,"),
                new Paragraph("Я из лесу вышел; был сильный мороз."),
                new Table("Таблица истинности логического 'и':",
                        new Table.Row(
                                new Table.Column("a"),
                                new Table.Column("b"),
                                new Table.Column("a^b")),
                        new Table.Row(
                                new Table.Column("0"),
                                new Table.Column("0"),
                                new Table.Column("0")
                        ),
                        new Table.Row(
                                new Table.Column("0"),
                                new Table.Column("1"),
                                new Table.Column("0")
                        ),
                        new Table.Row(
                                new Table.Column("1"),
                                new Table.Column("0"),
                                new Table.Column("0")
                        ),
                        new Table.Row(
                                new Table.Column("1"),
                                new Table.Column("1"),
                                new Table.Column("1")
                        ))
        );
    }
}
