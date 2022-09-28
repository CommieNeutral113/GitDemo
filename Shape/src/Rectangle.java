import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    public Rectangle(){}

    /** abc. */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /** abc. */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /** abc. */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /** abc. */
    @Override
    public double getArea() {
        return length * width;
    }

    /** abc. */
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.getWidth(), getWidth()) == 0
                && Double.compare(rectangle.getLength(), getLength()) == 0 && Objects.equals(getTopLeft(), rectangle.getTopLeft());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getLength(), getTopLeft());
    }

    /** abc. */
    @Override
    public String toString() {
        String output = ("Rectangle[topLeft=" + topLeft);
        output += (",width=" + width);
        output += (",length=" + length);
        output += (",color=" + color);
        output += (",filled=" + filled + "]");
        return output;
    }
}
