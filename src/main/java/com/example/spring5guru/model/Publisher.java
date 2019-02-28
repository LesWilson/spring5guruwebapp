package com.example.spring5guru.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Publisher {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String addressLine1;
    private String addressLine2;
    private String state;
    private String postcode;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books = new HashSet<>();

    public Publisher(String name, String addressLine1, String addressLine2, String state, String postcode) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.state = state;
        this.postcode = postcode;
    }

    public Publisher(String name, String addressLine1, String addressLine2, String state, String postcode, Set<Book> books) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.state = state;
        this.postcode = postcode;
        this.books = books;
    }

    public Publisher() {
    }
}
