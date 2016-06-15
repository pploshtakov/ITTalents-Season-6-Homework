import java.util.Scanner;

public class Task14 {
	/*
	 * Задача 14: Да се състави метод, който приема за стойност число N и връща
	 * стойността на N! (N факториел).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive number.");
		int n = sc.nextInt();
		n = validateNumber(n, sc);
		int nFact = calculateNFact(n);
		System.out.println(n + "! = " + nFact);
		int nFactRecurs = nFactRecurs(n);
		System.out.println(n + "! = " + nFactRecurs);
		sc.close();

	}

	private static int validateNumber(int n, Scanner sc) {
		while (n < 1) {
			System.out.println("Please enter again! Must be a positive number!");
			n = sc.nextInt();
		}
		return n;
	}

	static int calculateNFact(int n) {
		int nFact = 1;
		for (int i = 1; i <= n; i++) {
			nFact *= i;
		}
		return nFact;
	}

	static int nFactRecurs(int n) {
		int nFact;
		if (n == 1) {
			return 1;
		} else {
			nFact = n * (nFactRecurs(n - 1));
			return nFact;
		}
	}

}
