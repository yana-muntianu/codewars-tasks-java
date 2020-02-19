package codewars.tasks.java;


import codewars.tasks.java.allInclusive.Rotations;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main (String [] args){

//        Vector3D vector = new Vector3D();
//        vector.getLength(0,2,0);
//
//        Block block = new Block(new int[]{1,2,4});
//        int volume = block.getVolume();
//        int surfaceArea = block.getSurfaceArea();
//
//        LeapYears isYearLeap = new LeapYears();
//        isYearLeap.isYearLeap(2004);
//
//        Battle.declareWinner(new Fighter("Lew", 10, 2),
//                new Fighter("Harry", 5, 4), "Lew");


        List<String> a = Arrays.asList("test","estt", "ttes");
        Rotations.containAllRots("test", a);


    }
}
