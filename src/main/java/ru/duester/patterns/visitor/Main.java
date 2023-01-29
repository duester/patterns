package ru.duester.patterns.visitor;

import ru.duester.patterns.visitor.model.Document;
import ru.duester.patterns.visitor.model.HighlightedText;
import ru.duester.patterns.visitor.model.Paragraph;
import ru.duester.patterns.visitor.model.Table;
import ru.duester.patterns.visitor.visitor.PlainTextOutputVisitor;
import ru.duester.patterns.visitor.visitor.Visitor;

public class Main {
    public static void main(String[] args) {
        Document document = createDocument();
        Visitor visitor = new PlainTextOutputVisitor();
        System.out.println(visitor.visit(document));
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
