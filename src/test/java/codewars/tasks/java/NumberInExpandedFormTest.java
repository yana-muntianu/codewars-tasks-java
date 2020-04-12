package codewars.tasks.java;

import codewars.tasks.java.numberInexpandedform.NumberInExpandedForm;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class NumberInExpandedFormTest {

    @Test (testName = "13", description = "Verify expanded form method")
    public void testIsNumInExpandedForm() {

        System.out.println("@Test - testIsNumInExpandedForm");

        assertThat(NumberInExpandedForm.expandedForm(12)).isEqualTo("10 + 2");
        assertThat(NumberInExpandedForm.expandedForm(42)).isEqualTo("40 + 2");
        assertThat(NumberInExpandedForm.expandedForm(70304)).isEqualTo("70000 + 300 + 4");
    }
}
