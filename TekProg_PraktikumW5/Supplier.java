// import store.AbstractStoreEmployee;

public class Supplier extends AbstractStoreEmployee {
    
    private int productSupplied;
    private int lateDelivery;

    /**
     * This is an argument constructor which initializes all the instance
     * variables
     *
     * @param numberOfHoursWorked - The parameter Number of hours worked is
     * passed.
     * @param hourlyRate - The parameter Hourly rate of the Employee in dollars
     * is passed.
     * @param storeDetails - The parameter Details of the Store is passed.
     * @param basePay - The parameter Base pay of the Employee in dollars is
     * passed.
     * @param employeeName - The parameter Full name of the Employee is passed.
     */
    public Supplier(double numberOfHoursWorked, double hourlyRate, String storeDetails,
    double basePay, String employeeName, int productSupplied, int lateDelivery) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, employeeName);
        this.productSupplied = productSupplied;
        this.lateDelivery = lateDelivery;
    }

    /**
     * Returns calculated Pay of Supplier. The calculated pay is based
     * on basePay, productSupplied, and perfect order that can be calculated
     * based on productSupplied and lateDelivery.
     *
     * @return - This method returns Payment of the Supplier.
     */
    @Override
    public double calculatePay() {
        return getBasePay() * Math.log10(productSupplied * calculatePerfectionRate() + 100)/2;
    }

    /**
     * Checks if the employee should be awarded with a promotion.
     *
     * @return - This method returns boolean the eligibility status for
     * promotion for an employee.
     */
    @Override
    public boolean checkPromotionEligibility() {
        if ((productSupplied * calculatePerfectionRate()) > 200 && calculatePay() > 30000.0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns total product supplied by Supplier
     * 
     * @return This method returns total product supplied.
     */
    public int getProductSupplied() {
        return productSupplied;
    }

    /**
     * Sets the total product supplied
     * 
     * @param productSupplied - The parameter product supplied is passed.
     */
    public void setProductSupplied(int productSupplied) {
        this.productSupplied = productSupplied;
    }
    
    /**
     * Returns total product supplied by Supplier
     * 
     * @return This method returns total product supplied.
     */
    public int getLateDelivery() {
        return lateDelivery;
    }

    /**
     * Sets the total late delivery
     * 
     * @param lateDelivery - The parameter late delivery is passed.
     */
    public void setLateDelivery(int lateDelivery) {
        this.lateDelivery = lateDelivery;
    }
    
    /**
    * Calculates the perfection rate of the supplier's deliveries.
    * The perfection rate is the ratio of on-time deliveries to the total number of products supplied.
    *
    * @return The perfection rate as a float value between 0 and 1, 
    *         where 1 represents perfect on-time delivery.
    */
    public double calculatePerfectionRate() {
        return (double) (productSupplied - lateDelivery) / productSupplied;
    }

    /**
    * Calculates the overtime pay for the current employee based 
    * on their logged overtime hours and perfection rate
    *
    * @return The calculated overtime pay amount for the current employee.
    */
    @Override
    public double calculateOvertime() {
        return getNumberOfHoursWorked() * (1 + calculatePerfectionRate()) - 140;
    }

    /**
     * Returns the String representation of Supplier. Append Super Class toString()
     * along with the total Product Supplied and Perfection Rate.
     *
     * @return - This method returns a String representation of Supplier and
     * Employee details.
     */
    @Override
    public String toString() {
        return super.toString() + "Product supplied: " + getProductSupplied() +
                                  "\nPerfection rate: " + calculatePerfectionRate() + "%";
    }
     
    /**
     * Rise the supplier salary
     */
    @Override
    public void riseBasePay() {
        setBasePay(getBasePay() * (1 + calculatePerfectionRate()/10));
    }

}
