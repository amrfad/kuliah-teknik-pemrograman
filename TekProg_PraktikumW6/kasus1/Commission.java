package kasus1;
public class Commission extends Hourly {
    private double totalSales;
    private double comissionRate;

    // Constructor
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.comissionRate = comissionRate;
    }

    // Getter and Setter
    public double getTotalSales() {
        return totalSales;
    }
    public double getComissionRate() {
        return comissionRate;
    }
    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }
    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    // Methods
    // ----------------------------------------------------------
    // Add latest totalSales with new totalSales.
    // ----------------------------------------------------------
    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }
    // ----------------------------------------------------------
    // Calculate pay for this employee.
    // ----------------------------------------------------------
    public double pay(){
        double payment = super.pay() + (comissionRate * totalSales);
        totalSales = 0;
        return payment;
    }
    
    // ----------------------------------------------------------
    // Return information about this employee as a string.
    // ----------------------------------------------------------
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        result += "\nComission Rate: " + comissionRate;
        return result;
    }
}