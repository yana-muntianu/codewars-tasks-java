package codewars.tasks.java;

import codewars.tasks.java.clock.FizzBuzzCuckooClock;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ClockTest {

    @Test (testName = "7", description = "Verify FizzBuzzCuckooClock method")
    public void testCuckooClock () {

        System.out.println("@Test - testCuckooClock");

        System.out.println("Testing with time " + "13:34");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("13:34")).isEqualTo("tick");

        System.out.println("Testing with time " + "21:00");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("21:00"))
                .isEqualTo("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo");

        System.out.println("Testing with time " + "11:15");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("11:15")).isEqualTo("Fizz Buzz");

        System.out.println("Testing with time " + "03:03");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("03:03")).isEqualTo("Fizz");

        System.out.println("Testing with time " + "14:30");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("14:30")).isEqualTo("Cuckoo");

        System.out.println("Testing with time " + "08:55");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("08:55")).isEqualTo("Buzz");

        System.out.println("Testing with time " + "00:00");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("00:00"))
                .isEqualTo("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo");

        System.out.println("Testing with time " + "12:00");
        assertThat(FizzBuzzCuckooClock.fizzBuzzCuckooClock("12:00"))
                .isEqualTo("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo");
    }
}
