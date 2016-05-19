
public class Task12 {
	// Задача 12: Да се състави програма, която извежда всички
	// естествени трицифрени числа, които нямат еднакви цифри т.е.
	// 100,101, 606 и т.н. не се извеждат.
	public static void main(String[] args) {
		for (int i = 102; i <= 987; i++) {
			int temp = i;
			int a = temp % 10;
			temp /= 10;
			int b = temp % 10;
			temp /= 10;
			int c = temp;
			if (a != b && a != c && b != c) {
				System.out.println(i);
			}

		}
	}

}
