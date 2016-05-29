
public class Task18 {
	// Задача 18:
	// Дадени са два едномерни масива с естествени числа.
	// Да се състави програма, която сравнява всички числа с еднакви
	// индекси от двата масива и записва в трети масив, по-голямото от
	// двете числа.
	// Да се изведе съдържанието и на трите масива
	// Пример:
	// 18,19,32,1,3, 4, 5, 6, 7, 8
	// 1, 2, 3,4,5,16,17,18,27,11
	// Изход:
	// 18,19,32 ,4,5,16,17,18,27,11

	public static void main(String[] args) {
		// 2 arrays:
		// arr1 = 18,19,32,1,3, 4, 5, 6, 7, 8
		// arr2 = 1, 2, 3,4,5,16,17,18,27,11
		int[] arr1 = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		// save the bigger in new array
		int[] newArr = new int[arr1.length];
		// equal arr1[i] and arr2[i]
		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i] >= arr2[i]) {
				newArr[i] = arr1[i];
			} else {
				newArr[i] = arr2[i];
			}
		}
		// print arrays
		for (int i = 0; i < arr1.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr1[i] + ",");
			} else if (i == arr1.length - 1) {
				System.out.print(arr1[i] + "]");
			} else {
				System.out.print(arr1[i] + ",");
			}
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			if (i == 0) {
				System.out.print("[" + arr2[i] + ",");
			} else if (i == arr2.length - 1) {
				System.out.print(arr2[i] + "]");
			} else {
				System.out.print(arr2[i] + ",");
			}
		}
		System.out.println();
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
