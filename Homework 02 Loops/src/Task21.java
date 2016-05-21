import java.util.Scanner;

public class Task21 {
	// Задача 21:
	// Дадено е наредено тесте карти.
	// Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама,
	// Поп, Асо.
	// Наредбата по цвят на картите е: спатия, каро, купа, пика.
	// Да се създаде програма, чрез която се въвежда N - число от
	// интервала [1..51] и се извеждат въведения номер карта и
	// останалите по-големи карти от тестето.
	// Пример: 47.
	// Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо
	// пика

	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);
		// input number 1 to 51
		int card = 1;
		do {
			System.out.println("Please enter a number between 1 and 51!");
			card = sc.nextInt();
		} while (card < 1 || card > 51);
		// color's char
		char c = '\u2663'; // club
		char d = '\u2666'; // diamond
		char h = '\u2665'; // hearts
		char s = '\u2660'; // spade
		// print all card after introduced
		switch (card) {
		case 1:
			System.out.print("2" + c + ",");
		case 2:
			System.out.print("2" + d + ",");
		case 3:
			System.out.print("2" + h + ",");
		case 4:
			System.out.print("2" + s + ",");
		case 5:
			System.out.print("3" + c + ",");
		case 6:
			System.out.print("3" + d + ",");
		case 7:
			System.out.print("3" + h + ",");
		case 8:
			System.out.print("3" + s + ",");
		case 9:
			System.out.print("4" + c + ",");
		case 10:
			System.out.print("4" + d + ",");
		case 11:
			System.out.print("4" + h + ",");
		case 12:
			System.out.print("4" + s + ",");
		case 13:
			System.out.print("5" + c + ",");
		case 14:
			System.out.print("5" + d + ",");
		case 15:
			System.out.print("5" + h + ",");
		case 16:
			System.out.print("5" + s + ",");
		case 17:
			System.out.print("6" + c + ",");
		case 18:
			System.out.print("6" + d + ",");
		case 19:
			System.out.print("6" + h + ",");
		case 20:
			System.out.print("6" + s + ",");
		case 21:
			System.out.print("7" + c + ",");
		case 22:
			System.out.print("7" + d + ",");
		case 23:
			System.out.print("7" + h + ",");
		case 24:
			System.out.print("7" + s + ",");
		case 25:
			System.out.print("8" + c + ",");
		case 26:
			System.out.print("8" + d + ",");
		case 27:
			System.out.print("8" + h + ",");
		case 28:
			System.out.print("8" + s + ",");
		case 29:
			System.out.print("9" + c + ",");
		case 30:
			System.out.print("9" + d + ",");
		case 31:
			System.out.print("9" + h + ",");
		case 32:
			System.out.print("9" + s + ",");
		case 33:
			System.out.print("10" + c + ",");
		case 34:
			System.out.print("10" + d + ",");
		case 35:
			System.out.print("10" + h + ",");
		case 36:
			System.out.print("10" + s + ",");
		case 37:
			System.out.print("J" + c + ",");
		case 38:
			System.out.print("J" + d + ",");
		case 39:
			System.out.print("J" + h + ",");
		case 40:
			System.out.print("J" + s + ",");
		case 41:
			System.out.print("Q" + c + ",");
		case 42:
			System.out.print("Q" + d + ",");
		case 43:
			System.out.print("Q" + h + ",");
		case 44:
			System.out.print("Q" + s + ",");
		case 45:
			System.out.print("K" + c + ",");
		case 46:
			System.out.print("K" + d + ",");
		case 47:
			System.out.print("K" + h + ",");
		case 48:
			System.out.print("K" + s + ",");
		case 49:
			System.out.print("A" + c + ",");
		case 50:
			System.out.print("A" + d + ",");
		case 51:
			System.out.print("A" + h + ",");
		default:
			System.out.print("A" + s);
		}

		sc.close();

	}

}
