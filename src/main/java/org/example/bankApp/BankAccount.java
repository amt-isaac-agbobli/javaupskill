package org.example.bankApp;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public BankAccount() {
        this.accountNumber = "";
        this.accountName = "";
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if (amount > this.balance){
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
            System.out.println("Please take your cash");
        }
    }

    public void transfer(double amount, BankAccount account){
        if (amount > this.balance){
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
            account.balance += amount;
            System.out.println("Transfer successful");
        }
    }

    public void printDetails(){
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Name: " + this.accountName);
        System.out.println("Balance: " + this.balance);
    }
}
