package ru.duester.patterns.chain.item;

public class Item {
    private final int value;

    public Item(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Item(" + value + ")";
    }
}
