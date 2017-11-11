package ru.arc.SpringBooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.arc.SpringBooks.entity.TableBooks;

public interface BooksRepository extends JpaRepository<TableBooks, Integer>{
}
