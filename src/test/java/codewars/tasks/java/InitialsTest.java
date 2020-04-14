package codewars.tasks.java;

import codewars.tasks.java.getinitials.GetInitials;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class InitialsTest {

    private static final Logger LOG = LogManager.getLogger(InitialsTest.class.getName());

    @Test(testName = "9", description = "Verify that got initials are matched with full name")
    public void testInitials(){

        LOG.info("@Test - testInitials()");

        GetInitials initials = new GetInitials();

        assertThat(initials.toInitials("Jack Bacon")).isEqualTo("J. B.");
        assertThat(initials.toInitials("Mary Andersen")).isEqualTo("M. A.");
        assertThat(initials.toInitials("Andy")).isEqualTo("Please input full name");
        assertThat(initials.toInitials("Kenneth Low Jr.")).isEqualTo("Please input full name");
        assertThat(initials.toInitials("Mike Vazovsky")).isEqualTo("M. V.");
    }
}
