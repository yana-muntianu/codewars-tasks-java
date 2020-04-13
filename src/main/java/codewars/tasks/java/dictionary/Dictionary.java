package codewars.tasks.java.dictionary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private final Map<String,String> dictionary = new HashMap<>();
    private static final Logger Log = LogManager.getLogger(Dictionary.class.getName());

    /*
     * Description:
     * In this kata, your job is to create a class Dictionary which you can add words to and their entries.
     */

    public Dictionary(){}

    public void newEntry(String key, String value){

        Log.info("Running newEntry() method - add new entry to dictionary");
        dictionary.put(key,value);
    }

    public String look(String key){

        Log.info("Running look() method");

        if (dictionary.containsKey(key)){
           return dictionary.get(key);
        } else
            Log.error(String.format("Cant find entry for %s", key));
            return "Cant find entry for " + key;

    }
}
