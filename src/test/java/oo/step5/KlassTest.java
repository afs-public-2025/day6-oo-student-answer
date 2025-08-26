package oo.step5;

import oo.Klass;
import oo.Student;
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


    // when assign leader given student is not in class then print prompt message
    @Test
    public void should_print_prompt_message_when_assign_leader_given_student_is_not_in_class() {
        Student tom = new Student(1, "Tom", 21);
        Klass klass = new Klass(1);

        klass.assignLeader(tom);

        assertThat(outContent.toString()).contains("It is not one of us.");
    }

}
