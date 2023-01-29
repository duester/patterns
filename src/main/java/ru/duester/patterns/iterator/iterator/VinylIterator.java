package ru.duester.patterns.iterator.iterator;

import ru.duester.patterns.iterator.model.Vinyl;
import ru.duester.patterns.iterator.store.VinylStore;

public class VinylIterator extends AbstractIterator<Vinyl> {

    public VinylIterator(VinylStore vinylStore) {
        super(vinylStore.getVinyls());
    }
}
