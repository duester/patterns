package ru.duester.patterns.chain.detector;

import ru.duester.patterns.chain.item.Item;

import java.math.BigInteger;

public class PrimeNumberDetector extends Detector {
    @Override
    protected boolean condition(Item item) {
        return BigInteger.valueOf(item.getValue()).isProbablePrime(10);
    }

    @Override
    protected void process(Item item) {
        System.out.println(item + " содержит простое число");
    }
}
