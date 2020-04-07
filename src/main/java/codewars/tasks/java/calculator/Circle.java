package codewars.tasks.java.calculator;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*(radius*radius);
    }

}
