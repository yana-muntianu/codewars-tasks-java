package codewars.tasks.java.numberInexpandedform;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class NumberInExpandedForm {

    /*
    * You will be given a number and you will need to return it as a string in Expanded Form.
    */
    private static final Logger Log = LogManager.getLogger(NumberInExpandedForm.class.getName());

    public static String expandedForm(int num) {

        Log.info("Running expandedForm() method");
        String[] str = Integer.toString(num).split("");
        String result;

        for(int i = 0; i < str.length-1; i++) {
            if(Integer.parseInt(str[i]) > 0) {
                for(int j = i; j < str.length-1; j++) {
                    str[i] += '0';
                }
            }
        }

        result = Arrays.toString(str);
        result = result.substring(1, result.length()-1).replace(", 0","").replace(",", " +");

        return result;
    }
}
