package codewars.tasks.java.leapyears;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LeapYears {
    /**
     * This method verifies is given year leap or not
     */
    private static final Logger LOG = LogManager.getLogger(LeapYears.class.getName());

    public boolean isYearLeap(int year){

        LOG.info("Running isYearLeap() method");
        boolean isYearLeap = false;

        if(year % 100 == 0){
            isYearLeap = false;
        } else if (year % 400 == 0 || year % 4 == 0) { isYearLeap = true; }

        return isYearLeap;
    }
}
