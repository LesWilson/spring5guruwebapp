package com.example.spring5guru.controller;

import com.example.spring5guru.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping ("/books")
    public String list (Model model) {
        model.addAttribute("books", bookService.getBooks());
        return "books";
    }
}
