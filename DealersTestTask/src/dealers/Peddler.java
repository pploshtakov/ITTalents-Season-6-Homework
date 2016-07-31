package dealers;

import java.util.ArrayList;

import providers.SmallProvider;
import stock.Stock;

public class Peddler extends Dealer {
	
	private SmallProvider provider;
	private ArrayList<Stock> stocks;
	
	public Peddler(String adress, String name, double capital) {
		super(adress, name, capital);
	}
	
	
}
