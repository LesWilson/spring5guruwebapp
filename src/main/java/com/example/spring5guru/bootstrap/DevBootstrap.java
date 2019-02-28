package com.example.spring5guru.bootstrap;

import com.example.spring5guru.model.Author;
import com.example.spring5guru.model.Book;
import com.example.spring5guru.repository.AuthorRepository;
import com.example.spring5guru.repository.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }


    private void initData() {
        Author leeChild = new Author("Lee", "Child");
        Book book1 = new Book("Killing Floor", "ISBN:1234", "Bantam Books");
//      Don't need to do this bit to get the correct associations
//        leeChild.getBooks().add(book1);
        book1.getAuthors().add(leeChild);

        authorRepository.save(leeChild);
        bookRepository.save(book1);

        Author ianRankin = new Author("Ian", "Rankin");
        Book book2 = new Book("Black and Blue", "ISBN:2234", "Orion Books");
//        ianRankin.getBooks().add(book2);
        book2.getAuthors().add(ianRankin);

        authorRepository.save(ianRankin);
        bookRepository.save(book2);
    }
}
