package codewars.tasks.java;

import codewars.tasks.java.sortableshapes.*;
import codewars.tasks.java.sortableshapes.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class SortableShapesTest {

    private static final Logger LOG = LogManager.getLogger(SortableShapesTest.class.getName());

    @Test(testName = "16", description = "Verify shapes sorting")
    public void testShapesAreSortableOnArea(){

        LOG.info("@Test - testShapesAreSortableOnArea()");

        // Arrange
        double area, side, radius, base, height, width;
        ArrayList<Shape> expected = new ArrayList<Shape>();

        area = 1.1234;
        expected.add(new CustomShape(area));

        side = 1.1234;
        expected.add(new Square(side));

        radius = 1.1234;
        expected.add(new Circle(radius));

        height = 2.;
        base = 5.;
        expected.add(new Triangle(base, height));

        height = 3.;
        base = 4.;
        expected.add(new Triangle(base, height));

        width = 4.;
        expected.add(new Rectangle(width, height));

        area = 16.1;
        expected.add(new CustomShape(area));

        Random random = new Random();
        ArrayList<Shape> actual = createRandomOrderedList(random, expected);

        // Act
        Collections.sort(actual);

        // Assert
        Iterator a = actual.iterator();
        for (Shape e : expected) {
            assertThat(a.next()).isEqualTo(e);
        }
    }

    private ArrayList<Shape> createRandomOrderedList(Random random, ArrayList<Shape> expected){
        ArrayList<Shape> actual = new ArrayList<Shape>();
        for (Shape shape : expected) {
            int j = random.nextInt(actual.size()+1);
            actual.add(j, shape);
        }
        return actual;
    }
}

