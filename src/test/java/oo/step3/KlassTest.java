package oo.step3;

import oo.Klass;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KlassTest {

    // when equals two same id teacher then return true
    @Test
    public void should_return_true_when_equals_given_two_classes_with_same_id() {
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(1);

        assertThat(klass1).isEqualTo(klass2);
    }
//
    // when equals two different id klass then return true
    @Test
    public void should_return_false_when_equals_given_two_classes_with_different_id() {
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);

        assertThat(klass1).isNotEqualTo(klass2);
    }

}
