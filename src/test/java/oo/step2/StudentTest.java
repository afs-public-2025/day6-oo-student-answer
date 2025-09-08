package oo.step2;

import oo.Person;
import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StudentTest {

    // when introduce a student, then return a message with name and age
    @Test
    void should_introduce_self_when_introduce_given_a_student() {
        Student student = new Student(1, "Tom", 18);
        assertEquals("My name is Tom. I am 18 years old. I am a student.", student.introduce());
    }

    // when equals two same id student then return true
    @Test
    void should_return_true_when_equals_given_two_same_id_student() {
        Person student1 = new Student(1, "Tom", 18);
        Person student2 = new Student(1, "Jim", 17);
        assertEquals(student1, student2);
    }

    // when equals two different id student then return true

    @Test
    void should_return_false_when_equals_given_two_same_id_student() {
        Person student1 = new Student(1, "Tom", 18);
        Person student2 = new Student(2, "Jim", 17);
        assertNotEquals(student1, student2);
    }
}
