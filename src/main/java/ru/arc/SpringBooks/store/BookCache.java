package ru.arc.SpringBooks.store;

import ru.arc.SpringBooks.models.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Реализация патерна Singleton
 */
public class BookCache {
    private static final BookCache INSTANCE = new BookCache();
    private static final ConcurrentHashMap<Integer, Book> COLLECTION = new ConcurrentHashMap<>();
    static int id;

    private BookCache() {
        id = 0;
    }

    public static BookCache getInstance() {
        return INSTANCE;
    }

    public void add(final Book book) {
        book.setId(id);
        this.COLLECTION.put(id, book);
        id++;
    }

    public Book get(final int id) {
        return this.COLLECTION.get(id);
    }

    public List<Book> values() {
        return new ArrayList(COLLECTION.values());
    }

    public void delete(int number) {
        COLLECTION.remove(number);
    }

    public void delete(Book book) {
        COLLECTION.remove(book);
    }

    public void clear() {
        COLLECTION.clear();
    }

    public List<Book> search(String name) {
        List<Book> list = values();
        List<Book> result = new ArrayList<>();

        for (Book book: list) {
            if (name.equals(book.getName())) {
                result.add(book);
            }
        }

        return result;
    }
}

