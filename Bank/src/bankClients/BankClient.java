package bankClients;

import java.util.ArrayList;

import bank.Bank;
import bank.Credit;
import bank.Deposit;

public class BankClient extends Person implements IClient {
	

	ArrayList<Deposit> deposits;
	ArrayList<Credit> credits;
	public enum DepositsName {SHORT_DEPOSIT, LONG_DEPOSIT};
	public enum CreditsName {HOME_CREDIT, CONSUMER_CREDIT};
	
	public BankClient(String name, String adress, double money, double salary) {
		super(name, adress, money, salary);
		this.deposits = new ArrayList<>();
		this.credits = new ArrayList<>();
	}
	
	public void makeDeposit(DepositsName name, double dep, Bank inBank) {
		this.deposits.add(inBank.createDeposit(name, dep));
	}
	
	public void takeCredit(CreditsName name, double size) {
		//TODO create credit in bank
	}

	@Override
	public void makeDeposit(double sizeOfDeposit, int periodOfDeposit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean askForCredit(double sizeOfCredit,int period, CreditsName typeOfCredit) {
		double interest;
		if (typeOfCredit.equals(BankClient.CreditsName.CONSUMER_CREDIT)) {
			interest = 10;
		} else {
			interest = 6;
		}
		//TODO calculate chance for credit
		return false;
	}

	@Override
	public void payInterestByMonth() {
		// TODO Auto-generated method stub
		
	}
}
