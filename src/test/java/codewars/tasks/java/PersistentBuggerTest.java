package codewars.tasks.java;

import codewars.tasks.java.persictentbugger.Persist;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class PersistentBuggerTest {

    @Test (testName = "14", description = "Verify Persistent Bugger")
    public void testPersistentBugger() {

        System.out.println("@Test - testPersistentBugger");

        assertThat(Persist.persistence(39)).isEqualTo(3);
        assertThat(Persist.persistence(4)).isEqualTo(0);
        assertThat(Persist.persistence(25)).isEqualTo(2);
        assertThat(Persist.persistence(999)).isEqualTo(4);
    }
}
