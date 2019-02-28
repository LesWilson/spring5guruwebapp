package com.example.spring5guru.repository;

import com.example.spring5guru.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book, Long> {

}
