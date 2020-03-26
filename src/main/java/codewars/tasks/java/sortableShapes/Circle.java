package codewars.tasks.java.sortableShapes;

public class Circle extends Shape{

    public Circle(double radius){
        this.area = radius*radius*Math.PI;
    }
    public int compareTo( Shape o ) {
        return Double.compare( area, area );
    }
}
