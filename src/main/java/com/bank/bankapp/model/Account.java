package com.bank.bankapp.model;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.balance = initialDeposit;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        double total = amount + 5.0;
        if (balance >= total) {
            balance -= total;
            return true;
        }
        return false;
    }
}
