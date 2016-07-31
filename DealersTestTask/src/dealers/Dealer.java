package dealers;

import stock.Stock;

public abstract class Dealer {


	private String adress;
	private String name;
	private double capital;
	
	public Dealer(String adress, String name, double capital) {
		this.setAdress(adress);
		this.setCapital(capital);
		this.setName(name);
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		if (adress != null) {
			this.adress = adress;
		} else {
			this.adress = "The adress is not typed!";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			this.name = "The name is not typed!";
		}
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		if (capital >= 0) {
			this.capital = capital;
		} else {
			System.out.println("The capital must be zerro or more!");
		}
	}
	
	
}
