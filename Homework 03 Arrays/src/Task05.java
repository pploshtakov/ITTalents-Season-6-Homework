
public class Task05 {
	// Задача 5:
	// Напишете програма, която създава масив с 10 елемента и
	// инициализира всеки от елементите със стойност, равна на индекса на
	// елемента, умножен по 3.
	// Да се изведат елементите на екрана.

	public static void main(String[] args) {
		// create array with length 10
		int[] arr = new int[10];
		// arr[i] = i * 3
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 3;
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
	}

}
