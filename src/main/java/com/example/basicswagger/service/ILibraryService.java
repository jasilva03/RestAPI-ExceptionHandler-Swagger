package com.example.basicswagger.service;

import com.example.basicswagger.model.Book;

public interface ILibraryService {

    Book retrieveBook(String isbn);

}
