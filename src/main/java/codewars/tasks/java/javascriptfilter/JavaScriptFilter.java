package codewars.tasks.java.javascriptfilter;

import java.util.Arrays;

public class JavaScriptFilter {

    /*
    write a function that takes an array of pairs of login-names and e-mails,
    and outputs an array of all login-name, e-mails-pairs from the login-names that end with "_".
     */
    public String[][] verifyEmails(String[][] login) {

        String[][] arrayResult = Arrays.stream(login)
                .filter(innerList -> innerList[0].endsWith("_"))
                .toArray(String[][]::new);

            Arrays.stream(arrayResult).forEach(el ->System.out.println(Arrays.toString(el)));
            return arrayResult;
    }
}
