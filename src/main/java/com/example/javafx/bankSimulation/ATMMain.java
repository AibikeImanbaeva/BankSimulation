package bankSimulation;

import java.io.*;


public class ATMMain {
	public static void main(String[] args) throws IOException, InterruptedException {
		BankBills listOfBills = loadBalanceFromFile();
		Bank optima = new Bank("Optima", listOfBills, 50000);
		User ruslan = new User("Ruslan", 2000, "джал", optima);
//		ruslan.getCardInBank();
//		ruslan.requestToGetCredit();
		User aibike = new User("aibike", 5222, "4micro", optima);
		User sergey = new User("sergey", 888, "jal", optima);
		sergey.getCardInBank();
		User tanos = new User("tanos", 777, "5micro", optima);
//		aibike.getCardInBank();

	}

	private static BankBills loadBalanceFromFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("src/bankSimulation/balance.txt"));
		int balance = Integer.parseInt(reader.readLine());
		return new BankBills(balance, 0001);
	}

	private static void saveBalanceToFile(String balance) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("src/bankSimulation/balance.txt"));
		writer.write(balance);
		writer.close();
	}
}