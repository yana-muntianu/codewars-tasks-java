package codewars.tasks.java;

import codewars.tasks.java.getinitials.GetInitials;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class InitialsTest {
    @Test(testName = "11", description = "Verify that got initials are matched with full name")
    public void testInitials(){
        System.out.println("@Test - testInitials");
        GetInitials initials = new GetInitials();
        assertEquals("J. B.",initials.toInitials("Jack Bacon"));
        assertEquals("M. A.",initials.toInitials("Mary Andersen"));
        assertEquals("Please input full name",initials.toInitials("Andy"));
        assertEquals("Please input full name",initials.toInitials("Kenneth Low Jr."));
        assertEquals("M. V.",initials.toInitials("Mike Vazovsky"));
    }
}
