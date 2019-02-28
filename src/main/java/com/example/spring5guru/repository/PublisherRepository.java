package com.example.spring5guru.repository;

import com.example.spring5guru.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository <Publisher, Long> {

}
