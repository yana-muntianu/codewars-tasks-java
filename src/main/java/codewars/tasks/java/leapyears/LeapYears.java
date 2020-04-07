package codewars.tasks.java.leapyears;

public class LeapYears {
    /**
     * This method verifies is given year leap or not
     */
    public boolean isYearLeap(int year){
        boolean isYearLeap = false;

        if(year % 100 == 0){
            isYearLeap = false;
        } else if (year % 400 == 0 || year % 4 == 0) { isYearLeap = true; }

//        System.out.println("Is "+year+ " leap? - "+isYearLeap);
        System.out.println(String.format("Is %d year leap? - %b", year, isYearLeap));
        return isYearLeap;
    }
}
