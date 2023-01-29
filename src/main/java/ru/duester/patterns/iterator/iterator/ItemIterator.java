package ru.duester.patterns.iterator.iterator;

public interface ItemIterator<T> {
    boolean hasNext();

    int getCurrentNumber();

    T getNext();
}
