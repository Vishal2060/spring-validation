package com.vishal.demo.service;

import com.vishal.demo.model.Book;

import java.util.List;

public interface BookService {
    void add(Book book);
    List<Book> getAll();
}
