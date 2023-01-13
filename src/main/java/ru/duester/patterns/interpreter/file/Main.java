package ru.duester.patterns.interpreter.file;

import ru.duester.patterns.interpreter.file.item.Directory;
import ru.duester.patterns.interpreter.file.item.File;
import ru.duester.patterns.interpreter.file.item.FileSystemItem;

public class Main {
    public static void main(String[] args) {
        FileSystemItem root = new Directory("root",
                new Directory("dir1",
                        new File("file1", 10),
                        new File("file2", 20)),
                new Directory("dir2"),
                new Directory("dir3"),
                new File("file3", 100));

        System.out.println("getItemsAmount = " + root.getItemsAmount());
        System.out.println("getFilesAmount = " + root.getFilesAmount());
        System.out.println("getSize = " + root.getSize());
    }
}
