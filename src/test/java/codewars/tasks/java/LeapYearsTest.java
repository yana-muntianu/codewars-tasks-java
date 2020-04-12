package codewars.tasks.java;

import codewars.tasks.java.leapyears.LeapYears;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class LeapYearsTest {

    @Test (testName = "11", description = "Verify Leap Year method")
    public void testIsYearLeap(){

        System.out.println("@Test - testIsYearLeap");

        LeapYears isYearLeap = new LeapYears();

        assertThat(isYearLeap.isYearLeap(2000)).isEqualTo("Year 2000");
        assertThat(isYearLeap.isYearLeap(2004)).isEqualTo("Year 2004");
        assertThat(isYearLeap.isYearLeap(1984)).isEqualTo("Year 1984");
    }
}
