package codewars.tasks.java.vector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vector3D {
    /**
     * This method counts length of a vector with given params
     */
    public double Length;
    private static final Logger Log = LogManager.getLogger(Vector3D.class.getName());

    public double getLength(double X, double Y, double Z){

        Length = Math.sqrt(X*X+Y*Y+Z*Z);
        Log.info("Running getLength() method");
        return  Length;

    }
}

