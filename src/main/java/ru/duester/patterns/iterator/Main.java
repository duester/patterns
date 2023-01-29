package ru.duester.patterns.iterator;

import ru.duester.patterns.iterator.iterator.ItemIterator;
import ru.duester.patterns.iterator.model.Book;
import ru.duester.patterns.iterator.model.Vinyl;
import ru.duester.patterns.iterator.store.BookStore;
import ru.duester.patterns.iterator.store.VinylStore;

public class Main {
    public static void main(String[] args) {
        ItemIterator iterator = createBookStore().createIterator();
        System.out.println("Список книг:");
        while (iterator.hasNext()) {
            System.out.println(iterator.getCurrentNumber() + ". " + iterator.getNext());
        }
        System.out.println("");

        iterator = createVinylStore().createIterator();
        System.out.println("Список пластинок:");
        while (iterator.hasNext()) {
            System.out.println(iterator.getCurrentNumber() + ". " + iterator.getNext());
        }
    }

    private static BookStore createBookStore() {
        BookStore store = new BookStore();
        store.addBook(new Book("Война и мир", "Толстой Л.", 100500));
        store.addBook(new Book("Мёртвые души", "Гоголь Н.", 1000));
        store.addBook(new Book("Села муха на варенье...", "народное творчество", 1));
        return store;
    }

    private static VinylStore createVinylStore() {
        VinylStore store = new VinylStore();
        store.addVinyl(new Vinyl("Щелкунчик", "Чайковский П.", 120));
        store.addVinyl(new Vinyl("В лесу родилась ёлочка", "Детский хор", 3));
        return store;
    }
}
