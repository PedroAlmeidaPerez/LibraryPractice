package services;

import model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class BookServicesTest {
    BookServices bookServices = new BookServices();
    HashMap<Integer, Book> bookList = new HashMap<Integer, Book>();

    @Test
    public void getBooks() {
        HashMap<Integer, Book> result;
        setBooks();
        result = bookServices.getBooks();
        int expected = 2;
        System.out.println(bookServices.getBooks().entrySet());
        Assert.assertEquals(expected, result.size());
    }

    @Test
    public void setBooks() {
        Book book = new Book ("pedro", "juan", 1999);
        bookList.put(book.getIdBook(), book);
        Book book2 = new Book ("pedro2", "juan2", 2000);
        bookList.put(book.getIdBook(), book);
        bookList.put(book2.getIdBook(), book2);
        bookServices.setBooks(bookList);
        int expected = 2;
        Assert.assertEquals(expected, bookList.size());
    }

    @Test
    public void deleteBook() {
        setBooks();
        int index=1;
        boolean result = bookServices.deleteBook(index);
        boolean expected = true;
        System.out.println(bookServices.getBooks().entrySet());
        Assert.assertEquals(expected, result);
    }
}