package oo.step5;

import oo.Klass;
import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    // when introduce given student is the leader then return message
    @Test
    void should_return_message_when_introduce_given_student_is_leader() {
        Klass klass = new Klass(1);
        Student student = new Student(1, "Tom", 18);
        student.join(klass);
        klass.assignLeader(student);
        assertEquals("My name is Tom. I am 18 years old. I am a student. I am Leader of class 1.", student.introduce());
    }

}
