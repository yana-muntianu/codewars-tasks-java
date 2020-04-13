package codewars.tasks.java;

import codewars.tasks.java.allinclusive.Rotations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RotationsTest {

    private static final Logger Log = LogManager.getLogger(RotationsTest.class.getName());

    @Test(testName = "15", description = "Verify Rotations method")
    public void testRotations() {

        Log.info("@Test - testRotations()");

        assertThat(Rotations.containAllRots("", Arrays.asList())).isTrue();

        List<String> a = Arrays.asList("bsjq", "qbsj");
        assertThat(Rotations.containAllRots("", a)).isTrue();

        a = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        assertThat(Rotations.containAllRots("bsjq", a)).isTrue();

        a = Arrays.asList("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
        assertThat(Rotations.containAllRots("XjYABhR", a)).isFalse();
    }
}
