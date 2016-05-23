import java.util.Scanner;

public class BullsNCows {

	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);
		// how to play
		System.out.println("How  to play.");
		System.out.println("Всички цифри от намисленото число са различни.");
		System.out.println("Числото не може да започва с нула.");
		System.out.println("Ако във Вашето число има съвпадения на правилните места, те са бикове.");
		System.out.println("Ако във Вашето число има съвпадения, но разместени, те са крави.");
		System.out.println("След всяко предположение изписва колко бика и колко крави имате.");
		System.out.println("Първо изберете трудност (колко цифрено да е числото, което трябва да познаете).");
		// choice difficulty
		int diff;
		do {
			System.out.println("Please choice of difficulty!(3,4,5 or 6 digit number)");
			diff = sc.nextInt();
		} while (diff < 3 || diff > 6);
		// random number
		int a;
		int b;
		int c;
		int d = -1;
		int e = -1;
		int f = -1;
		a = 1 + (int) (Math.random() * 9);
		do {
			b = 0 + (int) (Math.random() * 9);
		} while (a == b);
		do {
			c = 0 + (int) (Math.random() * 9);
		} while (a == c || b == c);
		if (diff > 3) {
			if (diff == 4) {
				do {
					d = 0 + (int) (Math.random() * 9);
				} while (a == d || b == d || c == d);
			} else if (diff == 5) {
				do {
					d = 0 + (int) (Math.random() * 9);
				} while (a == d || b == d || c == d);
				do {
					e = 0 + (int) (Math.random() * 9);
				} while (a == e || b == e || c == e || d == e);
			} else {
				do {
					d = 0 + (int) (Math.random() * 9);
				} while (a == d || b == d || c == d);
				do {
					e = 0 + (int) (Math.random() * 9);
				} while (a == e || b == e || c == e || d == e);
				do {
					f = 0 + (int) (Math.random() * 9);
				} while (a == f || b == f || c == f || d == f || e == f);
			}
		}
		// insert your supposition
		boolean greet = false;
		// difficulty by 3 digits
		// last 5 guesses
		int guess0 = 0;
		int guess1 = 0;
		int guess2 = 0;
		int guess3 = 0;
		int guess4 = 0;
		int countGuesses = 0;
		if (diff == 3) {
			// print positions
			System.out.println("Positions of digits are:");
			System.out.println("a b c");
			System.out.println("1 2 3");
			while (!greet) {
				System.out.println("Please enter value for position 'a'!");
				int a1 = sc.nextInt();
				while (a1 < 1 || a1 > 9) {
					System.out.println("'a' must be digit between 1 to 9!Please enter again!");
					a1 = sc.nextInt();
				}
				System.out.println("Please enter value for position 'b'!");
				int b1 = sc.nextInt();
				while (b1 < 0 || b1 > 9 || b1 == a1) {
					if (b1 == a1) {
						System.out.println("Digits must be different! Please enter again!");
						b1 = sc.nextInt();
					} else {
						System.out.println("'b' must be digit between 0 to 9!Please enter again!");
						b1 = sc.nextInt();
					}
				}
				System.out.println("Please enter value for position 'c'!");
				int c1 = sc.nextInt();
				while (c1 < 0 || c1 > 9 || c1 == a1 || c1 == b1) {
					if (c1 == a1 || c1 == b1) {
						System.out.println("Digits must be different! Please enter again!");
						c1 = sc.nextInt();
					} else {
						System.out.println("'c' must be digit between 0 to 9!Please enter again!");
						c1 = sc.nextInt();
					}
				}
				// chech for bulls and cows
				int bulls = 0;
				int cows = 0;
				if (a1 == a) {
					bulls++;
				}
				if (a1 == b || a1 == c) {
					cows++;
				}
				if (b1 == b) {
					bulls++;
				}
				if (b1 == a || b1 == c) {
					cows++;
				}
				if (c1 == c) {
					bulls++;
				}
				if (c1 == a || c1 == b) {
					cows++;
				}
				// save guesses
				if (countGuesses == 0) {
					guess0 = a1 * 100 + b1 * 10 + c1;
					countGuesses++;
				} else if (countGuesses == 1) {
					guess1 = a1 * 100 + b1 * 10 + c1;
					countGuesses++;
				} else if (countGuesses == 2) {
					guess2 = a1 * 100 + b1 * 10 + c1;
					countGuesses++;
				} else if (countGuesses == 3) {
					guess3 = a1 * 100 + b1 * 10 + c1;
					countGuesses++;
				} else {
					guess4 = a1 * 100 + b1 * 10 + c1;
					countGuesses = 0;
				}
				// print last 5 guesses
				System.out.println(
						"Last 5 guesses: " + guess0 + "," + guess1 + "," + guess2 + "," + guess3 + "," + guess4);
				// print how many bulls and cows you have
				System.out.println(a1 + "" + b1 + "" + c1 + ": " + bulls + " bulls," + cows + " cows");
				// if you guesses the number
				if (a1 == a && b1 == b && c1 == c) {
					greet = true;
					System.out.println("Greeting you guessed number!");
				}
			}
			// difficulty by 4 digits
		} else if (diff == 4) {
			System.out.println("Positions of digits are:");
			System.out.println("a b c d");
			System.out.println("1 2 3 4");
			while (!greet) {
				System.out.println("Please enter value for position 'a'!");
				int a1 = sc.nextInt();
				while (a1 < 1 || a1 > 9) {
					System.out.println("'a' must be digit between 1 to 9!Please enter again!");
					a1 = sc.nextInt();
				}
				System.out.println("Please enter value for position 'b'!");
				int b1 = sc.nextInt();
				while (b1 < 0 || b1 > 9 || b1 == a1) {
					if (b1 == a1) {
						System.out.println("Digits must be different! Please enter again!");
						b1 = sc.nextInt();
					} else {
						System.out.println("'b' must be digit between 0 to 9!Please enter again!");
						b1 = sc.nextInt();
					}
				}
				System.out.println("Please enter value for position 'c'!");
				int c1 = sc.nextInt();
				while (c1 < 0 || c1 > 9 || c1 == a1 || c1 == b1) {
					if (c1 == a1 || c1 == b1) {
						System.out.println("Digits must be different! Please enter again!");
						c1 = sc.nextInt();
					} else {
						System.out.println("'c' must be digit between 0 to 9!Please enter again!");
						c1 = sc.nextInt();
					}
				}
				System.out.println("Please enter value for position 'd'!");
				int d1 = sc.nextInt();
				while (d1 < 0 || d1 > 9 || d1 == a1 || d1 == b1 || d1 == c1) {
					if (d1 == a1 || d1 == b1 || d1 == c1) {
						System.out.println("Digits must be different! Please enter again!");
						d1 = sc.nextInt();
					} else {
						System.out.println("'d' must be digit between 0 to 9!Please enter again!");
						d1 = sc.nextInt();
					}
				}
				// chech for bulls and cows
				int bulls = 0;
				int cows = 0;
				if (a1 == a) {
					bulls++;
				}
				if (a1 == b || a1 == c || a1 == d) {
					cows++;
				}
				if (b1 == b) {
					bulls++;
				}
				if (b1 == a || b1 == c || b1 == d) {
					cows++;
				}
				if (c1 == c) {
					bulls++;
				}
				if (c1 == a || c1 == b || c1 == d) {
					cows++;
				}
				if (d1 == d) {
					bulls++;
				}
				if (d1 == a || d1 == b || d1 == c) {
					cows++;
				}
				// save guesses
				if (countGuesses == 0) {
					guess0 = a1 * 1000 + b1 * 100 + c1 * 10 + d1;
					countGuesses++;
				} else if (countGuesses == 1) {
					guess1 = a1 * 1000 + b1 * 100 + c1 * 10 + d1;
					countGuesses++;
				} else if (countGuesses == 2) {
					guess2 = a1 * 1000 + b1 * 100 + c1 * 10 + d1;
					countGuesses++;
				} else if (countGuesses == 3) {
					guess3 = a1 * 1000 + b1 * 100 + c1 * 10 + d1;
					countGuesses++;
				} else {
					guess4 = a1 * 1000 + b1 * 100 + c1 * 10 + d1;
					countGuesses = 0;
				}
				// print last 5 guesses
				System.out.println(
						"Last 5 guesses: " + guess0 + "," + guess1 + "," + guess2 + "," + guess3 + "," + guess4);
				// print how many bulls and cows you have
				System.out.println(a1 + "" + b1 + "" + c1 + "" + d1 + ": " + bulls + " bulls," + cows + " cows");
				// if you guesses the number
				if (a1 == a && b1 == b && c1 == c && d1 == d) {
					greet = true;
					System.out.println("Greeting you guessed number!");
				}
			}
			// difficulty by 5 digits
		} else if (diff == 5) {
			System.out.println("Positions of digits are:");
			System.out.println("a b c d e");
			System.out.println("1 2 3 4 5");
			while (!greet) {
				System.out.println("Please enter value for position 'a'!");
				int a1 = sc.nextInt();
				while (a1 < 1 || a1 > 9) {
					System.out.println("'a' must be digit between 1 to 9!Please enter again!");
					a1 = sc.nextInt();
				}
				System.out.println("Please enter value for position 'b'!");
				int b1 = sc.nextInt();
				while (b1 < 0 || b1 > 9 || b1 == a1) {
					if (b1 == a1) {
						System.out.println("Digits must be different! Please enter again!");
						b1 = sc.nextInt();
					} else {
						System.out.println("'b' must be digit between 0 to 9!Please enter again!");
						b1 = sc.nextInt();
					}
				}
				System.out.println("Please enter value for position 'c'!");
				int c1 = sc.nextInt();
				while (c1 < 0 || c1 > 9 || c1 == a1 || c1 == b1) {
					if (c1 == a1 || c1 == b1) {
						System.out.println("Digits must be different! Please enter again!");
						c1 = sc.nextInt();
					} else {
						System.out.println("'c' must be digit between 0 to 9!Please enter again!");
						c1 = sc.nextInt();
					}
				}
				System.out.println("Please enter value for position 'd'!");
				int d1 = sc.nextInt();
				while (d1 < 0 || d1 > 9 || d1 == a1 || d1 == b1 || d1 == c1) {
					if (d1 == a1 || d1 == b1 || d1 == c1) {
						System.out.println("Digits must be different! Please enter again!");
						d1 = sc.nextInt();
					} else {
						System.out.println("'d' must be digit between 0 to 9!Please enter again!");
						d1 = sc.nextInt();
					}
				}
				System.out.println("Please enter value for position 'e'!");
				int e1 = sc.nextInt();
				while (e1 < 0 || e1 > 9 || e1 == a1 || e1 == b1 || e1 == c1 || e1 == d1) {
					if (e1 == a1 || e1 == b1 || e1 == c1 || e1 == d1) {
						System.out.println("Digits must be different! Please enter again!");
						e1 = sc.nextInt();
					} else {
						System.out.println("'e' must be digit between 0 to 9!Please enter again!");
						e1 = sc.nextInt();
					}
				}
				// chech for bulls and cows
				int bulls = 0;
				int cows = 0;
				if (a1 == a) {
					bulls++;
				}
				if (a1 == b || a1 == c || a1 == d || a1 == e) {
					cows++;
				}
				if (b1 == b) {
					bulls++;
				}
				if (b1 == a || b1 == c || b1 == d || b1 == e) {
					cows++;
				}
				if (c1 == c) {
					bulls++;
				}
				if (c1 == a || c1 == b || c1 == d || c1 == e) {
					cows++;
				}
				if (d1 == d) {
					bulls++;
				}
				if (d1 == a || d1 == b || d1 == c || d1 == e) {
					cows++;
				}
				if (e1 == e) {
					bulls++;
				}
				if (e1 == a || e1 == b || e1 == c || e1 == d) {
					cows++;
				}
				// save guesses
				if (countGuesses == 0) {
					guess0 = a1 * 10000 + b1 * 1000 + c1 * 100 + d1 * 10 + e1;
					countGuesses++;
				} else if (countGuesses == 1) {
					guess1 = a1 * 10000 + b1 * 1000 + c1 * 100 + d1 * 10 + e1;
					countGuesses++;
				} else if (countGuesses == 2) {
					guess2 = a1 * 10000 + b1 * 1000 + c1 * 100 + d1 * 10 + e1;
					countGuesses++;
				} else if (countGuesses == 3) {
					guess3 = a1 * 10000 + b1 * 1000 + c1 * 100 + d1 * 10 + e1;
					countGuesses++;
				} else {
					guess4 = a1 * 10000 + b1 * 1000 + c1 * 100 + d1 * 10 + e1;
					countGuesses = 0;
				}
				// print last 5 guesses
				System.out.println(
						"Last 5 guesses: " + guess0 + "," + guess1 + "," + guess2 + "," + guess3 + "," + guess4);
				// print how many bulls and cows you have
				System.out.println(
						a1 + "" + b1 + "" + c1 + "" + d1 + "" + e1 + ": " + bulls + " bulls," + cows + " cows");
				// if you guesses the number
				if (a1 == a && b1 == b && c1 == c && d1 == d && e1 == e) {
					greet = true;
					System.out.println("Greeting you guessed number!");
				}
			}
			// difficulty by 6 digits
		} else {
			System.out.println("Positions of digits are:");
			System.out.println("a b c d e f");
			System.out.println("1 2 3 4 5 6");
			while (!greet) {
				System.out.println("Please enter value for position 'a'!");
				int a1 = sc.nextInt();
				while (a1 < 1 || a1 > 9) {
					System.out.println("'a' must be digit between 1 to 9!Please enter again!");
					a1 = sc.nextInt();
				}
				System.out.println("Please enter value for position 'b'!");
				int b1 = sc.nextInt();
				while (b1 < 0 || b1 > 9 || b1 == a1) {
					if (b1 == a1) {
						System.out.println("Digits must be different! Please enter again!");
						b1 = sc.nextInt();
					} else {
						System.out.println("'b' must be digit between 0 to 9!Please enter again!");
						b1 = sc.nextInt();
					}
				}
				System.out.println("Please enter value for position 'c'!");
				int c1 = sc.nextInt();
				while (c1 < 0 || c1 > 9 || c1 == a1 || c1 == b1) {
					if (c1 == a1 || c1 == b1) {
						System.out.println("Digits must be different! Please enter again!");
						c1 = sc.nextInt();
					} else {
						System.out.println("'c' must be digit between 0 to 9!Please enter again!");
						c1 = sc.nextInt();
					}
				}
				System.out.println("Please enter value for position 'd'!");
				int d1 = sc.nextInt();
				while (d1 < 0 || d1 > 9 || d1 == a1 || d1 == b1 || d1 == c1) {
					if (d1 == a1 || d1 == b1 || d1 == c1) {
						System.out.println("Digits must be different! Please enter again!");
						d1 = sc.nextInt();
					} else {
						System.out.println("'d' must be digit between 0 to 9!Please enter again!");
						d1 = sc.nextInt();
					}
				}
				System.out.println("Please enter value for position 'e'!");
				int e1 = sc.nextInt();
				while (e1 < 0 || e1 > 9 || e1 == a1 || e1 == b1 || e1 == c1 || e1 == d1) {
					if (e1 == a1 || e1 == b1 || e1 == c1 || e1 == d1) {
						System.out.println("Digits must be different! Please enter again!");
						e1 = sc.nextInt();
					} else {
						System.out.println("'e' must be digit between 0 to 9!Please enter again!");
						e1 = sc.nextInt();
					}
				}
				System.out.println("Please enter value for position 'f'!");
				int f1 = sc.nextInt();
				while (f1 < 0 || f1 > 9 || f1 == a1 || f1 == b1 || f1 == c1 || f1 == d1 || f1 == e1) {
					if (f1 == a1 || f1 == b1 || f1 == c1 || f1 == d1 || f1 == e1) {
						System.out.println("Digits must be different! Please enter again!");
						f1 = sc.nextInt();
					} else {
						System.out.println("'f' must be digit between 0 to 9!Please enter again!");
						f1 = sc.nextInt();
					}
				}
				// chech for bulls and cows
				int bulls = 0;
				int cows = 0;
				if (a1 == a) {
					bulls++;
				}
				if (a1 == b || a1 == c || a1 == d || a1 == e || a1 == f) {
					cows++;
				}
				if (b1 == b) {
					bulls++;
				}
				if (b1 == a || b1 == c || b1 == d || b1 == e || b1 == f) {
					cows++;
				}
				if (c1 == c) {
					bulls++;
				}
				if (c1 == a || c1 == b || c1 == d || c1 == e || c1 == f) {
					cows++;
				}
				if (d1 == d) {
					bulls++;
				}
				if (d1 == a || d1 == b || d1 == c || d1 == e || d1 == f) {
					cows++;
				}
				if (e1 == e) {
					bulls++;
				}
				if (e1 == a || e1 == b || e1 == c || e1 == d || e1 == f) {
					cows++;
				}
				if (f1 == f) {
					bulls++;
				}
				if (f1 == a || f1 == b || f1 == c || f1 == d || f1 == e) {
					cows++;
				}
				// save guesses
				if (countGuesses == 0) {
					guess0 = a1 * 100000 + b1 * 10000 + c1 * 1000 + d1 * 100 + e1 * 10 + f1;
					countGuesses++;
				} else if (countGuesses == 1) {
					guess1 = a1 * 100000 + b1 * 10000 + c1 * 1000 + d1 * 100 + e1 * 10 + f1;
					countGuesses++;
				} else if (countGuesses == 2) {
					guess2 = a1 * 100000 + b1 * 10000 + c1 * 1000 + d1 * 100 + e1 * 10 + f1;
					countGuesses++;
				} else if (countGuesses == 3) {
					guess3 = a1 * 100000 + b1 * 10000 + c1 * 1000 + d1 * 100 + e1 * 10 + f1;
					countGuesses++;
				} else {
					guess4 = a1 * 100000 + b1 * 10000 + c1 * 1000 + d1 * 100 + e1 * 10 + f1;
					countGuesses = 0;
				}
				// print last 5 guesses
				System.out.println(
						"Last 5 guesses: " + guess0 + "," + guess1 + "," + guess2 + "," + guess3 + "," + guess4);
				// print how many bulls and cows you have
				System.out.println(a1 + "" + b1 + "" + c1 + "" + d1 + "" + e1 + "" + f1 + ": " + bulls + " bulls,"
						+ cows + " cows");
				// if you guesses the number
				if (a1 == a && b1 == b && c1 == c && d1 == d && e1 == e && f1 == f) {
					greet = true;
					System.out.println("Greeting you guessed number!");
				}
			}
		}
	}

}
