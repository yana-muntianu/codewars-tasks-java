package codewars.tasks.java;

import codewars.tasks.java.numberinexpandedform.NumberInExpandedForm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberInExpandedFormTest {

    private static final Logger LOG = LogManager.getLogger(NumberInExpandedFormTest.class.getName());

    @Test (testName = "13", description = "Verify expanded form method")
    public void testIsNumInExpandedForm() {

        LOG.info("@Test - testIsNumInExpandedForm()");

        assertThat(NumberInExpandedForm.expandedForm(12)).isEqualTo("10 + 2");
        assertThat(NumberInExpandedForm.expandedForm(42)).isEqualTo("40 + 2");
        assertThat(NumberInExpandedForm.expandedForm(70304)).isEqualTo("70000 + 300 + 4");
    }
}
