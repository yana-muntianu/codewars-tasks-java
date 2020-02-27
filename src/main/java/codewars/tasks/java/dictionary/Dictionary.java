package codewars.tasks.java.dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private final Map<String,String> dictionary = new HashMap<>();

    /*
     * Description:
     * In this kata, your job is to create a class Dictionary which you can add words to and their entries.
     */

    public Dictionary(){}

    public void newEntry(String key, String value){

        dictionary.put(key,value);
    }

    public String look(String key){

        if (dictionary.containsKey(key)){
           return dictionary.get(key);
        } else
            return "Cant find entry for " + key;

    }
}
