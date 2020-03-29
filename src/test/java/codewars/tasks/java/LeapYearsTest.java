package codewars.tasks.java;
import codewars.tasks.java.leapyears.LeapYears;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LeapYearsTest {

    @Test (testName = "3", description = "Verify Leap Year method")
    public void testIsYearLeap(){
        System.out.println("@Test - testIsYearLeap");
        LeapYears isYearLeap = new LeapYears();
        assertFalse(isYearLeap.isYearLeap(2000), "Year 2000");
        assertTrue(isYearLeap.isYearLeap(2004), "Year 2004");
        assertTrue(isYearLeap.isYearLeap(1984), "Year 1984");


    }
}
