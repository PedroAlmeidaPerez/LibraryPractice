package services;

import model.Book;

import java.util.HashMap;

public class BookServices {
     HashMap<String, Book> books;

    public BookServices() {
        this.books = new HashMap<String, Book>();
    }

    public HashMap<String, Book> getBooks() {
        return books;
    }
}
