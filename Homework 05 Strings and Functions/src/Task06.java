import java.util.Scanner;

public class Task06 {
	// Задача 6:
	// Да се състави програма, чрез която се въвежда изречение с отделни
	// думи.
	// Като резултат на екрана да се извежда същия текст, но всяка отделна
	// дума да започва с главна буква, а следващите я букви да са малки.
	// Пример: супер яката задача
	// Изход: Супер Яката Задача

	public static void main(String[] args) {
		//enter a text
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence!");
		String text = sc.nextLine();
		//upper case each first letter
		String newText = toUpperCaseEachFirstLetter(text);
		//print input text
		System.out.println("Input text: " + text);
		System.out.println("New text: " + newText);
		//print new text
		sc.close();
	}

//	private static String toUpperCaseEachFirstLetter(String text) {
//		String[] textTemp = text.split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+");
//		for (int i = 0; i < textTemp.length; i++) {
//			char[] chArr = textTemp[i].toCharArray();
//			textTemp[i] = upperFirstLetter(chArr);
//		}
//		return new String (textTemp.toString());
//	}

//	private static String upperFirstLetter(char[] chArr) {
//		for (int i = 0; i < chArr.length; i++) {
//			if(i == 0) {
//				chArr[i] = Character.toUpperCase(chArr[i]);
//			} else {
//				chArr[i] = Character.toLowerCase(chArr[i]);
//			}
//		}
//		return new String (chArr.toString());
//	}
	private static String toUpperCaseEachFirstLetter(String text) {
		String[] textTemp = text.split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+");
		for (int i = 0; i < textTemp.length; i++) {	
			textTemp[i] = upperFirstLetter(textTemp[i]);
		}
		return new String (textTemp.toString());
	}
	private static String upperFirstLetter(String str) {
		String[] temp = str.split("");
		for (int i = 0; i < temp.length; i++) {
			if (i == 0) {
				temp[i] = temp[i].toUpperCase();
			} else {
				temp[i] = temp[i].toLowerCase();
			}
		}
		return new String(temp.toString());
	}

}
