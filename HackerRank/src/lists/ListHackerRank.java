package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListHackerRank {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * The first line has an integer N
		 * L list contains N spaced integers
		 * integer Q = number of queries
		 * Each query will have an insert line, then delete element
		 */
		int N, Q, i, x, y; // declare all integers

		Scanner s = new Scanner(System.in);
		N = s.nextInt(); // System.out.println("N = "+N);

		// L is the list
		List<Integer> L = new ArrayList<>();

		// each row in the grid
		for (i = 0; i < N; i++) { // for each n lines
			L.add(s.nextInt());
		}

		// System.out.println("L = "+L); // L = [12, 0, 1, 78, 12]

		Q = s.nextInt(); // number of queries
		// System.out.println("queries = "+Q); // queries = 2

		// for each query
		for (i = 0; i < Q; i++) { // for each query
			String str = s.next();
			if (str.equals("Insert")) {
				//                System.out.println("insert");
				x = s.nextInt();
				y = s.nextInt();
				L.add(x, y);
			} else {
				//                System.out.println("del");
				x = s.nextInt();
				L.remove(x);
			}
			//            System.out.println(L);
		}
		for (i = 0; i < L.size(); i++) {
			System.out.print(L.get(i));
			System.out.print(" ");
		}
		s.close();
	}
}
