package org.example.bankApp;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234567890", "John Doe", 0.0);
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);
        bankAccount.withdraw(600);
        bankAccount.withdraw(100);
        bankAccount.deposit(200);
        bankAccount.withdraw(200);
        bankAccount.withdraw(200);
        bankAccount.withdraw(200);
        bankAccount.withdraw(200);

        bankAccount.printAccountDetails();

        bankAccount.printTransactions();

        }

}
