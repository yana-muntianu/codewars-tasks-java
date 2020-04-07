package codewars.tasks.java.action;

import codewars.tasks.java.sortableShapes.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortableShapesExecution {

    public static void main(String[] args) {

        double side = 1.1234;
        double radius = 1.1234;
        double base = 5;
        double height = 2;
        double area = 60;

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(side));
        shapes.add(new Triangle(base, height));
        shapes.add(new CustomShape(area));
        shapes.add(new Circle(radius));

        Collections.sort(shapes);
        Object[] sh = shapes.toArray();
        System.out.println(Arrays.toString(sh));

    }
}
