package com.example.javafx.bankSimulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.w3c.dom.Text;

import java.awt.*;
import java.io.IOException;

public class User implements Credit, Loader {
	public String name;
	public int salary;
	public String address;
	public Bank bank;
     @FXML
     public Label textCredit;
	public User(String name, int salary, String address, Bank bank) {
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.bank = bank;
	}


	@Override
	public void requestToGetCredit() throws InterruptedException, IOException {
		System.out.println("Здравствуйте," + this.name + "вы хотите оставить заявку на получение кредита");
		System.out.println("Для начала мы должны проверить являетесь ли вы клиентом банка");
		System.out.println("Секунду... идет проверка...");

		if (bank.checkUserRegister(this)) {
			System.out.println("Вы есть в нашей базе.");
			textCredit.setText("ваша заявка на кредит одобрена");
			bank.requestCredit(this);
		}

	}

	@Override
	public void getCredit() {

	}


	public String getCardInBank() throws IOException, InterruptedException {
		System.out.println("Доброе время суток, " + this.name + ",\nВы пришли в банк " + bank.nameCompany + " на получение банковской карты.\nДля начала вам нужно пройти регистрацию в банке.");

		boolean userExists = bank.checkUserRegister(this);
		if (userExists) {

			return ("Вы уже есть в системе, вы являетесь держателем карты");
		}
return "Мы закончили, поздравляю, теперь вы держатель карты";
	}


}

