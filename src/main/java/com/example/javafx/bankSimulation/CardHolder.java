package com.example.javafx.bankSimulation;

import java.util.Scanner;

public class CardHolder implements Loader, Credit {
	public String name;
	public int ZARIK = 5000;
	public ATM atm;
	Scanner scan = new Scanner(System.in);
	private String id;
	private BankBills bankBills;
	private int password;

	public CardHolder(String name, String id, BankBills bankBills, int password) {
		this.name = name;
		this.id = id;
		this.bankBills = bankBills;
		this.password = password;
	}


	@Override
	public void getCredit() {

	}

	@Override
	public void requestToGetCredit() {

	}
	//    public void useATM() {
//        atm.checkUserPinAndGiveMoney();
//    }

	public boolean putCredit(int sum) {
		if (sum > 0) {
			return true;
		}
		return false;
	}


	public String getId() {
		return id;
	}

	public int getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "CardHolder{" +
				"name='" + name + '\'' +
				", id=" + id +
				", bankBills=" + bankBills +
				", password=" + password +
				'}';
	}
}
