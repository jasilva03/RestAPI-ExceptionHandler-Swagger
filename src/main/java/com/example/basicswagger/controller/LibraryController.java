package com.example.basicswagger.controller;

import com.example.basicswagger.model.Book;
import com.example.basicswagger.service.ILibraryService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("library")
public class LibraryController {

    private final ILibraryService libraryService;

    public LibraryController(ILibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping(value = "/books/{isbn}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Book getByISBN(@PathVariable("isbn") String isbn) {

        Book bookRetrieved = libraryService.retrieveBook(isbn);
        return  bookRetrieved;

    }

}
