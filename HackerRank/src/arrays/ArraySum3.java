package arrays;

import java.util.Arrays;
import java.util.Collections;

class ArraySum3 {

	public static void main(String[] args) {
		
		int[] x = countPositivesSumNegatives(null);
//		int[] x = countPositivesSumNegatives(new int[] {});
//		int[] x = countPositivesSumNegatives(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15 });
//		the first element is the count of positives numbers and the second element is sum of negative numbers
		// should be { 10, -65 }
		System.out.println(Arrays.toString(x));

		Boolean[] array1 = { true, true, true, false, true, true, true, false, false, true, true };
//		Boolean[] array2 = { true, false, null };
//		Boolean[] array3 = { true, false,  };

		System.out.print(countFalse(array1));
		System.out.print(" <-- false, true --> ");
		System.out.println(countSheeps(array1));

//		System.out.println(countSheeps(array2));
//		System.out.println(countSheeps(array3));
	}
	
	public static int[] countPositivesSumNegatives(int[] input) {

		int[] emptyArray = new int[0];
		if (input == null) {
			return emptyArray;
		}

		int positives = 0;
		int negatives = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				positives++;
			} else if (input[i] < 0) {
				negatives += input[i];
			} else {
				continue;
			}
		}

		int[] output = new int[] { positives, negatives };

		if (input.length > 0) {
			return output;
		} else {
			return emptyArray;
		}
	}

	private static int countFalse(Boolean[] jamo) {
		int sum = 0;
		for (int i = 0; i < jamo.length; i++) {
			if(jamo[i] == false) {
				sum++;
			}
		}
		return sum;
	}

	public static int countSheeps2(Boolean[] arrayOfSheeps) {
		return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
	}

	public static int countSheeps(Boolean[] arrayOfSheeps) {
		int total = 0;
		try {
			for (Boolean bool : arrayOfSheeps) {
				if (bool == true) {
					total++;
				} else {
					continue;
				}
			}
			return total;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}
}

/*
 * declare a variable to hold the sum, Give that variable an initial value. for
 * loop to pass through every single element in the array The first statement in
 * the for loop sets an initial value to its variable count, int count = 0.
 * which is the code that makes the counter pass through the array by increments
 * of one (step by step). take the initial value of sum and add all of the
 * values found inside the array to it. Finally the return statement will simply
 * print out the new values of sum given by the for loop.
 */
