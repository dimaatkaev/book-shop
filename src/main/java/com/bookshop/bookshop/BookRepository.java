package com.bookshop.bookshop;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    @Query("SELECT u FROM Book u")
    List<Book> findAllBooks();
}
