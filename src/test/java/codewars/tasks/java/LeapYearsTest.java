package codewars.tasks.java;

import codewars.tasks.java.leapyears.LeapYears;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearsTest {

    private static final Logger LOG = LogManager.getLogger(LeapYearsTest.class.getName());

    @Test (testName = "11", description = "Verify Leap Year method")
    public void testIsYearLeap(){

        LOG.info("@Test - testIsYearLeap()");

        LeapYears isYearLeap = new LeapYears();

        assertThat(isYearLeap.isYearLeap(2000)).isEqualTo("Year 2000");
        assertThat(isYearLeap.isYearLeap(2004)).isEqualTo("Year 2004");
        assertThat(isYearLeap.isYearLeap(1984)).isEqualTo("Year 1984");
    }
}
