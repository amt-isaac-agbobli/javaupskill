package org.example;

public class IncomeTax {

    public double taxableIncomeBelowGHc2000(double taxableIncome){
        return 0.05 * taxableIncome;
    }

    public double taxableIncomeBetweenGHc2000AndGHc5000(double taxableIncome){
        return this.taxableIncomeBelowGHc2000(taxableIncome) +
                0.1 * (taxableIncome - 2000);
    }

    public double taxableIncomeAboveGHc5000(double taxableIncome){
        return this.taxableIncomeBetweenGHc2000AndGHc5000(taxableIncome) +
                0.175 * (taxableIncome - 5000);
    }
}
