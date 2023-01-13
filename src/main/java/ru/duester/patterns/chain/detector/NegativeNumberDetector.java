package ru.duester.patterns.chain.detector;

import ru.duester.patterns.chain.item.Item;

public class NegativeNumberDetector extends Detector {
    @Override
    protected boolean condition(Item item) {
        return item.getValue() < 0;
    }

    @Override
    protected void process(Item item) {
        System.out.println(item + " содержит отрицательное число");
    }
}
