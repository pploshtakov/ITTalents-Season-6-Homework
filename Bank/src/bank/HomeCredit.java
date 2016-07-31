package bank;

public class HomeCredit extends Credit {

	public HomeCredit(String name, double YIP, int period, double availability, Bank inBank) {
		super("HOME_CREDIT", 6, period, availability, inBank);
	}
	
}
