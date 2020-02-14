package codewars.tasks.java.battle;

public class Battle {

    /**
     * This method declares winners within two fighters with parameters:
     * name, health, damage and returns the winner name
     */
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        int fighter1Health = fighter1.getHealth();
        int fighter2Health = fighter2.getHealth();
        int fighter1Damage = fighter1.getDamagePerAttack();
        int fighter2Damage = fighter2.getDamagePerAttack();
        String fighter1Name = fighter1.getName();
        String fighter2Name = fighter2.getName();

        if (firstAttacker.equals(fighter1Name)) {

            while (fighter1Health > 0 && fighter2Health > 0) {
                fighter2Health = fighter2Health - fighter1Damage;
                if (fighter2Health <=0) return fighter1Name;

                fighter1Health = fighter1Health - fighter2Damage;
                if (fighter1Health <=0) return fighter2Name;

            }

        }else {

            while (fighter1Health > 0 && fighter2Health > 0) {
                fighter1Health = fighter1Health - fighter2Damage;
                if (fighter1Health <=0) return fighter2Name;

                fighter2Health = fighter2Health - fighter1Damage;
                if (fighter2Health <=0) return fighter1Name;

            }
        }

        return "";
    }
}
