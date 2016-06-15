import java.util.Scanner;

public class Task04 {
	// Задача 4:
	// Да се състави програма, чрез която по въведени трите имена на двама
	// човека разделени със запетая, се извежда чие име има по-голям сбор
	// от ASCII кодовете на съставящите името букви.
	// Пример: Anna Dosewa Asenowa, Iwo Peew Peew
	// Изход: Anna Dosewa Asenowa
	public static void main(String[] args) {
		// enter two names
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three names of two people, divided by comma!");
		String names = sc.nextLine();
		// validate names
		names = validateNames(names, sc);
		// split names
		String[] arrNames = names.split("\\s*,\\s*");
		// sum from ASCII codes
		int sumACodesN1 = sumASCIICodes(arrNames[0]);
		int sumACodesN2 = sumASCIICodes(arrNames[1]);
		// print names
		System.out.println(names);
		// print name with bigger sum
		if (sumACodesN1 > sumACodesN2) {
			System.out.println(arrNames[0] + " has a bigger sum from ASCII codes!");
		} else if (sumACodesN1 < sumACodesN2) {
			System.out.println(arrNames[1] + " has a bigger sum from ASCII codes!");
		} else {
			System.out.println("Both names have a same sum from ASCII codes!");
		}
		sc.close();
	}

	private static int sumASCIICodes(String string) {
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			sum += (int) (string.charAt(i));
		}
		return sum;
	}

	private static String validateNames(String names, Scanner sc) {
		String[] arrNames = names.split("\\s*,\\s*");
		while (arrNames.length != 2) {
			System.out.println("Please enter again! Three names of two people, divided by comma!");
			names = sc.nextLine();
			arrNames = names.split("\\s*,\\s*");
		}
		return names;
	}

}
