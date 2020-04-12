package codewars.tasks.java;

import codewars.tasks.java.dictionary.Dictionary;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DictionaryTest {

    @Test(testName = "8", description = "Verify Interactive Dictionary method")
    public void testInteractiveDictionary(){

        System.out.println("@Test - testInteractiveDictionary");

        Dictionary d = new Dictionary();

        d.newEntry("Apple", "A fruit");
        assertThat(d.look("Apple")).isEqualTo("A fruit");

        d.newEntry("Soccer", "A sport");
        assertThat(d.look("Soccer")).isEqualTo("A sport");

        assertThat(d.look("Hi")).isEqualTo("Cant find entry for Hi");
        assertThat(d.look("Ball")).isEqualTo("Cant find entry for Ball");

        d.newEntry("soccer", "a sport");
        assertThat(d.look("soccer")).isEqualTo("a sport");
    }
}
