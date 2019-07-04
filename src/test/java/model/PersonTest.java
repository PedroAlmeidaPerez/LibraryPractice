package model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    Person person = new Person("lolo");
    Person person1 = new Person("lolo1");
    Person person2 = new Person("lolo2");

    @Test
    public void testGetperson(){
        String expected = "lolo";
        String result = person.getName();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetperson1(){
        String expected = "gogo";
        String result = person.getName();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetIdPerson(){
        int expected = 2;
        int result = person.getIdPerson();
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testGetIdPerson1(){
        int expected = 1;
        int result = person1.getIdPerson();
        Assert.assertEquals(expected, result);
    }

}