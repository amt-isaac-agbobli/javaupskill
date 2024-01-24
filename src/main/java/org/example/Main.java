package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            double basicSalary;
            double bonus;
            double taxRelief;
            System.out.println("Enter basic salary: ");
            basicSalary = scanner.nextDouble();
            System.out.println("Enter bonus: ");
            bonus = scanner.nextDouble();
            System.out.println("Enter tax relief: ");
            taxRelief = scanner.nextDouble();

            NumberFormat currency = NumberFormat.getCurrencyInstance();

            Enumeration enumeration = new Enumeration(basicSalary, bonus, taxRelief);
            System.out.println("Basic Salary: " + currency.format(enumeration.getBasicSalary()));
            System.out.println("Bonus: " + currency.format(enumeration.getBonus()));
            System.out.println("Tax Relief: " + currency.format(enumeration.getTaxRelief()));
            System.out.println("SSNIT Contribution: " + currency.format(enumeration.ssnitContribution()));
            System.out.println("Taxable Income: " + currency.format(enumeration.taxableIncome()));
            System.out.println("Tax Payable: " + currency.format(enumeration.taxPayable()));
            System.out.println("Total Deductions: " + currency.format(enumeration.totalDeductions()));
            System.out.println("Net Pay: " + currency.format(enumeration.netPay()));

        } catch (Exception e) {
            System.out.println("Invalid input");
        }



    }
}