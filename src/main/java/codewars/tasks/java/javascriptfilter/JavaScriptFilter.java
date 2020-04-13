package codewars.tasks.java.javascriptfilter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class JavaScriptFilter {

    /*
    write a function that takes an array of pairs of login-names and e-mails,
    and outputs an array of all login-name, e-mails-pairs from the login-names that end with "_".
     */
    private static final Logger Log = LogManager.getLogger(JavaScriptFilter.class.getName());

    public String[][] verifyEmails(String[][] login) {

        Log.info("Running verifyEmails() method");

        String[][] arrayResult = Arrays.stream(login)
                .filter(innerList -> innerList[0].endsWith("_"))
                .toArray(String[][]::new);

            Arrays.stream(arrayResult).forEach(el ->System.out.println(Arrays.toString(el)));
            return arrayResult;
    }
}
