package sorting;

/**
 * Quick sort uses in-place sorting (doesn't require additional memorty). Quick
 * for sorting medium sized arrays. Worst case of O(n2) is worse than merge
 * sort. Not stable, does not maintain the relative order of elements
 * 
 * @author Moki_21_10
 *
 */
public class QuickSort {

	/**
	 * main args
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 129, 567, 123, 664, 64, 32, 16, 2, 8, 999 };
		quickSort(arr, 0, arr.length - 1);

		System.out.println("using quick sort: ");
		printArray(arr);

	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub

	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {

		}

	}

}
