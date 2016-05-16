import java.util.Scanner;

public class Task10 {
	// Задача 10:
	// Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
	// 3 литра и ги ползвате едновременно.
	// Да се състави програма, която по даден обем извежда как ще прелеете
	// течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
	// кофите. Кофите не могат да се ползват с частично количество вода.
	// Входни данни: естествено число от интервала [10..9999].
	// Пример: 107
	// Изход: 21 пъти по 2 литра,
	// 21 пъти по 3 литра
	// допълнително кофа от 2 литра

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 10 and 9999!");
		int volume = sc.nextInt();
		int buckets = volume / 5;
		if (volume % 5 == 0) {
			System.out.println(buckets + " buckets 2 liters.");
			System.out.println(buckets + " buckets 3 liters.");
		} else if (volume % 5 == 1) {
			System.out.println((buckets - 1) + " buckets 2 liters.");
			System.out.println((buckets - 1) + " buckets 3 liters.");
			System.out.println("Additional 2 buckets 3 liters.");
		} else if (volume % 5 == 2) {
			System.out.println(buckets + " buckets 2 liters.");
			System.out.println(buckets + " buckets 3 liters.");
			System.out.println("Additional 1 bucket 2 liters.");
		} else if (volume % 5 == 3) {
			System.out.println(buckets + " buckets 2 liters.");
			System.out.println(buckets + " buckets 3 liters.");
			System.out.println("Additional 1 buckets 3 liters.");
		} else {
			System.out.println(buckets + " buckets 2 liters.");
			System.out.println(buckets + " buckets 3 liters.");
			System.out.println("Additional 2 buckets 2 liters.");
		}
		sc.close();
	}

}
