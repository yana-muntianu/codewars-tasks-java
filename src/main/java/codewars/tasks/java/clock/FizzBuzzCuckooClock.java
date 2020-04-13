package codewars.tasks.java.clock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FizzBuzzCuckooClock {

    /*
    When a minute is evenly divisible by three, the clock will say the word "Fizz".
When a minute is evenly divisible by five, the clock will say the word "Buzz".
When a minute is evenly divisible by both, the clock will say "Fizz Buzz", with two exceptions:
On the hour, instead of "Fizz Buzz", the clock door will open, and the cuckoo bird will come out and "Cuckoo" between
one and twelve times depending on the hour.
On the half hour, instead of "Fizz Buzz", the clock door will open, and the cuckoo will come out and "Cuckoo" just once.
With minutes that are not evenly divisible by either three or five, at first you had intended to have the clock
just say the numbers ala Fizz Buzz, but then you decided at least for version 1.0 to just have the clock make a quiet,
subtle "tick" sound for a little more clock nature and a little less noise.
     */

    private static final Logger Log = LogManager.getLogger(FizzBuzzCuckooClock.class.getName());

    public static String fizzBuzzCuckooClock(String time){

        String message;
        int hours;
        int minutes;
        Log.info("Running fizzBuzzCuckooClock() method");

        String[] splitTime = time.split(":");
        hours = Integer.parseInt(splitTime[0]);
        minutes = Integer.parseInt(splitTime[1]);

        if(minutes == 0){
            int updatedHours = 0;
            switch (hours){
                case 0: case 12: {
                    updatedHours = 12;
                }break;
                case 1: case 13: {
                    updatedHours = 1;
                }break;
                case 2: case 14: {
                    updatedHours = 2;
                }break;
                case 3: case 15: {
                    updatedHours = 3;
                }break;
                case 4: case 16: {
                    updatedHours = 4;
                }break;
                case 5: case 17: {
                    updatedHours = 5;
                }break;
                case 6: case 18: {
                    updatedHours = 6;
                }break;
                case 7: case 19: {
                    updatedHours = 7;
                }break;
                case 8: case 20: {
                    updatedHours = 8;
                }break;
                case 9: case 21: {
                    updatedHours = 9;
                }break;
                case 10: case 22: {
                    updatedHours = 10;
                }break;
                case 11: case 23: {
                    updatedHours = 11;
                }break;
                default:
                    Log.error("Incorrect time format");
                    throw new IllegalArgumentException();
            }
            message = "Cuckoo ";
            String newMessage = message.repeat(updatedHours);

            return newMessage.trim();

        }else if (minutes == 30) {
            message = "Cuckoo";
        }else if (minutes % 3 == 0 && minutes % 5 == 0){
                message = "Fizz Buzz";
        }else if (minutes % 3 == 0){
            message = "Fizz";
        }else if (minutes % 5 == 0){
            message = "Buzz";
        }else if (minutes >= 0 && minutes <= 59){
            message = "tick";
        }else
            message = "Incorrect time format";

        return message;
    }

}
