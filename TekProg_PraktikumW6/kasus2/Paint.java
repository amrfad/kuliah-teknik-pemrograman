package kasus2;

public class Paint {
    public double coverage;

    /* A Constructor of Paint Class */
    public Paint(double coverage) {
        this.coverage = coverage;
    }

    // Getter and Setter
    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    /**
     * @brief computing amount of paint needed to paint a shape.
     * @param shape
     * @return double value of amount of paint needed to paint a shape.
     */
    public double getAmount(Shape shape) {
        System.out.println("Computing amount for " + shape);
        return shape.area() / coverage;
    }
}
