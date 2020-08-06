package com.example.basicswagger.model;

public class Book {

    private int id;
    private String isbn;
    private String title;

    public Book() {
    }

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
