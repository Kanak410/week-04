package com.junit.advanced.testingBankingTransactions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000); // Initial balance: 1000
    }

    @Test
    void testInitialBalance() {
        assertEquals(1000, account.getBalance(), "Initial balance should be 1000");
    }

    @Test
    void testDepositValidAmount() {
        account.deposit(500);
        assertEquals(1500, account.getBalance(), "Balance should be 1500 after depositing 500");
    }

    @Test
    void testDepositNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100);
        });
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
    void testWithdrawValidAmount() {
        account.withdraw(200);
        assertEquals(800, account.getBalance(), "Balance should be 800 after withdrawing 200");
    }

    @Test
    void testWithdrawMoreThanBalance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50);
        });
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }

    @Test
    void testCreateAccountWithNegativeBalance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount(-500);
        });
        assertEquals("Initial balance cannot be negative", exception.getMessage());
    }
}