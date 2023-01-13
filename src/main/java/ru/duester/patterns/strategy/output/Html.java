package ru.duester.patterns.strategy.output;

import ru.duester.patterns.strategy.model.Document;
import ru.duester.patterns.strategy.model.HighlightedText;
import ru.duester.patterns.strategy.model.Paragraph;
import ru.duester.patterns.strategy.model.Table;

public class Html extends OutputFormat {
    @Override
    public String output(Paragraph paragraph) {
        return "<p>" + paragraph.getText() + "</p>";
    }

    @Override
    public String output(HighlightedText text) {
        return "<strong>" + text.getText() + "</strong>";
    }

    @Override
    public String output(Table table) {
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
    public String output(Document document) {
        StringBuilder sb = new StringBuilder("<html>\n");
        sb.append("<body>\n");
        sb.append(super.output(document)).append("\n");
        sb.append("</body>\n");
        sb.append("</html>");
        return sb.toString();
    }
}
