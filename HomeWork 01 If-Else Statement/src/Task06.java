import java.util.Scanner;

public class Task06 {
	// Задача 6:
	// Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
	// им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
	// а3 да има старата стойност на а1.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value for A1");
		int a1 = sc.nextInt();
		System.out.println("Please enter value for A2");
		int a2 = sc.nextInt();
		System.out.println("Please enter value for A3");
		int a3 = sc.nextInt();
		System.out.println("Input data: A1 = " + a1 + "; A2 = " + a2 + "; A3 = " + a3);
		int temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		System.out.println("Output data: A1 = " + a1 + "; A2 = " + a2 + "; A3 = " + a3);
		sc.close();

	}

}
