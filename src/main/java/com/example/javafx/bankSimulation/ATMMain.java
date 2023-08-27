package com.example.javafx.bankSimulation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.io.*;


public class ATMMain {
	@FXML
	private Text allCardholders;
	@FXML
	private Label welcomeText;
	public User currentUser;
	private boolean isDataVisible = false;

		BankBills listOfBills = loadBalanceFromFile();
		Bank optima = new Bank("Optima", listOfBills, 50000);
	public ATMMain() throws IOException {
	}

	@FXML
	protected void getCard() throws IOException, InterruptedException {

		this.currentUser =new User("sergey", 888, "jal", optima);
		String result =  currentUser.getCardInBank();
//		this.currentUser = new User("aibike", 555,"micrashi", optima);
//		String result = currentUser.getCardInBank();
		welcomeText.setText(result);
	}

	private static BankBills loadBalanceFromFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Asus\\IdeaProjects\\javafx\\src\\main\\java\\com\\example\\javafx\\bankSimulation\\balance.txt"));
		int balance = Integer.parseInt(reader.readLine());
		return new BankBills(balance, 0001);
	}

	private static void saveBalanceToFile(String balance) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Asus\\IdeaProjects\\javafx\\src\\main\\java\\com\\example\\javafx\\bankSimulation\\balance.txt"));
		writer.write(balance);
		writer.close();
	}

	@FXML
	public void showAllUsers(ActionEvent actionEvent) throws IOException {
		if (!isDataVisible) {
			String res = optima.showCardholders();
			allCardholders.setText(res);
			isDataVisible = true;
		} else {
			allCardholders.setText(""); // Скрываем данные
			isDataVisible = false;
		}
	}

//	public void getCredit() throws IOException, InterruptedException {
//		currentUser.requestToGetCredit();
//	}
}