package com.example.basicswagger.service;

import com.example.basicswagger.exceptions.BookNotFoundException;
import com.example.basicswagger.model.Book;
import org.springframework.stereotype.Service;

@Service
public class LibraryService implements ILibraryService {

    @Override
    public Book retrieveBook(String isbn) {

        Book book1 = new Book(1,"1","Book1");
        Book book2 = new Book(2,"2","Book2");
        Book returnBook;

        switch (isbn) {

            case "1":
                returnBook = book1;
                break;
            case "2":
                returnBook = book2;
                break;
            default:
                returnBook = null;
                break;

        }

        if (returnBook == null) {
            throw new BookNotFoundException("Book with ISBN: " + isbn + " not found.");
        }

        return returnBook;

    }

}



