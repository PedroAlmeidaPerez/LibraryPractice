package model;

public class Book {
    private int IdBook;
    private static int IdNext=1;
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
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
}
