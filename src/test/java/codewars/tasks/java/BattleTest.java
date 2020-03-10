package codewars.tasks.java;
import codewars.tasks.java.battle.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class BattleTest {

    @Test(testName = "4", description = "Verify Battle method (find winner)")
        public void testBattle(){
        System.out.println("@Test - testBattle");
        Battle battle = new Battle();
        assertEquals("Lew", Battle.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", Battle.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Battle.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", Battle.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", Battle.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", Battle.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }
}
