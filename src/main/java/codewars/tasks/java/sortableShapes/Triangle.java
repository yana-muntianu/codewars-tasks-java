package codewars.tasks.java.sortableShapes;

public class Triangle extends Shape {

    public Triangle(double base, double height){
        this.area = base*(height/2);
    }
    public int compareTo( Shape o ) {
        return Double.compare( area, area );
    }
}
