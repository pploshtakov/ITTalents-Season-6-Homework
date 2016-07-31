package main;

import java.util.Random;

import bank.Bank;
import bankClients.BankClient;
import bankClients.BankClient.CreditsName;
import bankClients.BankClient.DepositsName;

public class Demo {
	static Random r = new Random();
	public static String[] names = {"Pesho", "Ivan", "Simo", "Eli", "Alex", "Rali", "Iva"};
	public static String[] adresses = {"Strelbishte", "Durvenica", "Mladost", "Lulin", "Ivan Vazov"};
	
	public static void main(String[] args) {
		
//		Да се реализира демо програма, която има следните характеристики:
//		1. Да се създаде abstract class за банков продукт с основни характеристики описани по-
//		горе.
	
//		2. Да се създадат по отделно класове за депозит и кредит, които наследяват банковия
//		продукт.
	
//		3. Да се създадат 2 депозита – Short Deposit с период от 3 месеца и лихва 3% и Long
//		Deposit с период от 12 месеца и лихва 5%.
		
//		4. Да се създадат 2 кредита – Home Credit с лихва 6% и Consumer Credit с лихва 10%. Като
//		периода по кредита се определя от клиента от банката.
		
//		5. Да се създаде 1 банка в България
	Bank BNB = new Bank("BNB", "Sofia, Dondukov 1");
//		6. Да се създадат 10 клиенти с различни пари в брой и месечна заплата. Първоначално
//		клиентите нямат депозити и кредити. Тези клиенти да се сложат в масив $clients.
	
	BankClient[] clients = new BankClient[10];
	for(int i = 0; i < clients.length; i++) {
		String name = names[r.nextInt(names.length)];
		String adress = adresses[r.nextInt(adresses.length)];
		double money = (r.nextInt(50) * 10) + 500;
		double salary = (r.nextInt(50) * 10) + 1000;
		clients[i] = new BankClient(name, adress, money, salary);
	}
//		7. Първоначално всичките 10 клиента да си сложат от 80% до 100% (на базата на
//		случайно число) парите на депозит в банката.
	for(int i = 0; i < clients.length; i++) {
		int chance = r.nextInt(4);
		switch (chance) {
		case 0:
			clients[i].makeDeposit(choiceDeposit(), (clients[i].getMoney() * 0.8), BNB);
			break;
		case 1:
			clients[i].makeDeposit(choiceDeposit(), (clients[i].getMoney() * 0.85), BNB);
			break;
		case 2:
			clients[i].makeDeposit(choiceDeposit(), clients[i].getMoney() * 0.9, BNB);
			break;
		case 3:
			clients[i].makeDeposit(choiceDeposit(), clients[i].getMoney() * 0.95, BNB);
			break;
		case 4:
			clients[i].makeDeposit(choiceDeposit(), clients[i].getMoney(), BNB);
			break;
		default:
			break;
		}
	}
//		8. След това да се изпише паричната наличност на банката както и нейния паричен
//		резерв.
	BNB.printBankInfo();
//		9. Всеки един от тези клиенти да вземе на случаен принцип кредити от банката.
	for(int i = 0; i < clients.length; i++) {
		double size = howMuchMoney();
		CreditsName typeOfCredit = choiceCredit();
		int period = r.nextInt(50) + 12;
		if (clients[i].askForCredit(size, period, typeOfCredit)) {
			clients[i].takeCredit(choiceCredit(), size);
		}
	}
//		10. Да се изпишат информация (всички свойства) за всички клиенти, всички депозити,
//		всички отпуснати кредити и информация за състоянието на банката.
	
	}
	private static double howMuchMoney() {
		int chance = r.nextInt(4);
		switch (chance) {
		case 0:
			return 500;
		case 1:
			return 1000;
		case 2:
			return 1500;
		case 3:
			return 2000;
		case 4:
			return 2500;
		}
		return 0;
	}
	private static CreditsName choiceCredit() {
		if (r.nextBoolean()) {
			return BankClient.CreditsName.CONSUMER_CREDIT;
		}
		return BankClient.CreditsName.HOME_CREDIT;
	}
	
	
	static DepositsName choiceDeposit() {
		if (r.nextBoolean()) {
			return BankClient.DepositsName.LONG_DEPOSIT;
		}
		return BankClient.DepositsName.SHORT_DEPOSIT;
	}
}

	

