package codewars.tasks.java;

public class LeapYears {

    public boolean isYearLeap(int year){
        boolean isYearLeap = false;

        if(year % 100 == 0){
            isYearLeap = false;
        } else if (year % 400 == 0){
            isYearLeap = true;
        } else if (year % 4 == 0){
            isYearLeap = true;
        }

        System.out.println("Is "+year+ " leap? - "+isYearLeap);
        return isYearLeap;
    }
}
