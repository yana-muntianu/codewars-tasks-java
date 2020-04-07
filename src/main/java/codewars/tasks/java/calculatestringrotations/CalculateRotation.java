package codewars.tasks.java.calculatestringrotations;

public class CalculateRotation {

    /*
    Write a function that receives two strings and returns n, where n is equal to the number of characters we should
shift the first string forward to match the second.
For instance, take the strings "fatigue" and "tiguefa". In this case, the first string has been rotated 5 characters
forward to produce the second string, so 5 would be returned.
If the second string isn't a valid rotation of the first string, the method returns -1.
     */
    public static int shiftedDiff(String first, String second){

        if(first.length() != second.length()){
            return -1;
        }

        if(first.equals(second)){
            return 0;
        }

        for(int i = 0; i<first.length();i++){
            first = first.substring(first.length()-1)+first.substring(0,first.length()-1);
            if(first.equals(second)){
                return i+1;
            }
        }
        return -1;
    }


}
