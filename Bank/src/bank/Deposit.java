package bank;

public abstract class Deposit extends BankProduct {
	
	private double repaidByMonth;
	
	public Deposit(String name, double YIP, int period, double availability, Bank inBank) {
		super(name, YIP, period, availability, inBank);
		this.repaidByMonth = this.calculateInterestForMonth();
	}

	public double calculateInterestForMonth() {
		return (this.getAvailability() * this.getYIP()) / 12;
	}
	
	public double getRepaidByMonth() {
		return repaidByMonth;
	}
	
	@Override
	public void setAvailability(double availability) {
		if (availability >= 0) {
			this.setAvailability(availability);
		} else {
			System.out.println("Availability can not be negative!");
		}
	}
}
