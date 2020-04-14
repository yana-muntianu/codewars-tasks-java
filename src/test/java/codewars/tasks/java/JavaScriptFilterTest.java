package codewars.tasks.java;

import codewars.tasks.java.javascriptFilter.JavaScriptFilter;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class JavaScriptFilterTest {

    @Test(testName = "12", description = "Check emails with '_'")
    public void testVerifyEmails(){

        JavaScriptFilter filter = new JavaScriptFilter();

        //1 email found
        String[][] input = { new String[]{ "foo", "foo@foo.com" }, new String[]{ "bar_", "bar@bar.com" } };
        String[][] act = {new String[] { "bar_", "bar@bar.com" }};
        assertEquals(act, filter.verifyEmails(input));

        //2 emails found
        String[][] input1 = { new String[]{  "foo_", "foo@foo.com" }, new String[]{ "bar_", "bar@bar.com" } };
        String[][] exp1 = {new String[]{ "foo_", "foo@foo.com"}, new String[] { "bar_", "bar@bar.com" }};
        assertEquals(exp1, filter.verifyEmails(input1));

        //no matching
        String[][] input2 = { new String[]{  "foo", "foo@foo.com" }, new String[]{ "bar", "bar@bar.com" } };
        String[][] exp2 = new String[0][];
        assertEquals(exp2, filter.verifyEmails(input2));

        //2 emails from 4 matched
        String[][] input3 = { new String[]{  "foo_", "foo@foo.com" }, new String[]{ "bar_", "bar@bar.com" },
            new String[]{ "may", "may@may.com" }, new String[]{ "bee", "bee@bee.com" }};
        String[][] exp3 = {new String[]{ "foo_", "foo@foo.com"}, new String[] { "bar_", "bar@bar.com" }};
        assertEquals(exp3, filter.verifyEmails(input3));

    }
}
