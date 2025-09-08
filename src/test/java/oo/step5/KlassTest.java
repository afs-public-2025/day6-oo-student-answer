package oo.step5;

import oo.Klass;
import oo.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KlassTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setErr(new PrintStream(outContent));
    }

    // when assign leader given student is not in class then print prompt message
    @Test
    void should_print_prompt_message_when_assign_leader_given_student_is_not_in_class() {
        Klass klass = new Klass(1);
        Student student = new Student(1, "Tom", 18);

        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> klass.assignLeader(student));
        assertEquals("It is not one of us.", runtimeException.getMessage());
    }
}
