import java.text.DecimalFormat;

public class Task16 {
	// Задача 16:
	// Да се състави програма, чрез която предварително въведени 10
	// реални числа от интервала се обработват по следния начин:
	// 1. Извежда съществуващите числа.
	// 2. Всички елементи със стойност по-малки от -0.231 се заменят със
	// сумата от квадрата на поредния им номер + числото 41.25, а всички
	// останали елементи се заменят с произведението между самия елемент
	// и неговият пореден номер. Поредният номер на първият елемент е 1.
	// 3. Да се изведат елементите от началния и новообразувания масив.
	// Пример: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
	// Изход: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25

	public static void main(String[] args) {
		// array -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
		double[] arr = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 };
		// new array
		double[] newArr = new double[10];
		for (int i = 0; i < newArr.length; i++) {
			// Всички елементи със стойност по-малки от -0.231 се заменят със
			// сумата от квадрата на поредния им номер + числото 41.25
			if (arr[i] < -0.231) {
				newArr[i] = ((i + 1) * (i + 1)) + 41.25;
			}
			// всички останали елементи се заменят с произведението между самия
			// елемент
			// и неговият пореден номер
			else {
				newArr[i] = arr[i] * (i + 1);
			}
		}
		// print arrays
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		System.out.println();
		for (int i = 0; i < newArr.length; i++) {
			if (i == 0) {
				System.out.print("[" + df.format(newArr[i]) + ",");
			} else if (i == newArr.length - 1) {
				System.out.print(df.format(newArr[i]) + "]");
			} else {
				System.out.print(df.format(newArr[i]) + ",");
			}
		}
	}

}
