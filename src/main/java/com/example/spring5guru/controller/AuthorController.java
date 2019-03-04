package com.example.spring5guru.controller;

import com.example.spring5guru.service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorController {

    AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping ("/authors")
    public String list (Model model) {
        model.addAttribute("authors", authorService.getAuthors());
        return "authors";
    }
}
