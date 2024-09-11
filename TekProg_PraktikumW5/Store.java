/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package store;

import java.util.ArrayList;

/**
 * This is the Store interface file.
 *
 * @author Goteti Santosh Ravi Teja
 */
public interface Store {

    /**
     * It is a constant field value.
     */
    static final double COMMISSION_RATE = 0.10;
    

    /**
     * It is a constant field value.
     */
    static final double TAX = 0.14;

    /**
     *
     * @return- This method returns the calculateCommission.
     */
    public double calculateCommission();

    /**
     *
     * @param storeSales - The parameter storeSales is passed.
     * @return - This method returns the remaining store revenue.
     */
    public double calculateRemainingStoreRevenue(double storeSales);

    /**
     * 
     * @param empList
     * @return
     */
    public static double calculatePayroll(ArrayList<AbstractStoreEmployee> empList) {
        // generate calculation for every pay of object
        double sum = 0;
        for (AbstractStoreEmployee employee : empList) {
            sum += employee.calculatePay();
        }
        return sum;
    } 
}
