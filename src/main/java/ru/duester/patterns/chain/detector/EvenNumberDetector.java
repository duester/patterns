package ru.duester.patterns.chain.detector;

import ru.duester.patterns.chain.item.Item;

public class EvenNumberDetector extends Detector {
    @Override
    protected boolean condition(Item item) {
        return item.getValue() % 2 == 0;
    }

    @Override
    protected void process(Item item) {
        System.out.println(item + " содержит чётное число");
    }
}
