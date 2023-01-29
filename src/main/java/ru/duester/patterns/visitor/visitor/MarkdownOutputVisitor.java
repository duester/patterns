package ru.duester.patterns.visitor.visitor;

import org.apache.commons.lang3.StringUtils;
import ru.duester.patterns.visitor.model.HighlightedText;
import ru.duester.patterns.visitor.model.Paragraph;
import ru.duester.patterns.visitor.model.Table;

public class MarkdownOutputVisitor implements Visitor {
    @Override
    public String visit(Paragraph paragraph) {
        return "\n" + paragraph.getText();
    }

    @Override
    public String visit(HighlightedText text) {
        return "\n**" + text.getText() + "**";
    }

    @Override
    public String visit(Table table) {
        final int columnsCount = table.getHeaderRow().getColumns().size();
        StringBuilder sb = new StringBuilder("\n");

        sb.append(table.getCaption());
        sb.append("\n\n");

        sb.append("|");
        for (Table.Column header : table.getHeaderRow().getColumns()) {
            sb.append(header.getData());
            sb.append("|");
        }
        sb.append("\n");

        sb.append("|");
        sb.append(StringUtils.repeat("---|", columnsCount));
        sb.append("\n");

        for (Table.Row row : table.getRows()) {
            sb.append("|");
            for (Table.Column column : row.getColumns()) {
                sb.append(column.getData());
                sb.append("|");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
