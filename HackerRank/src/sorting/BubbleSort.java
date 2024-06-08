package sorting;

/**
 * This should not be used due to loop in a loop
 * 
 * @author Moki_21_10
 *
 */
public class BubbleSort {

	/**
	 * main args
	 */
	public static void main(String[] args) {
		int arr[] = { 129, 567, 123, 664, 64, 32, 16, 2, 8, 999 };
		bubbleSort(arr);

		System.out.println("using bubble sort: ");
		printArray(arr);

	}

	/**
	 * @param arr
	 */
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	/**
	 * @param arr
	 */
	private static void bubbleSort(int[] arr) {
		boolean swapped = true;
		for (int i = 0; i < arr.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			} // end inner loop
			if (swapped == false) {
				break;
			}
		} // end outer loop
	} // end bubbleSort()

}
