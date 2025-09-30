package com.bank.service;

import com.bank.model.BankAccount;

import java.util.HashMap;
import java.util.Map;

public class BankService {
    private Map<String, BankAccount> accounts = new HashMap<>();

    public BankAccount createAccount(String accountNumber, String accountHolder, double initialBalance) {
        if (accounts.containsKey(accountNumber)) throw new IllegalArgumentException("Account already exists.");
        BankAccount account = new BankAccount(accountNumber, accountHolder, initialBalance);
        accounts.put(accountNumber, account);
        return account;
    }

    public BankAccount getAccount(String accountNumber) {
        if (!accounts.containsKey(accountNumber)) throw new IllegalArgumentException("Account not found.");
        return accounts.get(accountNumber);
    }
}