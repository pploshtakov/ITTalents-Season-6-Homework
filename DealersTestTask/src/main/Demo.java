package main;

import java.util.Random;

import dealers.Dealer;
import dealers.ET;
import dealers.Peddler;
import dealers.Retailer;
import interfaces.IShopsET;
import providers.Provider;
import randoms.MyRandoms;
import shopingCenters.ShopingCenter;

public class Demo {
	
	public static void main(String[] args) {
		Random r = new Random();
//		Да се реализира демо, което:
		//		1. Създава 10 доставчика на произволен принцип – на дребно и на едро.
		Provider[] providers = new Provider[10];
		for (int i = 0; i < providers.length; i++) {
			providers[i] = MyRandoms.randomProvider();
		}
		//		2. Създава 20 търговски обекта на произволен принцип – сергии, магазини и
		//		будки.
		ShopingCenter[] shops = new ShopingCenter[20];
		for (int i = 0; i < shops.length; i++) {
			shops[i] = MyRandoms.randomShop();
		}
		//		3. Създава един амбулантен търговец с капитал 100 лева, един ЕТ с капитал 
		//		500 лева и една търговска верига с капитал 3000 лева.
		Peddler pesho = new Peddler(MyRandoms.randomAdress(), MyRandoms.randomPersonName(), 100);
		ET ivan = new ET(MyRandoms.randomAdress(), MyRandoms.randomPersonName(), 500);
		Retailer billa = new Retailer(MyRandoms.randomAdress(), MyRandoms.randomPersonName(), 3000);
		//		4. Подава на търговците съответни търговски обекти на произволен
		//		принцип.
		for (int i = 0; i < shops.length; i++) {
			if (shops[i] instanceof IShopsET && ivan.getShopingCenter() == null) {
				ivan.setShopingCenter((IShopsET)(shops[i]));
			} else {
				
			}
		}
		//		5. Да се извика метод, който приема списък от създадените търговци и за
		//		всеки търговец се започва търговска дейност. Търговската дейност
		//		представлява:
		//		◦ поръчка на стоки от доставчик за всеки търговски обект. Да се извежда
		//		на екрана списъка със стоки, сортиран по цена в нарастващ ред.
		//		◦ прибиране на оборот от всеки търговски обект – да се извежда на
		//		екрана общата сума на печалбата. След продажба списъкът с
		//		останалите стоки в магазина трябва отново да е сортиран по цена.
		//		◦ плащане на месечен данък към държавата за всеки търговски обект.
		//		6. Да се изпише текущия паричен баланс на всеки обект след упражняването
		//		на търговска дейност.
		//		7. Да се изведе търговецът с най-голям брой продадени стоки за месеца.
		//		8. Да се изведе търговецът с най-голям размер на изплатения данък към
		//		държавата
	}
	
}
