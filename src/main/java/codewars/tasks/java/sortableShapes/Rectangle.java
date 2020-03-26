package codewars.tasks.java.sortableShapes;

public class Rectangle extends Shape {

    public Rectangle(double width, double height) {
        this.area = width * height;
    }
    public int compareTo( Shape o ) {
        return Double.compare( area, area );
    }
}
