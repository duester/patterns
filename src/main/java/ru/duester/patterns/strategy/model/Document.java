package ru.duester.patterns.strategy.model;

import java.util.Arrays;
import java.util.List;

public class Document {
    private final List<Block> blocks;

    public Document(Block... blocks) {
        this.blocks = Arrays.asList(blocks);
    }

    public List<Block> getBlocks() {
        return blocks;
    }
}
