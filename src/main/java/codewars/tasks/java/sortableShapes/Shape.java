package codewars.tasks.java.sortableShapes;

public  class Shape implements Comparable<Shape> {

    protected double area;

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                '}';
    }

    private void setArea(double area) {
        this.area = area;
    }

    @Override
    public int compareTo( Shape o ) {
        return Double.compare( area, area );
    }
}