package com.bank.main;

import com.bank.model.BankAccount;
import com.bank.service.BankService;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        BankAccount account = bankService.createAccount("123", "Dhivya", 10000);

        account.deposit(1500);
        account.withdraw(200);
        account.addInterest(5);

        System.out.println("Balance: " + account.getBalance());
        System.out.println("Transactions: " + account.getTransactions());
    }
}