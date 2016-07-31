package randoms;

import java.util.Random;

import dealers.Dealer;
import dealers.ET;
import providers.BigProvider;
import providers.Provider;
import providers.SmallProvider;
import shopingCenters.Mall;
import shopingCenters.Market;
import shopingCenters.ShopingCenter;
import shopingCenters.Streat;

public class MyRandoms {
	static Random r = new Random();

	public static String randomPersonName() {
		String[] names = { "Pesho", "Gosho", "Ivan", "Ivo", "Simo", "Ilian", "Vasil", "Ivet", "Mariq", "Alex", "Eli",
				"Krisi" };
		return names[r.nextInt(names.length)];
	}

	public static String randomAdress() {
		String[] adresses = { "Vitoshka", "Dondukov", "NDK", "Mladost 1", "Mladost 2", "Mladost 3", "Mladost 4",
				"Strelbishte", "Borovo", "Ivan Vazov" };
		return adresses[r.nextInt(adresses.length)];
	}

	public static Provider randomProvider() {
		if (r.nextBoolean()) {
			return new SmallProvider(randomAdress(), randomPersonName());
		}
		return new BigProvider(randomAdress(), randomPersonName());
	}

	public static ShopingCenter randomShop() {
		int rIndex = r.nextInt(3);
		switch (rIndex) {
		case 0:
			return new Mall();
		case 1:
			return new Market();
		case 2:
			return new Streat();
		default:
			return new Mall();
		}
	}
	
	

}
