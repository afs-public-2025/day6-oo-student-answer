package oo.step2;

import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TeacherTest {

    // when introduce a teacher, then return a message with name and age
    @Test
    void should_introduce_self_when_introduce_given_a_teacher() {
        Teacher teacher = new Teacher(1, "Jerry", 21);
        assertEquals("My name is Jerry. I am 21 years old. I am a teacher.", teacher.introduce());
    }

    // when equals two same id teacher then return true
    @Test
    void should_return_true_when_equals_given_two_same_id_teacher() {
        Teacher teacher1 = new Teacher(1, "Tom", 21);
        Teacher teacher2 = new Teacher(1, "Jim", 22);
        assertEquals(teacher1, teacher2);
    }

    // when equals two different id teacher then return true
    @Test
    void should_return_false_when_equals_given_two_same_id_teacher() {
        Teacher teacher1 = new Teacher(1, "Tom", 21);
        Teacher teacher2 = new Teacher(2, "Jim", 22);
        assertNotEquals(teacher1, teacher2);
    }
}
