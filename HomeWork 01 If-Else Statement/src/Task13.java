import java.util.Scanner;

public class Task13 {
	// Задача 13:
	// Да се състави програма, която да отгатне колко е студено/топло по
	// въведената температура t в градус Целзий.
	// Температурните интервали са:
	// под -20 ледено студено;
	// между 0 и -20 - студено;
	// между 15 и 0 - хладно;
	// между 25 и 15 - топло;
	// над 25 – горещо.
	// Входни данни: цяло число от интервала [-100..100].
	// Пример: 12
	// Изход: хладно
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the temperature?(Integer between -100 and 100)");
		int temp = sc.nextInt();
		if (temp < -20) {
			System.out.println("Very cold!");
		} else if(temp >= -20 && temp < 0) {
			System.out.println("Quite cold!");
		} else if(temp >= 0 && temp < 15) {
			System.out.println("It's cold!");
		} else if(temp >= 15 && temp < 25) {
			System.out.println("It's hot!");
		} else {
			System.out.println("Very hot!");
		}
		sc.close();
	}

}
