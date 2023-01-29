package ru.duester.patterns.iterator.model;

public class Book {
    private final String title;
    private final String author;
    private final int pageSize;

    public Book(String title, String author, int pageSize) {
        this.title = title;
        this.author = author;
        this.pageSize = pageSize;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageSize() {
        return pageSize;
    }

    @Override
    public String toString() {
        return title + ", автор: " + author + ", страниц: " + pageSize;
    }
}
