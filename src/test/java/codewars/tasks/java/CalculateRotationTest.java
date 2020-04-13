package codewars.tasks.java;

import codewars.tasks.java.calculatestringrotations.CalculateRotation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculateRotationTest {

    private static final Logger Log = LogManager.getLogger(CalculateRotationTest.class.getName());

    @Test(testName = "5", description = "Verify string rotations calculation")
    public void testCalcStringRotations() {

        Log.info("@Test - testCalcStringRotations()");

        assertThat(CalculateRotation.shiftedDiff("hoop","pooh")).isEqualTo(-1);
        assertThat(CalculateRotation.shiftedDiff("coffee","eecoff")).isEqualTo(2);
        assertThat(CalculateRotation.shiftedDiff("eecoff","coffee")).isEqualTo(4);
    }
}
