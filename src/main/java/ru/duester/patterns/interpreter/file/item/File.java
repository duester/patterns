package ru.duester.patterns.interpreter.file.item;

public class File implements FileSystemItem {
    private final String name;
    private final int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getItemsAmount() {
        return 0;
    }

    @Override
    public int getFilesAmount() {
        return 1;
    }

    @Override
    public int getSize() {
        return size;
    }
}
