package codewars.tasks.java;

import codewars.tasks.java.calculatestringrotations.CalculateRotation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateRotationTest {

        @Test
        public void test() {
            assertEquals(-1, CalculateRotation.shiftedDiff("hoop","pooh"));
            assertEquals(2, CalculateRotation.shiftedDiff("coffee","eecoff"));
            assertEquals(4, CalculateRotation.shiftedDiff("eecoff","coffee"));
        }

}
