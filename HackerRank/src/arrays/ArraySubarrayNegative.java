package arrays;

import java.util.Arrays;

public class ArraySubarrayNegative {

	public static void main(String[] args) {

		// declare integers
		int n, negativeSums, numOfSubArr;
		// declare arrays
		int[] a;

		// n = scan.nextInt(); // hackerRank in Eclipse
		n = 5; //	5 is the number of items in the array
		// for loop for scan.nextInt();
		int arr[] = {1,-2,4,-5,1};
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i]=arr[i];
		}

		negativeSums = 0; // negative sums start at zero
		numOfSubArr = n*(n+1)/2; // number of subArrays
		System.out.println(numOfSubArr+" subArrays");
//		System.out.println("arr: "+ Arrays.toString(arr));

		// for loop thru each subArray like 0, 01, 012, 1, 12, 2
		// i is the first num in the subArray
		for (int i = 0; i < n; i++) {
			// j is the 2nd num in the subArray
			for (int j = i+1; j < n+1; j++) {
				// Arrays.copyOfRange(arr, beg, end+1) a subArray
				// Arrays.copyOfRange(arr, 0, 5) full example
				int[] subArray = Arrays.copyOfRange(arr, i, j);
				int subArraySum = 0;
				// add all items in each subArray
				for (int k = 0; k < subArray.length; k++) {
					subArraySum+=subArray[k];
				}
				// find if sum is negative
				if (subArraySum < 0) {
					// add +1 for each subArray that is negative
					negativeSums++;
				}
				 System.out.println("subArray: "+ Arrays.toString(subArray));
				 System.out.println("i: "+ i);
				 System.out.println("j: "+ j);
				 System.out.println("subArraySum: "+ subArraySum);
			}
		}

		// find the numOfNegSums		
		System.out.println("negativeSums: "+negativeSums);
	}
}
