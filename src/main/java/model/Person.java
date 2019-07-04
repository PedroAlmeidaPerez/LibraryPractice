package model;

public class Person {
    private int IdPerson;
    private static int IdNext=1;
    private String person;
    private int IdBook;

    public Person(String person) {
        this.person = person;
        IdPerson = IdNext;
        IdNext++;
    }

    public int getIdPerson() {
        return IdPerson;
    }

    public String getName() {
        return person;
    }

    public int getIdBook() {
        return IdBook;
    }
}
