package stock;

public class Stock {
	private double price;
	private String name;
	private static int serialNumber;
	
	public Stock(String name, double price) {
		this.setName(name);
		this.setPrice(price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			System.out.println("The price must be zerro or bigger (default price is 0!).");
			this.price = 0;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			System.out.println("Do not typed name, will create with serial number - " + serialNumber);
			this.name = Integer.toString(serialNumber++);
		}
	}
	
	
}
