package codewars.tasks.java;

import codewars.tasks.java.battle.*;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BattleTest {

    @Test(testName = "2", description = "Verify Battle method (find winner)")
    public void testBattle(){

        System.out.println("@Test - testBattle");

        assertThat(Battle.declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew")).isEqualTo("Lew");
        assertThat(Battle.declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Harry")).isEqualTo("Harry");
        assertThat(Battle.declareWinner(new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4), "Harry")).isEqualTo("Harald");
        assertThat(Battle.declareWinner(new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4), "Harald")).isEqualTo("Harald");
        assertThat(Battle.declareWinner(new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5), "Jerry")).isEqualTo("Harald");
        assertThat(Battle.declareWinner(new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5), "Harald")).isEqualTo("Harald");
    }
}
