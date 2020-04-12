package codewars.tasks.java.sortableshapes;

public  class Shape implements Comparable<Shape> {

    protected double area;

    Shape(final double area) {

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

