package codewars.tasks.java.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    /*
Implement:
Calculator.getTotalArea()
Define the different shapes: `Square`, `Rectangle`, `Circle` and `Triangle`
according to the tests given
 */
    private static final Logger LOG = LogManager.getLogger(Calculator.class.getName());

    public double getTotalArea(Figure... fig){
        double totalArea = 0;

        LOG.info("Running getTotalArea() method");
        for (Figure figure : fig) {
            totalArea += figure.getArea();
        }
        return roundDouble(totalArea);
    }
    public double roundDouble(double d){

        LOG.info("Running roundDouble() method");
        d= d*100;
        int i = (int)Math.round(d);
        return (double)i/100;
    }
}
