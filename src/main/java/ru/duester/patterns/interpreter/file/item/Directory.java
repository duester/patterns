package ru.duester.patterns.interpreter.file.item;

import java.util.Arrays;
import java.util.List;

public class Directory implements FileSystemItem {
    private String name;
    private final List<FileSystemItem> items;

    public Directory(String name, FileSystemItem... items) {
        this.name = name;
        this.items = Arrays.asList(items);
    }

    @Override
    public int getItemsAmount() {
        return items.size() +
                items.stream().map(FileSystemItem::getItemsAmount).reduce(0, Integer::sum);
    }

    @Override
    public int getFilesAmount() {
        return items.stream().map(FileSystemItem::getFilesAmount).reduce(0, Integer::sum);
    }

    @Override
    public int getSize() {
        return items.stream().map(FileSystemItem::getSize).reduce(0, Integer::sum);
    }
}
