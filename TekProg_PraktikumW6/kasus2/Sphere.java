package kasus2;

public class Sphere extends Shape {
    private double radius;

    /* A Constructor for Sphere Class */
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // Getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * @brief Method for calculating the surface area of the sphere
     * @return double value of surface area of sphere object.
     */
    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    /**
     * @brief string representation of the sphere object.
     * @return string with sphere name.
     */
    @Override
    public String toString() {
        return super.toString() + ", radius: " + radius + ", area: " + area();
    }
}
