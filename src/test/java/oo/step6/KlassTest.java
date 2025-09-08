package oo.step6;

import oo.Klass;
import oo.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KlassTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    // when assign leader given teacher is teaching the class then print message
    @Test
    void should_print_message_when_assign_leader_given_teacher_is_teaching_the_class() {
        Klass kass = new Klass(1);
        oo.Student student = new oo.Student(1, "Tom", 18);
        student.join(kass);
        Teacher teacher1 = new Teacher(1, "Mr. Smith", 40);
        Teacher teacher2 = new Teacher(2, "Ms. Johnson", 30);
        teacher1.assignTo(kass);
        teacher2.assignTo(kass);

        kass.assignLeader(student);
        String expected = """
                I am Mr. Smith, teacher of Class 1. I know Tom become Leader.
                I am Ms. Johnson, teacher of Class 1. I know Tom become Leader.
                """;
        assertEquals(expected, outContent.toString());
    }

    // when assign leader given students are in the class then print message
    @Test
    void should_print_message_when_assign_leader_given_students_are_in_the_class() {
        Klass klass = new Klass(1);
        oo.Student student1 = new oo.Student(1, "Tom", 18);
        oo.Student student2 = new oo.Student(2, "Jerry", 17);
        oo.Student student3 = new oo.Student(3, "Jim", 19);
        student1.join(klass);
        student2.join(klass);
        student3.join(klass);
        klass.assignLeader(student3);

        String expected = """
                I am Tom, student of Class 1. I know Jim become Leader.
                I am Jerry, student of Class 1. I know Jim become Leader.
                """;
        assertEquals(expected, outContent.toString());
    }

}
