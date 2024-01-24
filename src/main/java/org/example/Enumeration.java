package org.example;

public class Enumeration extends IncomeTax {
    private double basicSalary;
    private double bonus;
    private double taxRelief;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTaxRelief() {
        return taxRelief;
    }

    public void setTaxRelief(double taxRelief) {
        this.taxRelief = taxRelief;
    }

    public Enumeration(double basicSalary, double bonus, double taxRelief) {
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.taxRelief = taxRelief;
    }

    public double ssnitContribution(){
        return 0.035 * basicSalary;
    }

    public double taxableIncome(){
        return this.basicSalary + this.bonus - (this.taxRelief + this.ssnitContribution());
    }

    public double taxPayable(){
        if (this.taxableIncome() <= 2000){
            return super.taxableIncomeBelowGHc2000(this.taxableIncome());
        } else if (this.taxableIncome() > 2000 && this.taxableIncome() <= 5000){
            return super.taxableIncomeBetweenGHc2000AndGHc5000(this.taxableIncome());
        } else {
            return super.taxableIncomeAboveGHc5000(this.taxableIncome());
        }
    }

    public double totalDeductions(){
        return this.taxPayable() + this.ssnitContribution();
    }

    public double netPay(){
        return this.basicSalary + this.bonus - this.totalDeductions();
    }


}
