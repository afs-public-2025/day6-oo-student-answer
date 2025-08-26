package oo.step6;

import oo.Klass;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class KlassTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    // when assign leader given teacher is teaching the class then print message
    @Test
    public void should_print_message_when_assign_leader_given_teacher_is_teaching_the_class() {
        Klass klass = new Klass(1);
        Student student1 = new Student(1, "John", 10);
        Student student2 = new Student(2, "Mechael", 12);
        Student leader = new Student(3, "Flora", 11);
        Teacher teacher = new Teacher(1, "Jerry", 34);

        teacher.assignTo(klass);


        leader.join(klass);
        student2.join(klass);

        klass.assignLeader(leader);

        assertThat(outContent.toString()).contains("I am Jerry, teacher of Class 1. I know Flora become Leader.");
        assertThat(outContent.toString()).contains("I am Mechael, student of Class 1. I know Flora become Leader.");

    }
}
