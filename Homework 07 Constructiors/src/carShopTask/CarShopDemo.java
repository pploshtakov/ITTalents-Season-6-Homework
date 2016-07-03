package carShopTask;

public class CarShopDemo {

	public static void main(String[] args) {
	//		23. Create CarShop and add cars to it
		Person ivan = new Person();
		CarShop shop = new CarShop(3);
		Car mercedes = new Car("S500", 10000, 320, 6);
		Car mercedes1 = new Car("S500", 20000, 320, 6);
		Car mercedes2 = new Car("S500", 200000, 320, 6);
		Car mercedes3 = new Car("S500", 10000, 320, 6);
		shop.addCar(mercedes2);
		shop.addCar(mercedes1);
		shop.addCar(mercedes);
		shop.addCar(mercedes3);
		System.out.println("------------------------");
	//		24. Test all the methods in class CarDemo. Sell car
	//		to somebody, show information to the console
	//		for all the cars in the shop
		shop.showAllCarsInTheShop();
		System.out.println("--------------------");
		shop.getNextCar().printInfo();
		System.out.println("----------------------");
		shop.sellNextCar(ivan);
		System.out.println("-----------------------");
		shop.sellNextCar(ivan);
		System.out.println("---------------------");
		shop.sellNextCar(ivan);
		
		
	}

}
