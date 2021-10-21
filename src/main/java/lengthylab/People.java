package lengthylab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterator<Exception> {

  //Instantiating a list with field as Person
    List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public void remove(Person person, long id) {
        personList.remove(person);
        personList.remove(id);
    }

    public Person findById(long id) {

        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
       return null;
    }

    public boolean contains(Person person) {

        if (personList.contains(person)) {
            return true;
        } else {
            return false;
        }

    }



    public void removeAll() {

        personList.clear();

    }

    public int count() {

        return personList.size();

    }

    public Object[] toArray() {

        return personList.toArray();

    }

    public void iterator() {
        for (Person persons : personList) {
             System.out.println(persons);
        }
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Exception next() {
        return null;
    }
}