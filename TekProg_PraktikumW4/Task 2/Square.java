public class Square extends Rectangle {
    // Constructor
    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square( double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    // Getter and Setter
    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    // Method
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        return 4 * getSide();
    }
}
