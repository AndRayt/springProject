package ru.arc.SpringBooks.service;

import ru.arc.SpringBooks.entity.BookEntity;

import java.util.List;


public interface BookService {
    void add(BookEntity bookEntity);
    void delete(int id);
    List<BookEntity> getAll();
    List<BookEntity> searchName(String name);
    List<BookEntity> searchAuthor(String name);
    void edit(int id, String name, String author, String genre);
}
