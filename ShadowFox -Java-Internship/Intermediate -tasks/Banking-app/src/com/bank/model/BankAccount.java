package com.bank.model;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<String> transactions;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add("Account created with balance: " + initialBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive.");
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw must be positive.");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds.");
        balance -= amount;
        transactions.add("Withdrew: " + amount);
    }

    public void addInterest(double rate) {
        if (rate < 0) throw new IllegalArgumentException("Interest rate cannot be negative.");
        double interest = balance * rate / 100;
        balance += interest;
        transactions.add("Interest added: " + interest);
    }
}