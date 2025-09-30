package com.bank;

import com.bank.model.BankAccount;
import com.bank.service.BankService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankServiceTest {

    private BankService bankService;

    @BeforeEach
    void setUp() {
        bankService = new BankService();
    }

    @Test
    void testCreateAccount() {
        BankAccount account = bankService.createAccount("001", "Dhivya", 1000);
        assertEquals("Dhivya", account.getAccountHolder());
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testDeposit() {
        BankAccount account = bankService.createAccount("002", "John", 500);
        account.deposit(200);
        assertEquals(700, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = bankService.createAccount("003", "Alice", 1000);
        account.withdraw(300);
        assertEquals(700, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = bankService.createAccount("004", "Bob", 100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200));
        assertEquals("Insufficient funds.", exception.getMessage());
    }

    @Test
    void testAddInterest() {
        BankAccount account = bankService.createAccount("005", "Carol", 1000);
        account.addInterest(10); // 10% interest
        assertEquals(1100, account.getBalance());
    }
}