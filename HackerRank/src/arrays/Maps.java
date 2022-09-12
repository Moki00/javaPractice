package arrays;

import java.util.Arrays;

public class Maps {

	public static void main(String[] args) {
		System.out.println(mapFunction(new int[] { 1, 2, 3 })); // (new int[] {2, 4, 6}
		System.out.println(mapFunction(new int[] { 4, 1, 1, 1, 4 })); // (new int[] {8, 2, 2, 2, 8}
		System.out.println(mapFunction(new int[] { 1, 1, 1, 1, 1, 1 })); // (new int[] {2, 2, 2, 2, 2, 2}
	}
	
	public static int[] mapFunction(int[] arr) {
		 return Arrays.stream(arr).map(x -> x*2).toArray();
	}

	public static int[] forLoop(int[] arr) {

		int newArray[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i]*2;
		}
		return newArray;
	}
	

}
