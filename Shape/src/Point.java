import java.lang.Math;
import java.util.Objects;

public class Point {
    private double PointX;
    private double PointY;

    /** abc. */
    public Point(double x, double y) {
        PointX = x;
        PointY = y;
    }

    public double getPointX() {
        return PointX;
    }

    public void setPointX(double pointX) {
        PointX = pointX;
    }

    public double getPointY() {
        return PointY;
    }

    public void setPointY(double pointY) {
        PointY = pointY;
    }

    /** abc. */
    public double distance(Point a) {
        double distanceX = this.PointX - a.getPointX();
        double distanceY = this.PointY - a.getPointY();
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Double.compare(point.getPointX(), getPointX()) == 0
                && Double.compare(point.getPointY(), getPointY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPointX(), getPointY());
    }

    public String toString() {
        String output = ("(" + getPointX());
        output += ("," + getPointY() + ")");
        return output;
    }
}
