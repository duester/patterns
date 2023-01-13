package ru.duester.patterns.chain;

import ru.duester.patterns.chain.detector.*;
import ru.duester.patterns.chain.item.Item;

public class Main {
    public static void main(String[] args) {
        Detector detector1 = new NegativeNumberDetector();
        Detector detector2 = new PositiveNumberDetector();
        Detector detector3 = new OddNumberDetector();
        Detector detector4 = new EvenNumberDetector();
        Detector detector5 = new MultipleOf3NumberDetector();
        Detector detector6 = new PrimeNumberDetector();

        detector1.setNext(detector2);
        detector2.setNext(detector3);
        detector3.setNext(detector4);
        detector4.setNext(detector5);
        detector5.setNext(detector6);

        detector1.detectFeature(new Item(1));
        System.out.println();

        detector1.detectFeature(new Item(2));
        System.out.println();

        detector1.detectFeature(new Item(6));
        System.out.println();

        detector1.detectFeature(new Item(-3));
        System.out.println();
    }
}
