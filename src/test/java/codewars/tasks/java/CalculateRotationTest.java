package codewars.tasks.java;

import codewars.tasks.java.calculatestringrotations.CalculateRotation;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class CalculateRotationTest {

    @Test(testName = "5", description = "Verify string rotations calculation")
    public void testCalcStringRotations() {

        System.out.println("@Test - testCalcStringRotations");

        assertThat(CalculateRotation.shiftedDiff("hoop","pooh")).isEqualTo(-1);
        assertThat(CalculateRotation.shiftedDiff("coffee","eecoff")).isEqualTo(2);
        assertThat(CalculateRotation.shiftedDiff("eecoff","coffee")).isEqualTo(4);
        }
}
