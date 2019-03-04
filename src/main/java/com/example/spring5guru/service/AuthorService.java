package com.example.spring5guru.service;

import com.example.spring5guru.model.Author;
import com.example.spring5guru.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Iterable<Author> getAuthors() {
        return authorRepository.findAll();
    }
}
