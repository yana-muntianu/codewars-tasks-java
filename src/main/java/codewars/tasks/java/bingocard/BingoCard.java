package codewars.tasks.java.bingocard;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Random;

public class BingoCard {

    private static final Logger LOG = LogManager.getLogger(BingoCard.class.getName());
    static Random randomB = new Random();
    static Random randomI = new Random();
    static Random randomN = new Random();
    static Random randomG = new Random();
    static Random randomO = new Random();
/*
A Bingo card contains 24 unique and random numbers according to this scheme:
5 numbers from the B column in the range 1 to 15
5 numbers from the I column in the range 16 to 30
4 numbers from the N column in the range 31 to 45
5 numbers from the G column in the range 46 to 60
5 numbers from the O column in the range 61 to 75

The card must be returned as an array of Bingo style numbers
The numbers must be in the order of their column: B, I, N, G, O. Within the columns the order of the numbers is random
 */
    public static String[] getCard() {

        LOG.info("Running getCard() method");
        ArrayList<String> bingoList = new ArrayList<>();
        String[] bingoCard;

        for (int b = 0; bingoList.size() < 5; b++) {
            int randomb = randomB.nextInt(15 - 1) + 1;
            if (numCheck(bingoList, "B" + randomb)) {
                bingoList.add("B" + randomb);
            }

        }
        for (int i = 0; bingoList.size() < 10; i++) {
            int randomi = randomI.nextInt(30 - 16) + 16;
            if (numCheck(bingoList, "I" + randomi)) {
                bingoList.add("I" + randomi);
            }
        }
        for (int n = 0; bingoList.size() < 14; n++) {
            int randomn = randomN.nextInt(45 - 31) + 31;
            if (numCheck(bingoList, "N" + randomn)) {
                bingoList.add("N" + randomn);
            }
        }
        for (int g = 0; bingoList.size() < 19; g++) {
            int randomg = randomG.nextInt(60 - 46) + 46;
            if (numCheck(bingoList, "G" + randomg)) {
                bingoList.add("G" + randomg);
            }
        }
        for (int o = 0; bingoList.size() < 24; o++) {
            int randomo = randomO.nextInt(75 - 61) + 61;
            if (numCheck(bingoList, "O" + randomo)) {
                bingoList.add("O" + randomo);
            }
        }

        bingoCard = bingoList.toArray(new String[bingoList.size()]);

        return bingoCard;

    }

    public static boolean numCheck(ArrayList<String> bingoList, String bingoNum) {

        for (int j = 0; j < bingoList.size(); j++) {
            if (bingoList.get(j).equals(bingoNum)) {
                return false;
            }
        }
        return true;
    }
}