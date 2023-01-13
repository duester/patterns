package ru.duester.patterns.chain.detector;

import ru.duester.patterns.chain.item.Item;

public class MultipleOf3NumberDetector extends Detector {
    @Override
    protected boolean condition(Item item) {
        return item.getValue() % 3 == 0;
    }

    @Override
    protected void process(Item item) {
        System.out.println("Число в " + item + " делится на 3");
    }
}
