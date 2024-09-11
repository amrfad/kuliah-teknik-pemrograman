package kasus2;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    /* A Constructor of Cylinder Class */
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    // Getter and Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @brief Calculate the surface area of Cylinder
     * @return surafce area of Cylinder
     */
    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    /**
     * @brief string representation of the Cylinder object.
     * @return string with Cylinder name.
     */ 
    @Override
    public String toString() {
        return super.toString() + ", radius: " + radius + ", height: " + height + ", area: " + area();
    }
}
