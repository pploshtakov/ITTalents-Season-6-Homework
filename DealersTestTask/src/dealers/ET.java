package dealers;

import interfaces.IShopsET;
import providers.SmallProvider;

public class ET extends Dealer {
	
	private SmallProvider[] providers; // <= 5
	private IShopsET shopingCenter;
	private int freePlacesForProviders;
	
	public ET(String adress, String name, double capital) {
		super(adress, name, capital);
		this.providers = new SmallProvider[5];
		this.freePlacesForProviders = 5;
	}

	public IShopsET getShopingCenter() {
		return shopingCenter;
	}

	public void setShopingCenter(IShopsET shopingCenter) {
		if (shopingCenter != null) {
			this.shopingCenter = shopingCenter;
		} else {
			System.out.println("You don't entered shop!");
		}
	}
	
	
}
