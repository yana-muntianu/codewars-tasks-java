package codewars.tasks.java;

import codewars.tasks.java.javascriptfilter.JavaScriptFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaScriptFilterTest {

    private static final Logger Log = LogManager.getLogger(JavaScriptFilterTest.class.getName());

    @Test(testName = "10", description = "Check emails with '_'")
    public void testVerifyEmails(){

        Log.info("@Test - testVerifyEmails()");

        JavaScriptFilter filter = new JavaScriptFilter();

        //1 email found
        String[][] input = { new String[]{ "foo", "foo@foo.com" }, new String[]{ "bar_", "bar@bar.com" } };
        String[][] act = {new String[] { "bar_", "bar@bar.com" }};
        assertThat(filter.verifyEmails(input)).contains(act);


        //2 emails found
        String[][] input1 = { new String[]{  "foo_", "foo@foo.com" }, new String[]{ "bar_", "bar@bar.com" } };
        String[][] exp1 = {new String[]{ "foo_", "foo@foo.com"}, new String[] { "bar_", "bar@bar.com" }};
        assertThat(filter.verifyEmails(input1)).contains(exp1);

        //no matching
        String[][] input2 = { new String[]{  "foo", "foo@foo.com" }, new String[]{ "bar", "bar@bar.com" } };
        String[][] exp2 = new String[0][];
        assertThat(filter.verifyEmails(input2)).contains(exp2);

        //2 emails from 4 matched
        String[][] input3 = { new String[]{  "foo_", "foo@foo.com" }, new String[]{ "bar_", "bar@bar.com" },
            new String[]{ "may", "may@may.com" }, new String[]{ "bee", "bee@bee.com" }};
        String[][] exp3 = {new String[]{ "foo_", "foo@foo.com"}, new String[] { "bar_", "bar@bar.com" }};
        assertThat(filter.verifyEmails(input3)).contains(exp3);
    }
}
