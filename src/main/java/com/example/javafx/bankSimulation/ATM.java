package com.example.javafx.bankSimulation;

import java.util.List;
import java.util.Scanner;

public class ATM {
    public CardHolder cardHolder;
    public BankBills bankBills;
    public int atmBalance;

    public ATM(CardHolder cardHolder, BankBills bankBills, int balance) {

        this.cardHolder = cardHolder;
        this.bankBills = bankBills;
        this.atmBalance = balance;
    }

    public void checkUserPinAndGiveMoney() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Password");
        if (scan.nextInt() == cardHolder.getPassword()) {
            System.out.println("Summa vydachi");
            int summaVydachi = scan.nextInt();
            bankBills.withdrawBills(summaVydachi);
            System.out.println(bankBills.getBalance());
        } else {
            System.out.println("Ne pravilnyi password");
        }
    }
}
