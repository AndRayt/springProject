package ru.arc.SpringBooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.arc.SpringBooks.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer>{
}
