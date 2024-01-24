package org.example.bankApp;

import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;
    private ArrayList<Transaction> transactions;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public BankAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount){
        this.balance += amount;
        this.transactions.add(new Transaction(new Date(), "Deposit", amount));
    }

    public void withdraw(double amount){
        if (amount > this.balance){
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
            this.transactions.add(new Transaction(new Date(), "Withdrawal", amount));
            System.out.println("Please take your cash");
        }
    }

    public void transfer(double amount, BankAccount account){
        if (amount > this.balance){
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
            account.balance += amount;
            this.transactions.add(new Transaction(new Date(), "Transfer to " + account.getAccountNumber(), amount));
            account.transactions.add(new Transaction(new Date(), "Transfer from " + this.accountNumber, amount));
            System.out.println("Transfer successful");
        }
    }

    public void printTransactions(){
        this.transactions.forEach(transaction -> {
            System.out.println(transaction.getDate() + " " + transaction.getDescription() + " " + transaction.getAmount());
        });
    }

    public void printAccountDetails(){
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Name: " + this.accountName);
        System.out.println("Balance: " + this.balance);
    }


}