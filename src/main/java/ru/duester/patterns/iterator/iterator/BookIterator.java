package ru.duester.patterns.iterator.iterator;

import ru.duester.patterns.iterator.model.Book;
import ru.duester.patterns.iterator.store.BookStore;

public class BookIterator extends AbstractIterator<Book> {

    public BookIterator(BookStore bookStore) {
        super(bookStore.getBooks());
    }
}
