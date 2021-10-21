package tests;

import lengthylab.Learner;
import lengthylab.Person;
import lengthylab.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    Student student = new Student(30, "David");

    @Test
    public void testImplementation() {

        Assert.assertTrue(student instanceof Learner);

    }

    @Test
    public void testInheritance() {

        Assert.assertTrue(student instanceof Person);

    }

    @Test
    public void testLearn() {

         student.learn(30);

    }

}
