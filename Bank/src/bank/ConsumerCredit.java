package bank;

public class ConsumerCredit extends Credit {

	public ConsumerCredit(String name, double YIP, int period, double availability, Bank inBank) {
		super("CONSUMER_CREDIT", 10, period, availability,inBank);
	}
	

}
