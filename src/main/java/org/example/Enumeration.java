package org.example;

/**
 * Enumeration class extends the IncomeTax class.
 * It represents an employee's income details and provides methods to calculate tax and deductions.
 */
public class Enumeration extends IncomeTax {
    private double basicSalary;
    private double bonus;
    private double taxRelief;

    /**
     * Returns the basic salary of the employee.
     * @return A double representing the basic salary.
     */
    public double getBasicSalary() {
        return basicSalary;
    }

    /**
     * Sets the basic salary of the employee.
     * @param basicSalary A double representing the basic salary.
     */
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    /**
     * Returns the bonus of the employee.
     * @return A double representing the bonus.
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * Sets the bonus of the employee.
     * @param bonus A double representing the bonus.
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * Returns the tax relief of the employee.
     * @return A double representing the tax relief.
     */
    public double getTaxRelief() {
        return taxRelief;
    }

    /**
     * Sets the tax relief of the employee.
     * @param taxRelief A double representing the tax relief.
     */
    public void setTaxRelief(double taxRelief) {
        this.taxRelief = taxRelief;
    }

    /**
     * Constructor for the Enumeration class.
     * @param basicSalary A double representing the basic salary.
     * @param bonus A double representing the bonus.
     * @param taxRelief A double representing the tax relief.
     */
    public Enumeration(double basicSalary, double bonus, double taxRelief) {
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.taxRelief = taxRelief;
    }

    /**
     * Calculates the SSNIT contribution of the employee.
     * @return A double representing the SSNIT contribution.
     */
    public double ssnitContribution(){
        return 0.035 * basicSalary;
    }

    /**
     * Calculates the taxable income of the employee.
     * @return A double representing the taxable income.
     */
    public double taxableIncome(){
        return this.basicSalary + this.bonus - (this.taxRelief + this.ssnitContribution());
    }

    /**
     * Calculates the tax payable by the employee.
     * @return A double representing the tax payable.
     */
    public double taxPayable(){
        if (this.taxableIncome() <= 2000){
            return super.taxableIncomeBelowGHc2000(this.taxableIncome());
        } else if (this.taxableIncome() > 2000 && this.taxableIncome() <= 5000){
            return super.taxableIncomeBetweenGHc2000AndGHc5000(this.taxableIncome());
        } else {
            return super.taxableIncomeAboveGHc5000(this.taxableIncome());
        }
    }

    /**
     * Calculates the total deductions from the employee's income.
     * @return A double representing the total deductions.
     */
    public double totalDeductions(){
        return this.taxPayable() + this.ssnitContribution();
    }

    /**
     * Calculates the net pay of the employee after deductions.
     * @return A double representing the net pay.
     */
    public double netPay(){
        return this.basicSalary + this.bonus - this.totalDeductions();
    }
}