package codewars.tasks.java;

import codewars.tasks.java.persictentbugger.Persist;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PersistentBuggerTest {

        @Test (testName = "16", description = "Verify Persistent Bugger")
        public void testPersistentBugger() {
            System.out.println("****** Basic Tests ******");
            assertEquals(3, Persist.persistence(39));
            assertEquals(0, Persist.persistence(4));
            assertEquals(2, Persist.persistence(25));
            assertEquals(4, Persist.persistence(999));
        }


}
