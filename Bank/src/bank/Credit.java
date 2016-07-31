package bank;

public abstract class Credit extends BankProduct {
	

	private double paymentByMonth;
	
	public Credit(String name, double YIP, int period, double availability, Bank inBank) {
		super(name, YIP, period, availability, inBank);
		this.paymentByMonth = this.calculatePaymentByMonth();
	}
	
	private double calculatePaymentByMonth() {
		return (this.getAvailability() * this.getYIP()) / 12;
	}
	
	@Override
	public void setAvailability(double availability) {
		this.setAvailability(availability);
	}
	
}
