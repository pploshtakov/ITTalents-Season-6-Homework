import java.util.Scanner;

public class Task15 {
	// Задача 15:
	// Да се състави програма, която въвежда в едномерен масив реални
	// числа.
	// Като изход: програма извежда онези 3 различни числа, чиято
	// абсолютна стойност формира максималната обща сума.
	// Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
	// Изход: 5.1; 6.34; 7.13

	public static void main(String[] args) {
		// enter a length
		Scanner sc = new Scanner(System.in);
		int length;
		do {
			System.out.println("Please enter a positive value for length!");
			length = sc.nextInt();
		} while (length < 1);
		double[] arr = new double[length];
		// fill in array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter a value for cell " + (i + 1));
			arr[i] = sc.nextDouble();
		}
		// chech who 3 numbers are bigger (absolute value)
		double absoluteValue1 = 0;
		int trueValue1 = 0;
		double absoluteValue2 = 0;
		int trueValue2 = 0;
		double absoluteValue3 = 0;
		int trueValue3 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				if (arr[i] > absoluteValue1) {
					absoluteValue3 = absoluteValue2;
					absoluteValue2 = absoluteValue1;
					absoluteValue1 = arr[i];
					trueValue3 = trueValue2;
					trueValue2 = trueValue1;
					trueValue1 = i;
				} else if (arr[i] > absoluteValue2) {
					absoluteValue3 = absoluteValue2;
					absoluteValue2 = arr[i];
					trueValue3 = trueValue2;
					trueValue2 = i;
				} else if (arr[i] > absoluteValue3) {
					absoluteValue3 = arr[i];
					trueValue3 = i;
				}
			} else {
				if (arr[i] * -1 > absoluteValue1) {
					absoluteValue3 = absoluteValue2;
					absoluteValue2 = absoluteValue1;
					absoluteValue1 = arr[i] * -1;
					trueValue3 = trueValue2;
					trueValue2 = trueValue1;
					trueValue1 = i;
				} else if (arr[i] * -1 > absoluteValue2) {
					absoluteValue3 = absoluteValue2;
					absoluteValue2 = arr[i] * -1;
					trueValue3 = trueValue2;
					trueValue2 = i;
				} else if (arr[i] * -1 > absoluteValue3) {
					absoluteValue3 = arr[i] * -1;
					trueValue3 = i;
				}
			}
		}
		// print array
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr[i] + ",");
			} else if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
		// print numbers
		System.out.println();
		System.out.println(arr[trueValue3] + "," + arr[trueValue2] + "," + arr[trueValue1]);
		sc.close();
	}

}
