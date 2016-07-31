package bank;

public class LongDeposit extends Deposit {

	public LongDeposit(double availability, Bank inBank) {
		super("LONG_DEPOSIT", 5, 12, availability, inBank);
	}

}
