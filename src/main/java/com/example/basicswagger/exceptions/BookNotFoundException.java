package com.example.basicswagger.exceptions;

public class BookNotFoundException extends RuntimeException {

    private String message;

    public BookNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
