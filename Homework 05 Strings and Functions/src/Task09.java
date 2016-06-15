import java.util.Scanner;

public class Task09 {
	// Задача 9:
	// Да се състави програма, чрез която по въведен низ съдържащ букви,
	// цифри, знак минус '-' се извежда сборът на въведените числа като се
	// отчита знакът '-' пред съответното число.
	// Вход: asd-12sdf45-56asdf100
	// Изход:
	// -12
	// 45
	// -56
	// 100
	// Сума = 77
	public static void main(String[] args) {
		// enter text
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете низ от символи.(съдържащ букви,цифри и знак минус)");
		String st = sc.nextLine();
		// get digits
		st = st.replaceAll("[^-?0-9]+", " ");
		st = st.replaceAll("- ", "-");
		st = st.trim();
		String[] numbers = st.split(" ");
		// calculate sum
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += Integer.parseInt(numbers[i]);
		}
		// print sum
		System.out.println(sum);
		sc.close();
	}

}
