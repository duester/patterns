package ru.duester.patterns.iterator.store;

import ru.duester.patterns.iterator.iterator.ItemIterator;

public interface ItemStore<T> {
    ItemIterator<T> createIterator();
}
