package codewars.tasks.java;

import codewars.tasks.java.allinclusive.Rotations;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RotationsTest {

    @Test(testName = "15", description = "Verify Rotations method")
    public void test1Rotations() {

        System.out.println("@Test - test1Rotations");

        assertThat(Rotations.containAllRots("", Arrays.asList())).isTrue();

        List<String> a = Arrays.asList("bsjq", "qbsj");
        assertThat(Rotations.containAllRots("", a)).isTrue();

        a = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        assertThat(Rotations.containAllRots("bsjq", a)).isTrue();

        a = Arrays.asList("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
        assertThat(Rotations.containAllRots("XjYABhR", a)).isFalse();
    }
}
