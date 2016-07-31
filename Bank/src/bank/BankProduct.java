package bank;

public abstract class BankProduct {
	private String name;
	private double YIP;
	private int period;
	private double availability;
	private Bank inBank;
	public BankProduct(String name, double YIP, int period, double availability, Bank inBank) {
		//TODO validation input data
		this.name = name;
		YIP = YIP;
		this.period = period;
		this.availability = availability;
		this.inBank = inBank;
	}
	
	public double getAvailability() {
		return availability;
	}
	
	public double getYIP() {
		return YIP;
	}
	
	public void setAvailability(double availability) {
		this.availability = availability;
	}
	
	
	
}
