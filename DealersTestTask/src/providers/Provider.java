package providers;

import java.util.ArrayList;

import shopingCenters.ShopingCenter;
import stock.Stock;

public abstract class Provider {
	protected double capital;
	public static final double START_CAPITAL_SMALL_PR = 2000;
	public static final double START_CAPITAL_BIG_PR = 10000;
	public static final int DISCAUNT_BIG_PR = 15;
	private ArrayList<Stock> stocks;
	private ArrayList<ShopingCenter> shopsWhoService;
	private String adress;
	private String name;
	protected int discaunt;
	
	public Provider(String adress, String name) {
		this.setAdress(adress);
		this.setName(name);
		this.setCapital();
		this.setDiscaunt();
	}

	public double getCapital() {
		return capital;
	}

	protected void setCapital() {
		this.capital = 0;
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

	public int getDiscaunt() {
		return discaunt;
	}

	protected void setDiscaunt() {
		this.discaunt = 0;
	}
	
	
}
