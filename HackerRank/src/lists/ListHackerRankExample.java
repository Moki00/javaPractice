package lists;

import java.util.ArrayList;
import java.util.List;

public class ListHackerRankExample {

	public static void main(String[] args) {
		/*
		 * The first line has an integer N
		 * L list contains N spaced integers
		 * integer Q = number of queries
		 * Each query will have an insert line, then delete element
		 */
		int N, Q, i, x, y; // declare all integers

		//		Scanner s = new Scanner(System.in);
		//		N = s.nextInt(); 
		N = 5;

		// L is the list
		List<Integer> L = new ArrayList<>();

		L.add(12);
		L.add(0);
		L.add(1);
		L.add(78);
		L.add(12);

		System.out.println("L = "+L); // L = [12, 0, 1, 78, 12]

		//	Q = s.nextInt(); // number of queries
		Q=2;
		System.out.println("queries = "+Q); // queries = 2

		// for each query
		/*
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
		 */
		x = 5;
		y = 23;
		L.add(x, y);
		L.remove(0);

		for (i = 0; i < L.size(); i++) {
			System.out.print(L.get(i));
			System.out.print(" ");
		}
		//		s.close(); //hackerRank
	}
}
