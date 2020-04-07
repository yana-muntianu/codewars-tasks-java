package codewars.tasks.java.leetspeak;

/*
* 1) The code must contain a Leetspeak class inherited from an Encoder abstract class and containing an encode(String) method returning itself the encoded String.
* 2) The encode method should return an empty String if a null parameter is passed.
* 3) If any uppercase character is given, it should be compared also with the dictionary, 'a' gives '4' but 'A' gives also '4'.
* 4) If any character outside the dictionary is given, it should be output as is.
*/

abstract class Encoder{
    public abstract String encode(String source);
}

public class Leetspeak extends Encoder {

    public String encode(String source){

        if(source == null || source.isEmpty()) {
            return "";
        }

        source = source.replaceAll("(?i)a", "4"); //?i case insensitive
        source = source.replaceAll("(?i)e", "3");
        source = source.replaceAll("(?i)l", "1");
        source = source.replaceAll("(?i)m", "/^^\\\\");
        source = source.replaceAll("(?i)o", "0");
        source = source.replaceAll("(?i)u", "(_)");

        System.out.println(source);
        return source;
    }
}
