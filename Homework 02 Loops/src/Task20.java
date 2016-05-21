
public class Task20 {
	// Задача 20:
	// Да се състави програма, чрез която се извежда квадрат от
	// цифри. Сумите от елементите на произволен ред или стълб са
	// равни на 45.
	// Пример:
	// 1 2 3 4 5 6 7 8 9 0
	// 2 3 4 5 6 7 8 9 0 1
	// 3 4 5 6 7 8 9 0 1 2
	public static void main(String[] args) {
		// loop for rows
		for (int i = 0; i <= 9; i++) {
			// loop for columns
			int temp = i + 1;
			for (int j = 0; j <= 9; j++) {
				if (temp > 9) {
					temp = 0;
				}
				System.out.print(temp);
				temp += 1;
			}
			System.out.println();
		}

	}

}
