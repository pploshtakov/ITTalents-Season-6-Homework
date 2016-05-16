import java.util.Scanner;

public class Task12 {
	// Високосни години са всички години кратни на 4 с изключения
	// столетията, но без столетия кратни на 400, т.е. 1900 не е високосна,
	// но 1600 и 2000 са високосни.
	// Съставете програма, която по дадени ден, месец, година отпечатва
	// следващата дата.
	// Входни данни: три числа за ден, месец, година.
	// Пример: 28, 2, 2000
	// Изход: 1,3,2000
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a day!");
		int day = sc.nextInt();
		System.out.println("Please enter a month!");
		int month = sc.nextInt();
		System.out.println("Please enter an year!");
		int year = sc.nextInt();
		System.out.println("Input date: " + day + "." + month + "." + year);
		// wrong data
		if (day <= 0 || month <= 0 || year <= 0 || month > 12 || day > 31) {
			System.out.println("Wrong data!");
		} else {
			// most repeat cases
			if (day <= 27) {
				System.out.println((day + 1) + "." + month + "." + year);
			} else {
				if (day == 31 && month == 12) {
					// new year
					System.out.println(1 + "." + 1 + "." + (year + 1));
				} else if (day == 31
						&& (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
					// months by 31 days
					System.out.println(1 + "." + (month + 1) + "." + year);
				} else if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
					// months by 30 days
					System.out.println(1 + "." + (month + 1) + "." + year);
					// leap year
				} else if ((month == 2 && year % 4 == 0 && year % 100 != 0)
						|| (month == 2 && year % 4 == 0 && year % 400 == 0)) {
					if (day > 29) {
						System.out.println("Wrong data!");
					} else {
						if (day == 29) {
							System.out.println(1 + "." + (month + 1) + "." + year);
						} else {
							System.out.println((day + 1) + "." + month + "." + year);
						}
					}
					// non leap year
				} else if ((month == 2 && (year % 4 != 0)) || (month == 2 && year % 4 == 0 && year % 400 != 0)) {
					if (day > 28) {
						System.out.println("Wrong data!");
					} else {
						if (day == 28) {
							System.out.println(1 + "." + (month + 1) + "." + year);
						} else {
							System.out.println((day + 1) + "." + month + "." + year);
						}
					}
				}
			}
			sc.close();
		}

	}

}
