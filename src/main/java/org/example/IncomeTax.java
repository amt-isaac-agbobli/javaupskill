package org.example;

/**
 * The IncomeTax class provides methods to calculate tax based on different income brackets.
 */
public class IncomeTax {

    /**
     * Calculates the tax for income below GHc2000.
     * @param taxableIncome A double representing the taxable income.
     * @return A double representing the tax.
     */
    public double taxableIncomeBelowGHc2000(double taxableIncome){
        return 0.05 * taxableIncome;
    }

    /**
     * Calculates the tax for income between GHc2000 and GHc5000.
     * @param taxableIncome A double representing the taxable income.
     * @return A double representing the tax.
     */
    public double taxableIncomeBetweenGHc2000AndGHc5000(double taxableIncome){
        return this.taxableIncomeBelowGHc2000(taxableIncome) +
                0.1 * (taxableIncome - 2000);
    }

    /**
     * Calculates the tax for income above GHc5000.
     * @param taxableIncome A double representing the taxable income.
     * @return A double representing the tax.
     */
    public double taxableIncomeAboveGHc5000(double taxableIncome){
        return this.taxableIncomeBetweenGHc2000AndGHc5000(taxableIncome) +
                0.175 * (taxableIncome - 5000);
    }
}