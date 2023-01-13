package ru.duester.patterns.strategy.output;

import org.apache.commons.lang3.StringUtils;
import ru.duester.patterns.strategy.model.HighlightedText;
import ru.duester.patterns.strategy.model.Paragraph;
import ru.duester.patterns.strategy.model.Table;

public class PlainText extends OutputFormat {

    @Override
    public String output(Paragraph paragraph) {
        return paragraph.getText();
    }

    @Override
    public String output(HighlightedText text) {
        return text.getText();
    }

    @Override
    public String output(Table table) {
        final int columnsCount = table.getHeaderRow().getColumns().size();
        final int columnWidth = 3;
        StringBuilder sb = new StringBuilder();

        sb.append(table.getCaption());
        sb.append("\n");

        sb.append("|");
        for (Table.Column header : table.getHeaderRow().getColumns()) {
            sb.append(StringUtils.rightPad(header.getData(), columnWidth));
            sb.append("|");
        }
        sb.append("\n");
        sb.append(StringUtils.repeat("-", (columnWidth + 1) * columnsCount + 1));
        sb.append("\n");

        for (Table.Row row : table.getRows()) {
            sb.append("|");
            for (Table.Column column : row.getColumns()) {
                sb.append(StringUtils.rightPad(column.getData(), columnWidth));
                sb.append("|");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
