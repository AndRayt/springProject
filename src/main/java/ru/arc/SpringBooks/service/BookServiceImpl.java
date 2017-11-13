package ru.arc.SpringBooks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.arc.SpringBooks.entity.BookEntity;
import ru.arc.SpringBooks.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void add(BookEntity bookEntity) {
        bookRepository.save(bookEntity);
    }

    @Override
    public void delete(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<BookEntity> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<BookEntity> searchName(String name) {
        List<BookEntity> list = bookRepository.findAll();
        List<BookEntity> result = new ArrayList<>();
        for(BookEntity bookEntity : list) {
            if (bookEntity.getName().equals(name)) {
                result.add(bookEntity);
            }
        }
        return result;
    }

    @Override
    public List<BookEntity> searchAuthor(String author) {
        List<BookEntity> list = bookRepository.findAll();
        List<BookEntity> result = new ArrayList<>();
        for(BookEntity bookEntity : list) {
            if (bookEntity.getAuthor().equals(author)) {
                result.add(bookEntity);
            }
        }
        return result;
    }

    @Override
    public void edit(int id, String name, String author, String genre) {
        bookRepository.deleteById(id);
        bookRepository.save(new BookEntity(name, author, genre));
    }
}
