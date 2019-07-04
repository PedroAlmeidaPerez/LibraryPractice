package model;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {
    Book book = new Book("pedro", "juan");
    Book book2 = new Book("pedro", "juan");

    @Test
    public void testGetbook(){
    String expected = "lolo";
    String result = book.getName();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetbook2(){
        String expected = "pedro";
        String result = book.getName();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetId(){
        int expected = 1;
        int result = book2.getIdBook();
        Assert.assertEquals(expected, result);
    }


}
