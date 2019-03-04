package com.example.spring5guru.service;

import com.example.spring5guru.model.Book;
import com.example.spring5guru.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> getBooks() {
        return bookRepository.findAll();
    }
}
