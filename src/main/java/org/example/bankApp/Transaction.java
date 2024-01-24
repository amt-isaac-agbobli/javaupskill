package org.example.bankApp;

import java.util.ArrayList;
import java.util.Date;

public class Transaction {
    private Date date;
    private String description;
    private double amount;

    public Transaction(Date date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public Transaction() {
        this.date = new Date();
        this.description = "";
        this.amount = 0.0;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}