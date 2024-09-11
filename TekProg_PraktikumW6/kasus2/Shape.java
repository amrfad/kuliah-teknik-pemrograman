package kasus2;

public abstract class Shape {
    private String shapeName;

    /* A Constructor for Shape Abstract Class */
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    /**
     * @brief return shape name of shape object
     * @return shape name
     */
    public String getShapeName() {
        return shapeName;
    }

    /**
     * @brief abstract method for calculating area of shape object.
     * @return area of the shape
     */
    public abstract double area();

    /**
     * @brief string representation of the shape object.
     * @return string with shape name.
     */
    @Override
    public String toString() {
        return "Shape name: " + shapeName;
    }
}