package ru.duester.patterns.iterator.store;

import ru.duester.patterns.iterator.iterator.ItemIterator;
import ru.duester.patterns.iterator.iterator.VinylIterator;
import ru.duester.patterns.iterator.model.Vinyl;

import java.util.ArrayList;
import java.util.List;

public class VinylStore implements ItemStore<Vinyl> {
    private List<Vinyl> vinyls = new ArrayList<>();

    public void addVinyl(Vinyl vinyl) {
        vinyls.add(vinyl);
    }

    public List<Vinyl> getVinyls() {
        return vinyls;
    }

    @Override
    public ItemIterator<Vinyl> createIterator() {
        return new VinylIterator(this);
    }
}
