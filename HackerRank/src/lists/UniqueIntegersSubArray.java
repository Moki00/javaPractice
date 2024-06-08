package lists;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueIntegersSubArray {

	/**
	 * find the maximum number of unique integers in a sub-array
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 6;
		int m = 3;
		int maxUniqueNums = 0;

//		int[] arr = { 5, 3, 5, 2, 3, 2 };
//		Deque<Integer> deque = new ArrayDeque<>();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(2);

		// loop until last sub-array
		for (int i = 0; i <= n - m; i++) { // last is 6-3=3, which is 2,3,2

			int uniqueNumsInSubArray = 0;
			int[] arr = new int[m];

			// Hashmap to compare all numbers in the sub-array
			HashMap<Integer, Integer> map = new HashMap<>();

			// run thru the sub-array
			for (int j = i; j < m + i; j++) {

				if (!map.containsKey(list.get(j))) {
					map.put(list.get(j), 1);
					uniqueNumsInSubArray++;
					System.out.println(list.get(j) + " : added");
				}

//				System.out.println(j);

			}
			System.out.println("new sub-array");
//			for (int e : arr) {
//				System.out.println(e);
//			}
		}

		System.out.println(list);

	}

}
