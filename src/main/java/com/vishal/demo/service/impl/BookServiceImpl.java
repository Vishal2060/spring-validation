package com.vishal.demo.service.impl;

import com.vishal.demo.model.Book;
import com.vishal.demo.repository.BookRepository;
import com.vishal.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void add(Book book) {
        bookRepository.add(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }
}
