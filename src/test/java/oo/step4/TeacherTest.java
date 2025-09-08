package oo.step4;

import oo.Klass;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    // when belongsTo give teacher does not teach the class then return false
    @Test
    void should_return_false_when_belongsTo_given_teacher_not_teach_the_class() {
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);
        Teacher teacher = new Teacher(1, "Tom", 21);
        teacher.assignTo(klass1);
        assertFalse(teacher.belongsTo(klass2));
    }

    // when belongsTo give teacher teach the class then return true
    @Test
    void should_return_true_when_belongsTo_given_teacher_teach_the_class() {
        Klass klass1 = new Klass(1);
        Teacher teacher = new Teacher(1, "Tom", 21);
        teacher.assignTo(klass1);
        assertTrue(teacher.belongsTo(klass1));
    }

    // when belongsTo given teacher teach multiple classes then return true
    @Test
    void should_return_true_when_belongsTo_given_teacher_teach_multiple_classes() {
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);
        Teacher teacher = new Teacher(1, "Tom", 21);
        teacher.assignTo(klass1);
        teacher.assignTo(klass2);
        assertTrue(teacher.belongsTo(klass1));
        assertTrue(teacher.belongsTo(klass2));
    }

    //when introduce given teacher teach one class then return message
    @Test
    void should_introduce_self_when_introduce_given_teacher_teach_one_class() {
        Klass klass1 = new Klass(1);
        Teacher teacher = new Teacher(1, "Tom", 21);
        teacher.assignTo(klass1);
        String expected = "My name is Tom. I am 21 years old. I am a teacher. I teach class 1.";
        assertEquals(expected, teacher.introduce());
    }

    // when introduce given teacher teach multiple classes then return message
    @Test
    void should_introduce_self_when_introduce_given_teacher_teach_multiple_class() {
        Klass klass1 = new Klass(2);
        Klass klass2 = new Klass(3);
        Teacher teacher = new Teacher(1, "Tom", 21);
        teacher.assignTo(klass1);
        teacher.assignTo(klass2);
        String expected = "My name is Tom. I am 21 years old. I am a teacher. I teach class 2, 3.";
        assertEquals(expected, teacher.introduce());
    }

    // when isTeaching given student not in the class taught by teacher then should return false
    @Test
    void should_return_false_when_inTeaching_given_teacher_not_teach_a_class() {
        Klass klass1 = new Klass(2);
        Klass klass2 = new Klass(3);
        Teacher teacher = new Teacher(1, "Tom", 21);
        teacher.assignTo(klass1);
        Student student = new Student(1, "Jerry", 18);
        student.join(klass2);
        assertFalse(teacher.isTeaching(student));
    }

    // when isTeaching given student in the class taught by teacher then return true
    @Test
    void should_return_true_when_inTeaching_given_teacher_teach_a_class() {
        Klass klass1 = new Klass(2);
        Teacher teacher = new Teacher(1, "Tom", 21);
        teacher.assignTo(klass1);
        Student student = new Student(1, "Jerry", 18);
        student.join(klass1);
        assertTrue(teacher.isTeaching(student));
    }

    // when isTeaching given student in any class taught by teacher then return true
    @Test
    void should_return_true_when_inTeaching_given_teacher_teach_multiple_classes() {
        Klass klass1 = new Klass(2);
        Klass klass2 = new Klass(3);
        Teacher teacher = new Teacher(1, "Tom", 21);
        teacher.assignTo(klass1);
        teacher.assignTo(klass2);
        Student student1 = new Student(1, "Jerry", 18);
        student1.join(klass1);
        Student student2 = new Student(2, "Jim", 19);
        student2.join(klass2);
        assertTrue(teacher.isTeaching(student1));
        assertTrue(teacher.isTeaching(student2));
    }
}
