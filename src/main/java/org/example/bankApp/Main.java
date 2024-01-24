package org.example.bankApp;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1234567890", "John Doe", 1000.0);
        BankAccount account2 = new BankAccount("0987654321", "Jane Doe", 2000.0);

        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.transfer(100.0, account2);

        System.out.println(account1.getAccountName() + " has a balance of " + account1.getBalance());




        System.out.println(account2.getAccountName() + " has a balance of " + account2.getBalance());
    }
}
