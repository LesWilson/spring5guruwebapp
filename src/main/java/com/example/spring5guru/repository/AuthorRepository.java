package com.example.spring5guru.repository;

import com.example.spring5guru.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author, Long> {

}
