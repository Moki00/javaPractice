package challenges;

public class Loop3 {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		int numOfQueries = 1;
		for (int row = 0; row < numOfQueries; row++) {
			int a = 0;
			int b = 2;
			int col = 10;
			int subT = a;
			for (int power = 0; power < col; power++) {
				double segment = Math.pow(2, power)*b;
				subT += segment;
				System.out.printf(subT + " ");
			}
			System.out.println();
		}
	}
}

// Read input from STDIN. Print output to STDOUT. Your class should be named Solution.