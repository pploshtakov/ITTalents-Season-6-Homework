
public class Test {

	public static void main(String[] args) {
		char[][] lab = {
				{' ','w','w',' ',' ',' ',' ','w'},
				{' ',' ','w',' ',' ',' ',' ','w'},
				{' ','w',' ',' ',' ',' ',' ','w'},
				{' ','w',' ',' ',' ',' ',' ','w'},
				{' ','w','w','w',' ',' ',' ','w'},
				{' ','w',' ','w',' ',' ',' ','w'},
				{' ','w',' ','w',' ',' ',' ','w'},
				{' ','w',' ','w',' ',' ',' ','w'},
				{' ','w','w','w',' ',' ',' ','w'}
		};
		int x = findExit(lab, 1, 5, 0);
		System.out.println(x);
	}

	private static int findExit(char[][] lab, int i, int j, int steps) {
		if(i < 0 || i == lab.length || j < 0 || j == lab[i].length) {
			return steps;
		}
		if(lab[i][j] == 'w') {
			return -1;
		}
		if (lab[i][j] == ' ') {
			steps++;
		}
		findExit(lab, i + 1, j, steps);
		findExit(lab, i - 1, j, steps);
		findExit(lab, i, j + 1, steps);
		findExit(lab, i, j - 1, steps);
		return steps;
	}

}
