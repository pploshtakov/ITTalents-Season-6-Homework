
public class Task03 {
	// Задача 3: Да се изведат на екрана всички нечетни числа от -10
	// до 10
	public static void main(String[] args) {
		int x = -10;
		while (x < 10) {
			if (x % 2 != 0) {
				System.out.println(x);
				x += 2;
				continue;
			}
			x++;
		}
	}

}
