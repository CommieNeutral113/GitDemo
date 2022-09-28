public class Square extends Rectangle {
    public Square() {
    }

    /** abc. */
    public Square(double side) {
        super(side, side);
    }

    /** abc. */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /** abc. */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    /** abc. */
    @Override
    public String toString() {
        String output = ("Square[topLeft=" + topLeft);
        output += (",side=" + getSide());
        output += (",color=" + color);
        output += (",filled=" + filled + "]");
        return output;
    }
}
