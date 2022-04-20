package com.company.newproject;

public class Account {

    // Define fields
    private int accountId;
    private String accountName;
    private int balance = 0;

    // define constructor

    public Account(int accountId, String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }

    // define getters and setters
    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    // credit method
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // debit method
    public int debit(int amount) {
        balance -= amount;
        return balance;
    }

    // transfer method
    public int transferMoney(Account transferTo, int amount) {
        transferTo.credit(amount); // credit the account being transferred to.
        debit(amount); // debit the account the money was in before.

        return amount;
    }
}
