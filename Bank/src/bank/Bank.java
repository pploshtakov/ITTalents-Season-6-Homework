package bank;

import java.util.ArrayList;
import java.util.Iterator;

import bankClients.BankClient;
import bankClients.BankClient.CreditsName;
import bankClients.BankClient.DepositsName;

public class Bank {
	private String name;
	private String adress;
	private ArrayList<BankProduct> bankProducts;
	private double availability;
	private double bankReserv;
	
	
	
	public Bank(String name, String adress) {
		//TODO validate name and adress
		this.name = name;
		this.adress = adress;
		bankProducts = new ArrayList<>();
	}

	public void printBankInfo() {
		System.out.println("------Bank " + this.name + "------");
		System.out.println("Availability: " + this.availability);
		System.out.println("Bank reserv: " + this.bankReserv);
	}
	
//	Банката може да извършва следните операции:
//		• Приемане на депозит от определена сума. В такъв случай паричната наличност на
//		банката се увеличава с сумата на депозита и резерва се увеличава с 90% от сумата на
//		депозита
	public Deposit createDeposit(DepositsName n, double sum) {
		Deposit dep;
		if (n.equals(BankClient.DepositsName.SHORT_DEPOSIT)) {
			dep = new ShortDeposit(sum, this);
		} else {
			dep = new LongDeposit(sum, this);
		}
		this.availability += sum;
		this.bankReserv += (sum * 0.9);
		this.bankProducts.add(dep);
		return dep;
	}
//		• Изплащане на лихвите по всички депозити в банката. Банката добавя към всички
//		депозити сума равна на лихвата по депозита умножена по сумата на депозита. За
//		целта ви трябва метод, който да изчислява лихвата по депозита.
	public void payInterestsForMonth() {
		for(Iterator<BankProduct> it = bankProducts.iterator(); it.hasNext(); ) {
			BankProduct pr = it.next();
			if (pr instanceof Deposit) {
				pr.setAvailability(pr.getAvailability() + ((Deposit) pr).getRepaidByMonth());
				this.availability -= ((Deposit) pr).getRepaidByMonth();
			}
		}
	}
//		• Отпускане на кредит за определена сума и за определен период в месеци. Лихвата по
//		кредита е фиксирана. Банката трябва да провери дали общата вноска по кредитите на
//		клиента не надхвърля 50% от месечната му заплата. Ако не надхвърля, банката
//		отпуска кредит на клиента, ако надхвърля кредита се отпуска. Ако исканата сума за
//		кредит надхвърля банковия резерв, банката не може да отпусне кредита. За
//		целта ви трябва метод, който да изчислява вноската по депозита.
	public void createNewCredit(CreditsName cr, double size) {
		//TODO check paymant ability by client
	}
//	Банката може да отпуска кредити и да приема депозити на клиенти. Съответно да открива
//	депозитни сметка или кредитни сметки.
//	
}
