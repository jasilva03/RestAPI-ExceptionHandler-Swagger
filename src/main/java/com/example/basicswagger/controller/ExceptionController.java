package com.example.basicswagger.controller;

import com.example.basicswagger.exceptions.BookNotFoundException;
import com.example.basicswagger.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(BookNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleBookNotFound(Exception e) {

        ErrorResponse er = new ErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage());
        return er;

    }

}
