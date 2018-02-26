package com.vishal.demo.repository.impl;

import com.vishal.demo.model.Book;
import com.vishal.demo.repository.BookRepository;
import lombok.Cleanup;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Book book) {
        @Cleanup Session session = sessionFactory.openSession();
        session.save(book);
    }

    @Override
    public List<Book> getAll() {
        @Cleanup Session session = sessionFactory.openSession();
        return session.createCriteria(Book.class).list();
    }
}
