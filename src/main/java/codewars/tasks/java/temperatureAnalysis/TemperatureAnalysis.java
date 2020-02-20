package codewars.tasks.java.temperatureAnalysis;

import java.util.Arrays;

public class TemperatureAnalysis {

    /*
    You were given a string of integer temperature values.
    Create a function lowest_temp(t) and return the lowest value or None/null/Nothing if the string is empty.
     */
    public int lowestTemperature(String temperature){

        Integer lowestValue = 0;

        if (!temperature.isEmpty()){

            String[] splitTemperature = temperature.split(" ");
            int size = splitTemperature.length;
            Integer [] temperatureIsInt = new Integer[size];
            for(int i=0; i<size; i++) {
                temperatureIsInt[i] = Integer.parseInt(splitTemperature[i]);
            }
            Arrays.sort(temperatureIsInt);
            lowestValue = temperatureIsInt[0];
            System.out.println(lowestValue);

        }else
            System.out.println("There is no value");

    return lowestValue;
    }
}
