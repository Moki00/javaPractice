package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {

//	System.out.println(" : "+);

	public static long arrayManipulation(int n, List<List<Integer>> queries) {

		// an array of zeroes
		long[] arr = new long[n];

		// loop each query list
		for (List<Integer> qu : queries) {

			int left = qu.get(0) - 1;
			int right = qu.get(1) - 1;
			int add = qu.get(2);

			// only 1 positive number on far left
			arr[left] += add;

			// only 1 negative number on right if not last element
			if (right < n - 1) {
				arr[right + 1] -= add;
			}
			System.out.println("arr= " + Arrays.toString(arr));
		}
		
		System.out.println("setup done");

		// add up array from left to right to find max
		long max = 0;
		for (int i = 1; i < n; i++) {
			arr[i] += arr[i - 1];
			System.out.println("arr= " + Arrays.toString(arr));
			max = Math.max(arr[i], max);
		}
		return max;
	}

	public static void main(String[] args) {

//		n = the size of the array to be manipulated
		int n = 10;
//		int n2 = 5;

//		List<Integer> q1 = new ArrayList<Integer>(Arrays.asList(1, 2, 100));
//		List<Integer> q2 = new ArrayList<Integer>(Arrays.asList(2, 5, 100));
//		List<Integer> q3 = new ArrayList<Integer>(Arrays.asList(3, 4, 100));
		List<Integer> q1 = new ArrayList<Integer>(Arrays.asList(1, 5, 3));
		List<Integer> q2 = new ArrayList<Integer>(Arrays.asList(4, 8, 7));
		List<Integer> q3 = new ArrayList<Integer>(Arrays.asList(6, 9, 1));

		List<List<Integer>> qu = new ArrayList<>();
		qu.add(q1);
		qu.add(q2);
		qu.add(q3);

		System.out.println(qu);

		System.out.println("max= " + arrayManipulation(n, qu));

	}

	/**
	 * Starting with a 1-indexed array of zeros and a list of operations, for each
	 * operation add a value to each the array element between two given indices,
	 * inclusive. Once all operations have been performed, return the maximum value
	 * in the array.
	 * 
	 * Example int n=10; queries = [[1,5,3][4,8,7][6,9,1]];
	 * 
	 * Queries are interpreted as follows: a b k 1 5 3 4 8 7 6 9 1 Add the values of
	 * k between the indices a and b inclusive:
	 * 
	 * index-> 1 2 3 4 5 6 7 8 9 10 [0,0,0, 0, 0,0,0,0,0, 0] [3,3,3, 3, 3,0,0,0,0,
	 * 0] [3,3,3,10,10,7,7,7,0, 0] [3,3,3,10,10,8,8,8,1, 0] The largest value is 10
	 * after all operations are performed.
	 * 
	 * ---Function Description--- Complete the function arrayManipulation with the
	 * following parameters:
	 * 
	 * int n = the number of elements in the array int queries[q][3] = a two
	 * dimensional array of queries where each queries[i] contains three integers,
	 * a, b, and k.
	 * 
	 * ---Returns--- the maximum int in the array
	 * 
	 * ---Input Format--- The first line contains two space-separated integers n and
	 * m: n = the size of the array m = the number of operations Each of the next m
	 * lines contains three space-separated integers a, b and k a = the left index b
	 * = right index k = summand
	 * 
	 * ---Constraints---
	 * 2<n<10,000,000
	 * 0<m<200,000
	 * 0<a<b<n
	 * 0<=k<1,000,000,000
	 * 
	 * ---Sample Input--- 5 3 1 2 100 2 5 100 3 4 100
	 * 
	 * ---Sample Output--- 200
	 * 
	 * ---Explanation---
	 * 
	 * After the first update the list is 100 100 0 0 0. After the second update
	 * list is 100 200 100 100 100. After the third update list is 100 200 200 200
	 * 100.
	 * 
	 * The maximum value is 200.
	 */

	public static long arrayManipulationTooLong(int n, List<List<Integer>> queries) {

		int left = 0;
		int right = 1;
		int summand = 2;
		int querySize = queries.size();
		int maxValue = 0;

		List<Integer> mL = new ArrayList<>();

		// fill in all zeros in the List
		for (int i = 0; i < n; i++) {
			mL.add(0);
		}

		// j is the outer list
		for (int j = 0; j < querySize; j++) {

			int minIndex = queries.get(j).get(left);
			int maxIndex = queries.get(j).get(right);
			int add = queries.get(j).get(summand);

			// i is the inner list
			for (int i = minIndex - 1; i <= maxIndex - 1; i++) {
				int current = mL.get(i);
				mL.set(i, current + add);
			}
		}

		for (int i = 0; i < mL.size(); i++) {
			if (mL.get(i) > maxValue) {
				maxValue = mL.get(i);
			}
		}
		return maxValue;
	}

	public static long arrayManipLikeCSharp(int n, List<List<Integer>> queries) {

		int querySize = queries.size();
		long[] arr = new long[n];

		for (int i = 0; i < querySize; i++) {

			int left = 0;
			int right = 1;
			int summand = 2;
			int minIndex = queries.get(i).get(left) - 1;
			int maxIndex = queries.get(i).get(right) - 1;
			int add = queries.get(i).get(summand);

			long current = arr[minIndex];
			arr[minIndex] = current + add;
			if (maxIndex + 1 <= querySize) {
				arr[maxIndex + 1] -= add;
			}
		}

		// Storing the value maxSum to get the largest value from sum
		long sum = 0;
		long maxSum = 0;
		for (long i : arr) {
			sum += i;
			if (sum > maxSum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}

}