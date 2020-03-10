package codewars.tasks.java.action;

import codewars.tasks.java.allInclusive.Rotations;

import java.util.Arrays;
import java.util.List;

public class RotationsExecution {

    public static void main (String[] args){

        List<String> a = Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs");
        Rotations.containAllRots("bsjq", a);
    }
}
