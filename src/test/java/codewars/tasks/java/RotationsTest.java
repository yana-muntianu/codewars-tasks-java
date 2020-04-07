package codewars.tasks.java;

import codewars.tasks.java.allinclusive.Rotations;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import static org.testng.Assert.assertEquals;

public class RotationsTest {

    private static void testing(Boolean actual, Boolean expected) {
        assertEquals(expected, actual);
    }

    @Test (testName = "13", description = "Verify Rotations method")
    public void test1Rotations() {

        System.out.println("Fixed Tests containAllRots");
        testing(Rotations.containAllRots("", Arrays.asList()), true);

        List<String> a = Arrays.asList("bsjq", "qbsj");
        testing(Rotations.containAllRots("", a), true);

        a = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        testing(Rotations.containAllRots("bsjq", a), true);

        a = Arrays.asList("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
        testing(Rotations.containAllRots("XjYABhR", a), false);
    }
}
