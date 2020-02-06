package codewars.tasks.java;

public class Vector3D {

    public double Length;

    public double getLength(double X, double Y, double Z){

        Length = Math.sqrt(X*X+Y*Y+Z*Z);
        System.out.println(Length);
        return  Length;

    }
}

