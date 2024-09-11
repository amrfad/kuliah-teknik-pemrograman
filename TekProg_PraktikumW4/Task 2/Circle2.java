public class Circle2 extends Shape {
    private double radius;

    // Constructor
    public Circle2() {
        super();
        this.radius = 1.0;
    }

    public Circle2(double radius) {
        super();
        this.radius = radius;
    }

    public Circle2(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter and Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
