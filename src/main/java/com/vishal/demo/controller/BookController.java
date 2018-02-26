package com.vishal.demo.controller;

import com.vishal.demo.model.Book;
import com.vishal.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("book")
@Validated
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping
    public void add(@Valid @RequestBody Book book) {
        System.out.println(book);
        bookService.add(book);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }
}
