package services;

import model.Book;

import java.util.HashMap;

public class BookServices {
    private HashMap<Integer, Book> books;

    public BookServices() {
        this.books = new HashMap<Integer, Book>();
    }

    public HashMap<Integer, Book> getBooks() {
        return books;
    }

    public void setBooks(HashMap<Integer, Book> books) {
        this.books = books;
    }

    public boolean deleteBook  (HashMap<Integer, Book> books, int index) {
        boolean deleted = false;

        return  deleted;
    }

}
