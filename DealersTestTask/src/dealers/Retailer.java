package dealers;

import interfaces.IShopsRetailer;
import providers.Provider;

public class Retailer extends Dealer {
	private Provider[] providers; // <= 15
	private IShopsRetailer[] shopingCenters; // <= 10
	
	public Retailer(String adress, String name, double capital) {
		super(adress, name, capital);
		this.providers = new Provider[15];
		this.shopingCenters = new IShopsRetailer[10];
	}
}
