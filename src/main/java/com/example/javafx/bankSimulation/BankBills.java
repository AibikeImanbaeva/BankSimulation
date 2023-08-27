package com.example.javafx.bankSimulation;

public class BankBills {
    private int balance;
    private int accountID;

    public BankBills(int balance, int accountID) {
        this.balance = balance;
        this.accountID = accountID;
    }

    public int withdrawBills(int summa) {
        balance -= summa;
        return balance;
    }

    public int getBalance() {
        return  balance;
    }
}
