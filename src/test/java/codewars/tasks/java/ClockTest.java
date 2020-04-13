package codewars.tasks.java;

import codewars.tasks.java.clock.FizzBuzzCuckooClock;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClockTest {

    private static final Logger Log = LogManager.getLogger(ClockTest.class.getName());

    @Test (testName = "7", description = "Verify FizzBuzzCuckooClock method")
    public void testCuckooClock () {

        Log.info("@Test - testCuckooClock(): with time 13:34");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("13:34")).isEqualTo("tick");

        Log.info("@Test - testCuckooClock(): with time 21:00");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("21:00"))
                .isEqualTo("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo");

        Log.info("@Test - testCuckooClock(): with time 11:15");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("11:15")).isEqualTo("Fizz Buzz");

        Log.info("@Test - testCuckooClock(): with time 03:03");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("03:03")).isEqualTo("Fizz");

        Log.info("@Test - testCuckooClock(): with time 14:30");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("14:30")).isEqualTo("Cuckoo");

        Log.info("@Test - testCuckooClock(): with time 08:55");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("08:55")).isEqualTo("Buzz");

        Log.info("@Test - testCuckooClock(): with time 00:00");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("00:00"))
                .isEqualTo("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo");

        Log.info("@Test - testCuckooClock(): with time 12:00");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("12:00"))
                .isEqualTo("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo");
    }
}
