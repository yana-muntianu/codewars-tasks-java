package codewars.tasks.java.persictentbugger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Persist {
   /* Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
        * which is the number of times you must multiply the digits in num until you reach a single digit.
        *
        * For example:
            *
            * # persistence(39) == 3  // because 3*9 = 27, 2*7 = 14, 1*4=4 and 4 has only one digit
            * # persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2
            * # persistence(4) == 0   // because 4 is already a one-digit number
            */
   private static final Logger LOG = LogManager.getLogger(Persist.class.getName());

    public static int persistence(long num) {
        int result = 0;
        LOG.info("Running persistence() method");

        while (num > 9) {
            long multiply = 1;
            for (char digit : String.valueOf(num).toCharArray()) {
                multiply *= Long.parseLong(String.valueOf(digit));
            }
            num = multiply;
            result++;
        }

        return result;
    }
}
