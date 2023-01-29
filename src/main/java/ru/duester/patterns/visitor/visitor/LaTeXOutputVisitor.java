package ru.duester.patterns.visitor.visitor;

import org.apache.commons.lang3.StringUtils;
import ru.duester.patterns.visitor.model.Document;
import ru.duester.patterns.visitor.model.HighlightedText;
import ru.duester.patterns.visitor.model.Paragraph;
import ru.duester.patterns.visitor.model.Table;

import java.util.function.Function;
import java.util.stream.Collectors;

public class LaTeXOutputVisitor implements Visitor {
    @Override
    public String visit(Paragraph paragraph) {
        return "\n" + paragraph.getText();
    }

    @Override
    public String visit(HighlightedText text) {
        return "\n\\textbf{" + text.getText() + "}";
    }

    @Override
    public String visit(Table table) {
        Function<Table.Row, String> formatRow = (Table.Row r) -> r.getColumns().stream()
                .map(Table.Column::getData)
                .collect(Collectors.joining(" & "));

        final int columnsCount = table.getHeaderRow().getColumns().size();
        StringBuilder sb = new StringBuilder("\n\\begin{table}[h!]\n");
        sb.append("\\caption{").append(table.getCaption()).append("}\n");

        sb.append("\\begin{tabular}{");
        sb.append("c").append(StringUtils.repeat(" | c", columnsCount - 1));
        sb.append("}").append("\n");

        sb.append(formatRow.apply(table.getHeaderRow())).append("\\\\\n");
        sb.append("\\hline\n");

        for (Table.Row row : table.getRows()) {
            sb.append(formatRow.apply(row)).append("\\\\\n");
        }

        sb.append("\\end{tabular}\n");
        sb.append("\\end{table}");

        return sb.toString();
    }

    @Override
    public String visit(Document document) {
        StringBuilder sb = new StringBuilder("\\documentclass{article}\n");
        sb.append("\\usepackage[utf8]{inputenc}\n");
        sb.append("\\begin{document}\n");
        sb.append(Visitor.super.visit(document)).append("\n");
        sb.append("\\end{document}");
        return sb.toString();
    }
}
