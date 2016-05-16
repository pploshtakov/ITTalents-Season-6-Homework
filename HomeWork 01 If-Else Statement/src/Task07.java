import java.util.Scanner;

public class Task07 {
	// Задача 7:
	// Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
	// пари (число с плаваща запетая), дали съм здрав – булев тип.
	// Съставете програма, която взема решения на базата на тези данни по
	// следния начин:
	// - ако съм болен, няма да излизам
	// - ако имам пари, ще си купя лекарства
	// - ако нямам – ще стоя вкъщи и ще пия чай
	// - ако съм здрав, ще отида на кино с приятели
	// - ако имам по-малко от 10 лв, ще отида на кафе.
	// Полученото решение покажете като съобщение в конзолата.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a time!(Integer: 2; 5; 12..)");
		int time = sc.nextInt();
		System.out.println("Please enter money!");
		double money = sc.nextDouble();
		System.out.println("Am I healthy? (Enter true or false!");
		boolean health = sc.nextBoolean();
		if (health) {
			if (money > 10) {
				System.out.println("I'm going to cinema!");
			} else { 
				System.out.println("I'm going to cafe!");
			}
		} else {
			if (money > 0) {
				System.out.println("I will by medicine and I staying at home!");
			} else {
				System.out.println("I will stay at home and drink tea!");
			}
		}
	}

}
