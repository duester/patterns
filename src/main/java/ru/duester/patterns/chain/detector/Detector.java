package ru.duester.patterns.chain.detector;

import ru.duester.patterns.chain.item.Item;

abstract public class Detector {
    private Detector next;

    public void setNext(Detector detector) {
        this.next = detector;
    }

    public void detectFeature(Item item) {
        if (condition(item)) {
            process(item);
        }
        if (next != null) {
            next.detectFeature(item);
        }
    }

    abstract protected boolean condition(Item item);

    abstract protected void process(Item item);
}
