package codewars.tasks.java;

import codewars.tasks.java.persictentbugger.Persist;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersistentBuggerTest {

    private static final Logger LOG = LogManager.getLogger(PersistentBuggerTest.class.getName());

    @Test (testName = "14", description = "Verify Persistent Bugger")
    public void testPersistentBugger() {

        LOG.info("@Test - testPersistentBugger()");

        assertThat(Persist.persistence(39)).isEqualTo(3);
        assertThat(Persist.persistence(4)).isEqualTo(0);
        assertThat(Persist.persistence(25)).isEqualTo(2);
        assertThat(Persist.persistence(999)).isEqualTo(4);
    }
}
