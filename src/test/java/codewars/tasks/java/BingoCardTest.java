package codewars.tasks.java;

import codewars.tasks.java.bingocard.BingoCard;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class BingoCardTest {

    private static final Logger Log = LogManager.getLogger(BingoCardTest.class.getName());

    @Test(testName = "3.1", description = "Verify Bingo card contains 24 cards")
    public void testCardHas24Numbers() {

        Log.info("@Test - testCardHas24Numbers()");
        assertThat(BingoCard.getCard().length).isEqualTo(24);
    }

    @Test(testName = "3.2", description = "Verify Bingo card contains unique numbers")
    public void testEachNumberOnCardIsUnique(){

        Log.info("@Test - testEachNumberOnCardIsUnique()");

        for (int i=0; i<10; i++)
        {
            String[] card = BingoCard.getCard();

            Set<String> set = new HashSet<>(Arrays.asList(card));

            assertThat(set.size()).isEqualTo(card.length);
        }
    }

    @Test(testName = "3.3", description = "Verify Bingo card categories are in correct order")
    public void testCategoriesAreInCorrectOrder(){

        Log.info("@Test - testCategoriesAreInCorrectOrder()");
        String[] card = BingoCard.getCard();

        checkCategory(card, "B", 1, 5);
        checkCategory(card, "I", 6, 10);
        checkCategory(card, "N", 11, 14);
        checkCategory(card, "G", 15, 19);
        checkCategory(card, "O", 20, 24);
    }

    private void checkCategory(String[] card, String column, int start, int end) {

        for (int i = start-1; i < end; i++)
        {
            assertThat(card[i]).contains(column);
        }
    }

    @Test(testName = "3.4", description = "Verify Bingo card numbers ranges")
    public void testNumbersWithinColumnAreAllInTheCorrectRange(){

        Log.info("@Test - testNumbersWithinColumnAreAllInTheCorrectRange()");
        String[] card = BingoCard.getCard();

        checkColumn(card, "B", 1, 5, 1, 15);
        checkColumn(card, "I", 6, 10, 16, 30);
        checkColumn(card, "N", 11, 14, 31, 45);
        checkColumn(card, "G", 15, 19, 46, 60);
        checkColumn(card, "O", 20, 24, 61, 75);
    }

    private void checkColumn(String[] card, String column, int start, int end, int beginRange, int endRange){

        for (int i=start-1; i<end; i++)
        {
            int n = Integer.valueOf(card[i].substring(1));
            assertThat(n).isGreaterThanOrEqualTo(beginRange);
            assertThat(n).isLessThanOrEqualTo(endRange);
        }
    }

    @Test(testName = "3.5", description = "Verify Bingo card numbers random order")
    public void testNumbersWithinColumnAreInRandomOrder(){

        Log.info("@Test - testNumbersWithinColumnAreInRandomOrder()");
        String[] card = BingoCard.getCard();

        int count = checkColumnOnRandomness(card, "B", 1, 5) +
                checkColumnOnRandomness(card, "I", 6, 10) +
                checkColumnOnRandomness(card, "N", 11, 14) +
                checkColumnOnRandomness(card, "G", 15, 19) +
                checkColumnOnRandomness(card, "O", 20, 24);

        assertThat(count).isGreaterThan(1);
    }

    private int checkColumnOnRandomness(String[] card, String column, int start, int end){

        int n = 0;
        boolean up = false;
        boolean down = false;

        for (int i = start-1; i < end; i++)
        {
            int n1 = Integer.valueOf(card[i].substring(1));

            if (n != 0)
            {
                if (n1 > n) up = true;
                if (n1 < n) down = true;
            }
            n = n1;
        }

        return up && down ? 1 : 0;
    }
}
