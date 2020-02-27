package codewars.tasks.java;


import codewars.tasks.java.arithmeticFunction.ArithmeticFunction;
import codewars.tasks.java.battle.Battle;
import codewars.tasks.java.battle.Fighter;
import codewars.tasks.java.block.Block;
import codewars.tasks.java.leapYears.LeapYears;
import codewars.tasks.java.vector.Vector3D;

public class Main {

    public static void main (String [] args){

        Vector3D vector = new Vector3D();
        vector.getLength(0,2,0);

        Block block = new Block(new int[]{1,2,4});
        int volume = block.getVolume();
        int surfaceArea = block.getSurfaceArea();

        LeapYears isYearLeap = new LeapYears();
        isYearLeap.isYearLeap(2004);

        Battle.declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew");

        ArithmeticFunction function = new ArithmeticFunction();

    }
}
