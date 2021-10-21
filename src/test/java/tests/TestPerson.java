package tests;

import lengthylab.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {

        Person person = new Person(30, "Name");

    }

    @Test
    public void testSetName() {

        Person person = new Person(30, "Name");

        person.setName("It's a name");

        String expected = person.getName();

        String actual = person.getName();

        Assert.assertSame(expected, actual);

    }

}
