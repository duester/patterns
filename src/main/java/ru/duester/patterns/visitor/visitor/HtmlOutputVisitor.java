package ru.duester.patterns.visitor.visitor;

import ru.duester.patterns.visitor.model.Document;
import ru.duester.patterns.visitor.model.HighlightedText;
import ru.duester.patterns.visitor.model.Paragraph;
import ru.duester.patterns.visitor.model.Table;

public class HtmlOutputVisitor implements Visitor {
    @Override
    public String visit(Paragraph paragraph) {
        return "<p>" + paragraph.getText() + "</p>";
    }

    @Override
    public String visit(HighlightedText text) {
        return "<strong>" + text.getText() + "</strong>";
    }

    @Override
    public String visit(Table table) {
        StringBuilder sb = new StringBuilder("<table>\n");
        sb.append("  <caption>").append(table.getCaption()).append("</caption>\n");

        sb.append("  <tr>\n");
        for (Table.Column header : table.getHeaderRow().getColumns()) {
            sb.append("    <th>").append(header.getData()).append("</th>\n");
        }
        sb.append("  </tr>\n");

        for (Table.Row row : table.getRows()) {
            sb.append("  <tr>\n");
            for (Table.Column column : row.getColumns()) {
                sb.append("    <td>").append(column.getData()).append("</td>\n");
            }
            sb.append("  </tr>\n");
        }

        sb.append("</table>");

        return sb.toString();
    }

    @Override
    public String visit(Document document) {
        StringBuilder sb = new StringBuilder("<html>\n");
        sb.append("<body>\n");
        sb.append(Visitor.super.visit(document)).append("\n");
        sb.append("</body>\n");
        sb.append("</html>");
        return sb.toString();
    }
}
