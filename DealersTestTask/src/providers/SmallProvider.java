package providers;

public class SmallProvider extends Provider {

	public SmallProvider(String adress, String name) {
		super(adress, name);
	}

	@Override
	protected void setCapital() {
		this.capital = Provider.START_CAPITAL_SMALL_PR;
	}
	
	
}
