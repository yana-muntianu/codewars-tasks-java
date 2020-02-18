package codewars.tasks.java;

import codewars.tasks.java.boredomScore.Person;
import codewars.tasks.java.boredomScore.TheOffice;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TheOfficeTest {

    @Test (testName = "6", description = "Verify Boredom method, score < 80")
    public void testLessThan80() {
        assertEquals("kill me now", TheOffice.boredom(new Person[] {
                new Person("tim", "change"),
                new Person("jim", "accounts"),
                new Person("randy", "canteen"),
                new Person("sandy", "change"),
                new Person("andy", "change"),
                new Person("katie", "IS"),
                new Person("laura", "change"),
                new Person("saajid", "IS"),
                new Person("alex", "trading"),
                new Person("john", "accounts"),
                new Person("mr", "finance")
        }));
    }

    @Test (testName = "7", description = "Verify Boredom method, score < 100 & > 80")
    public void testLessThan100() {
        assertEquals("i can handle this", TheOffice.boredom(new Person[] {
                new Person("tim", "IS"),
                new Person("jim", "finance"),
                new Person("randy", "pissing about"),
                new Person("sandy", "cleaning"),
                new Person("andy", "cleaning"),
                new Person("katie", "cleaning"),
                new Person("laura", "pissing about"),
                new Person("saajid", "regulation"),
                new Person("alex", "regulation"),
                new Person("john", "accounts"),
                new Person("mr", "canteen")
        }));
    }

    @Test (testName = "8", description = "Verify Boredom method, score >= 100")
    public void testOver100() {
        assertEquals("party time!!", TheOffice.boredom(new Person[] {
                new Person("tim", "accounts"),
                new Person("jim", "accounts"),
                new Person("randy", "pissing about"),
                new Person("sandy", "finance"),
                new Person("andy", "change"),
                new Person("katie", "IS"),
                new Person("laura", "IS"),
                new Person("saajid", "canteen"),
                new Person("alex", "pissing about"),
                new Person("john", "retail"),
                new Person("mr", "pissing about")
        }));
    }
}
