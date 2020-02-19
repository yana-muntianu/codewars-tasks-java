package codewars.tasks.java.allInclusive;

import java.util.List;

public class Rotations {

    public static boolean containAllRots(String string, List<String> arr) {

        int len = string.length();
//        String [] array = new String[]{};

        /*
        copy the second part of the string in the temporary string and then
        copy the first part of the original string to the temporary string.
         */

        for(int i=0; i<len; i++) {
            for (int j = i + 1; j < len; j++)
                System.out.println(string.charAt(j));
//                while (i <= len){
//                    int [] array = new int[len];
//                    array[0] = string.charAt(j);
//
//                }

            for (int k = 0; k <= i; k++)
                System.out.println(string.charAt(k));

        }



        return true;
    }
}
