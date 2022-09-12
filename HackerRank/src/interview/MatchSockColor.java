package interview;

import java.util.ArrayList;
import java.util.List;

public class MatchSockColor {

	// int n: the number of socks in the pile
	static int n = 10;

	// int ar[n]: the colors of each sock
//		static List<Integer> arrayOfSocks = { 1, 2, 1, 2, 1, 3, 2, 3, 3, 3 };
	static List<Integer> ar = new ArrayList<Integer>();

	public static void main(String[] args) {
		setupArray(n, ar);
		System.out.println(sockMerchant(n, ar));
	}

	public static int sockMerchant(int n, List<Integer> ar) {

		// second array to sort the colored socks
		List<Integer> colors = new ArrayList<Integer>();

		// Returns int: the number of pairs Input Format
		int pairs = 0;

		for (int i = 0; i < n; i++) {
			if (colors.contains(ar.get(i))) {
				pairs++;
				colors.remove(ar.get(i));
			} else {
				colors.add(ar.get(i));

			}
		}
		return pairs;
	}

	public static void setupArray(int n, List<Integer> ar) {
		ar.add(1);
		ar.add(2);
		ar.add(1);
		ar.add(2);
		ar.add(1);
		ar.add(3);
		ar.add(2);
		ar.add(3);
		ar.add(3);
		ar.add(3);
	}

	public static int sockMerchant2(int n, List<Integer> ar) {

		List<Integer> colors = new ArrayList<Integer>();
		int pairs = 0;

		for (int i = 0; i < n; i++) {
			if (!colors.contains(ar.get(i))) {
				colors.add(ar.get(i));
			} else {
				pairs++;
				colors.remove(ar.get(i));
			}
		}
		return pairs;
	}

	// There is one pair of color 1 and one of color 2.
// There are three odd socks left, one of each color.
// The number of pairs is 2.

//The first line contains an integer numOfSocks, the number of socks represented in arrayOfSocks
//second line contains space-separated integers, , the colors of the socks in the pile.

}
/*
 * There is a large pile of socks that must be paired by color. Given an array
 * of integers representing the color of each sock, determine how many pairs of
 * socks with matching colors there are.
 * 
 * Constraints: numOfSocks is 1 to 100 ar[i] is also 1 to 100
 * 
 * // Sample Input 9, so n = 9... // 10 20 20 10 10 30 50 10 20, so: ar = [10,
 * 20, 20, 10, 10, 30, 50, 10, 20].
 *
 * Sample Output = 3
 */