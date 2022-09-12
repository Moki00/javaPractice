package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class ArraySum {

	public static void main(String[] args) {

		System.out.println(find_average(new int[] { 2, 2, 3, 3 })); // = 2.5

		System.out.println(Arrays.toString(monkeyCount(5)));

		System.out.println(sum(new double[] {}));

		System.out.println(sum(new double[] { 1, 2, 3 }));

	}

	public static double sum(double[] numbers) {
		return Arrays.stream(numbers).sum();
	}

	public static double sum2(double[] numbers) {
		if (numbers.length == 0) {
			return 0.0;
		}

		double total = 0;

		for (double d : numbers) {
			total += d;
		}

		return total;
	}

//	SumArrayTest {
//	    assertEquals(0,      SumArray.sum(new double[] { }),                1e-4);
//	    assertEquals(-2.398, SumArray.sum(new double[] {-2.398}),           1e-4);
//	    assertEquals(6,      SumArray.sum(new double[] {1, 2, 3}),          1e-4);
//	    assertEquals(6.6,    SumArray.sum(new double[] {1.1, 2.2, 3.3}),    1e-4);
//	    assertEquals(9.2,    SumArray.sum(new double[] {1, 5.2, 4, 0, -1}), 1e-4);
//	    assertEquals(320,    SumArray.sum(new double[] {30, 89, 100, 101}), 1e-4);
//	  }

	public static int[] monkeyCount(final int n) {
		return IntStream.rangeClosed(1, n).toArray();
	}

	public static int[] monkeyCountForLoop(final int n) {

		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}

		return array;
	}

	public static double find_average(int[] array) {
		return Arrays.stream(array).average().orElse(0);
	}

	public static double find_averageWithForLoop(int[] array) {

		int[] emptyArray = new int[0];

		if (Arrays.equals(array, emptyArray)) {
			return 0;
		}

		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;

	}

	static int simpleArraySum(List<Integer> ar) {
		int sum = 0;
		for (int i = 0; i < ar.size(); i++) {
			sum = sum + ar.get(i);
		}
		return sum;
	}

}