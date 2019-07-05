package model;

import java.util.Date;

public class Book {
    private int IdBook;
    private static int IdNext=1;
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        IdBook = IdNext;
        IdNext++;
    }

    public int getIdBook() {
        return IdBook;
    }


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "IdBook=" + IdBook +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
