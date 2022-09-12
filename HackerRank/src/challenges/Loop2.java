package challenges;

public class Loop2 {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int numOfQueries = in.nextInt();
		int numOfQueries = 5;
		for (int row = 0; row < numOfQueries; row++) {
//			int a = in.nextInt();
//			int b = in.nextInt();
//			int col = in.nextInt();
			int a = 6;
			int b = 7;
			int col = 8;
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