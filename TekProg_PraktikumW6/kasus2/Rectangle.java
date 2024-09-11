package kasus2;

public class Rectangle extends Shape {
    private double height;
    private double width;

    /* A Constructor for Rectangle Class */
    public Rectangle(double height, double width) {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    // Getter and Setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @brief Method for calculating the area of the rectangle
     * @return double value of area of rectangle object.
     */
    @Override
    public double area() {
        return height * width;
    }

    /**
     * @brief string representation of the rectangle object.
     * @return string with rectangle name.
     */
    @Override
    public String toString() {
        return super.toString() + ", height: " + height + ", width: " + width + ", area: " + area();
    }

}
