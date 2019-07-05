package services;

import model.Book;

import java.util.HashMap;

public class BookServices {
    private HashMap<String, Book> books;

    public BookServices() {
        books = new HashMap<String, Book>();
    }
}
