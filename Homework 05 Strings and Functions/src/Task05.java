import java.util.Scanner;

public class Task05 {
	// Задача 5:
	// Да се състави програма, чрез която се въвеждат 2 редици от знаци
	// (думи).
	// Ако в двете редици участва един и същи знак, да се изведе на екрана
	// първата редица хоризонтално, а втората вертикално, така че да се
	// пресичат в общия си знак.
	// Ако редиците нямат общ знак да се изведе само уведомително
	// съобщение.
	// Пример :
	// м
	// а
	// шапка
	// и
	// н
	// а
	public static void main(String[] args) {
		// enter two texts
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word!");
		String word = sc.nextLine();
		System.out.println("Please enter another word!");
		String word1 = sc.nextLine();
		// check for same symbols and save index
		int indexI = -1;
		int indexJ = -1;
		boolean hitch = false;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word1.length(); j++) {
				if (word.charAt(i) == word1.charAt(j)) {
					indexI = i;
					indexJ = j;
					hitch = true;
					break;
				}
			}
			if (hitch == true) {
				break;
			}
		}
		if (hitch == false) {
			System.out.println("Input words aren't hitch!");
		} else {
			// if find same symbols print first string horizontally
			for (int i = 0; i < word1.length(); i++) {
				if (i == indexJ) {
					System.out.println(word);
				} else {
					for (int g = 0; g < indexI; g++) {
						System.out.print(" ");
					}
					System.out.println(word1.charAt(i));
				}
			}
		}
		sc.close();
	}

}
