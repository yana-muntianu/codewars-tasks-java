package codewars.tasks.java.allInclusive;

import java.util.ArrayList;
import java.util.List;

public class Rotations {

    public static boolean containAllRots(String string, List<String> arr) {

        /*
        copy the second part of the string in the temporary string and then
        copy the first part of the original string to the temporary string.
         */
        boolean isAllRots = false;
        int n = string.length();
        List<String> retval = new ArrayList<>();

        if (!string.isEmpty()){
            for(int i=0; i<n; i++){
                StringBuilder sb = new StringBuilder();
                for(int j=i+1; j<n; j++)
                    sb.append(string.charAt(j));
                for(int k=0; k<=i; k++)
                    sb.append(string.charAt(k));
                retval.add(sb.toString());
            }
        }else if (!arr.isEmpty()){
            for (String element:retval
                 ) {
                if (!arr.contains(element)){
                    isAllRots = false;
                    break;
                }else isAllRots = true;
            }

        }else
             isAllRots = true;
        System.out.println(isAllRots);

        return isAllRots;
    }
}
