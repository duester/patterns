package ru.duester.patterns.visitor.model;

import ru.duester.patterns.visitor.visitor.Visitor;

import java.util.Arrays;
import java.util.List;

public class Table implements Block {
    private final String caption;
    private final Row headerRow;
    private final List<Row> rows;

    public Table(String caption, Row headerRow, Row... rows) {
        this.caption = caption;
        this.headerRow = headerRow;
        this.rows = Arrays.asList(rows);
    }

    public String getCaption() {
        return caption;
    }

    public Row getHeaderRow() {
        return headerRow;
    }

    public List<Row> getRows() {
        return rows;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public static class Row {
        private final List<Column> columns;

        public Row(Column... columns) {
            this.columns = Arrays.asList(columns);
        }

        public List<Column> getColumns() {
            return columns;
        }
    }

    public static class Column {
        private final String data;

        public Column(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }
    }
}
