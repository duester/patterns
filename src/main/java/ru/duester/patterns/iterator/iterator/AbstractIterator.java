package ru.duester.patterns.iterator.iterator;

import ru.duester.patterns.iterator.model.Vinyl;

import java.util.List;

public abstract class AbstractIterator<T> implements ItemIterator<T> {
    protected final List<T> items;
    protected int currentPosition = 0;

    public AbstractIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < items.size();
    }

    @Override
    public int getCurrentNumber() {
        return currentPosition + 1;
    }

    @Override
    public T getNext() {
        if (!hasNext()) {
            return null;
        }
        return items.get(currentPosition++);
    }
}
