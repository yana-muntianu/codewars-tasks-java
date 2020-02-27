package codewars.tasks.java.action;

import codewars.tasks.java.battle.Battle;
import codewars.tasks.java.battle.Fighter;

public class BattleExecution {

    public static void main (String [] args){

        Battle.declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew");
    }
}
