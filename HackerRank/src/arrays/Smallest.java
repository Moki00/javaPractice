package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Smallest {

	public static void main(String[] args) {

		System.out.println(findSmallestInt(new int[] { 78, 56, 232, 12, 11, 43 }));

	}

	public static int findSmallestInt(int[] args) {
		return IntStream.of(args).min().getAsInt();
	}

	public static int findSmallestIntSort(int[] args) {
		Arrays.sort(args);
		return args[0];
	}

	public static int findSmallestInt2(int[] args) {

		int smallest = args[0];

		for (int i = 0; i < args.length; i++) {
			if (args[i] < smallest) {
				smallest = args[i];
			}
		}
		return smallest;
	}

}
