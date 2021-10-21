package tests;

import lengthylab.Instructor;
import lengthylab.Person;
import lengthylab.Student;
import lengthylab.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    Instructor instructor = new Instructor(103, "Mr. Smith");

    @Test
    public void testImplementation() {

        Assert.assertTrue(instructor instanceof Teacher);

    }

    @Test
    public void testInheritance() {

        Assert.assertTrue(instructor instanceof Person);

    }

    @Test
    public void testTeach() {

        Student student = new Student(30, "David");

        instructor.teach(student, 30);

    }

    @Test
    public void testLecture() {

        Student student1 = new Student(30, "David");
        Student student2 = new Student(31, "Davie");
        Student student3 = new Student(32, "Davis");

        Student[] students = { student1, student2, student3};

        instructor.lecture(students, 30);

    }

}
