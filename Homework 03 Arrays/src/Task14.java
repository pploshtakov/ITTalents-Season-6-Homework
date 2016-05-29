
public class Task14 {
	// Задача 14:
	// Имате предварително въведен едномерен масив, съдържащ реални
	// числа.
	// Да се състави програма, чрез която се избират само елементи от
	// масива със стойности от интервала [-2.99..2.99] и се отпечатват в нов
	// масив. Новият масив да се извежда на екрана.
	// Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
	// Изход: 0.2; 0.99; 1.4; 1.2

	public static void main(String[] args) {
		// new array: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
		double[] arr = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 };
		// count numbers between -2.99 and 2.99
		int countNum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 2.99 && arr[i] > -2.99) {
				countNum++;
			}
		}
		// new array by length = count
		double[] newArr = new double[countNum];
		countNum = 0;
		// fill in with numbers between -2.99 and 2.99
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 2.99 && arr[i] > -2.99) {
				newArr[countNum] = arr[i];
				countNum++;
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
		System.out.println();
		System.out.println("New array with numbers between -2.99 and 2.99.");
		for (int i = 0; i < newArr.length; i++) {
			if (i == 0) {
				System.out.print("[" + newArr[i] + ",");
			} else if (i == newArr.length - 1) {
				System.out.print(newArr[i] + "]");
			} else {
				System.out.print(newArr[i] + ",");
			}
		}
	}

}
