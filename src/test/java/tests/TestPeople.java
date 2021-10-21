package tests;

import lengthylab.People;
import lengthylab.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    People people = new People();

    @Test
    public void testAdd() {

        Person person = new Person(30, "David");

        people.add(person);

    }

    @Test
    public void testRemove() {

        Person person = new Person(30, "David");

        people.remove(person, 30);

    }

    @Test
    public void testFindById() {

        people.findById(30);

    }

}
