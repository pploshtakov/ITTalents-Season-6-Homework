package providers;

public class BigProvider extends Provider {

	public BigProvider(String adress, String name) {
		super(adress, name);
	}


	@Override
	protected void setCapital() {
		this.capital = Provider.START_CAPITAL_BIG_PR;
	}

	@Override
	protected void setDiscaunt() {
		this.discaunt = Provider.DISCAUNT_BIG_PR;
	}
	
	
}
