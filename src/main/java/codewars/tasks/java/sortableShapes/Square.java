package codewars.tasks.java.sortableShapes;

public class Square extends Shape {

    public Square(double side){
        this.area = side*side;
    }

    public int compareTo( Shape o ) {
        return Double.compare( area, area );
    }
}
