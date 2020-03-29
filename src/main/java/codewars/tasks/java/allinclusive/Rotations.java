package codewars.tasks.java.allinclusive;

import java.util.ArrayList;
import java.util.List;

public class Rotations {

    public static boolean containAllRots(String strng, List<String> arr) {

        /*
        Input:
        - a string strng
        - an array of strings arr
        Output of function contain_all_rots(strng, arr) (or containAllRots or contain-all-rots):
        a boolean true if all rotations of strng are included in arr (C returns 1)
        false otherwise (C returns 0)
         */

        boolean isAllRots = false;
        int n = strng.length();
        List<String> rotations = new ArrayList<>();

        if (!strng.isEmpty() && !arr.isEmpty()) {

            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = i + 1; j < n; j++)
                    sb.append(strng.charAt(j));
                for (int k = 0; k <= i; k++)
                    sb.append(strng.charAt(k));
                rotations.add(sb.toString());
            }

            for (int p = 0; p < rotations.size(); p++) {
                int finalP = p;
                isAllRots = arr.stream().anyMatch(x -> x.equals(rotations.get(finalP)));
                if (!isAllRots) {
                    break;
                }
            }
        }else if (strng.isEmpty()){
            isAllRots = true;
        }else {
            isAllRots = true;
        }
        System.out.println(isAllRots);
        return isAllRots;
    }
}
