package codewars.tasks.java.sortableshapes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public  class Shape implements Comparable<Shape> {

    protected double area;
    private static final Logger LOG = LogManager.getLogger(Shape.class.getName());

    Shape(final double area) {

        LOG.info("Count shape area");
        this.area = area;
    }

        @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                '}';
    }

        @Override
    public int compareTo( Shape o ) {
        if (o == null) {

            return 1;
        }

        return Double.compare(this.area, o.area);
    }

}

