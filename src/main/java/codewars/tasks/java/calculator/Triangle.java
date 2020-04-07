package codewars.tasks.java.calculator;

public class Triangle extends Figure {
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return (base/2)*height;
    }
}
