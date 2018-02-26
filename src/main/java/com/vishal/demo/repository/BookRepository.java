package com.vishal.demo.repository;

import com.vishal.demo.model.Book;

import java.util.List;

public interface BookRepository {

    void add(Book book);
    List<Book> getAll();
}
