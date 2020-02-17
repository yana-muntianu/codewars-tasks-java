package codewars.tasks.java;

import codewars.tasks.java.dictionary.Dictionary;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class DictionaryTest {

    @Test(testName = "5", description = "Verify Interactive Dictionary method")
        public void testInteractiveDictionary()
        {
            Dictionary d = new Dictionary();

            d.newEntry("Apple", "A fruit");
            assertEquals(d.look("Apple"), "A fruit");

            d.newEntry("Soccer", "A sport");
            assertEquals(d.look("Soccer"), "A sport");

            assertEquals(d.look("Hi"), "Cant find entry for Hi");
            assertEquals(d.look("Ball"),"Cant find entry for Ball");

            d.newEntry("soccer", "a sport");
            assertEquals(d.look("soccer"),"a sport");
        }
}
