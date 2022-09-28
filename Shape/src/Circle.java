public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle(){}

    /** abc. */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** abc. */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /** abc. */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** abc. */
    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    /** abc. */
    @Override
    public double getPerimeter() {
        return 6.28 * radius;
    }

    /** abc. */
    @Override
    public String toString() {
        String output = ("Circle[center=" + center.toString());
        output += (",radius=" + radius);
        output += (",color=" + color);
        output += (",filled=" + filled + "]");
        return output;
    }
}
