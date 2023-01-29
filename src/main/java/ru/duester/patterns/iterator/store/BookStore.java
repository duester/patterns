package ru.duester.patterns.iterator.store;

import ru.duester.patterns.iterator.iterator.BookIterator;
import ru.duester.patterns.iterator.iterator.ItemIterator;
import ru.duester.patterns.iterator.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements ItemStore<Book> {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public ItemIterator<Book> createIterator() {
        return new BookIterator(this);
    }
}
