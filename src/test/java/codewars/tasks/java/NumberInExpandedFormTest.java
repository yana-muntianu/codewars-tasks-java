package codewars.tasks.java;

import codewars.tasks.java.numberInExpandedForm.NumberInExpandedForm;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberInExpandedFormTest {

    @Test (testName = "13", description = "Verify expanded form method")
    public void testSomething() {
        assertEquals("10 + 2", NumberInExpandedForm.expandedForm(12));
        assertEquals("40 + 2", NumberInExpandedForm.expandedForm(42));
        assertEquals("70000 + 300 + 4", NumberInExpandedForm.expandedForm(70304));
    }
}
