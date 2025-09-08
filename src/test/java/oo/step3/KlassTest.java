package oo.step3;

import oo.Klass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class KlassTest {

    // when equals two same id klass then return true
    @Test
    void should_return_true_when_equals_given_two_same_number_class() {
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(1);
        assertEquals(klass1, klass2);
    }

    // when equals two different id klass then return false
    @Test
    void should_return_false_when_equals_given_not_same_number_class() {
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);
        assertNotEquals(klass1, klass2);
    }

}
