package codewars.tasks.java;

public class Vector3D {
    /**
     * This method counts length of a vector with given params
     */
    public double Length;

    public double getLength(double X, double Y, double Z){

        Length = Math.sqrt(X*X+Y*Y+Z*Z);
        System.out.println(Length);
        return  Length;

    }
}

