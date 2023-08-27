package bankSimulation;

import java.io.IOException;

public class User implements Credit, Loader {
	public String name;
	public int salary;
	public String address;
	public Bank bank;

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
			bank.requestCredit(this);
		}

	}

	@Override
	public void getCredit() {

	}


	public void getCardInBank() throws IOException, InterruptedException {
		System.out.println("Доброе время суток, " + this.name + ",\nВы пришли в банк " + bank.nameCompany + " на получение банковской карты.\nДля начала вам нужно пройти регистрацию в банке.");

		boolean userExists = bank.checkUserRegister(this);
		if (userExists) {
			System.out.println("Вы уже есть в системе");
		}

	}
}

