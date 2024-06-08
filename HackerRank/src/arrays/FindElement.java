package arrays;

import java.util.Arrays;

public class FindElement {

	public static void main(String[] args) {
		Object[] haystack1 = { "3", "123124234", null, "needle", "world", "hay", 2, "3", true, false };
		Object[] haystack2 = { "283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle",
				"something somebody lost a while ago" };
		Object[] haystack3 = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 5, 4, 3, 4, 5, 6, 67, 5, 5, 3, 3, 4, 2, 34, 234, 23, 4, 27,
				28, 29, "needle", 31, 2, 3, 4, 5, 5, 6, 5, 4, 32, 3, 45, 54 };

		System.out.println(findNeedle(haystack1)); // "found the needle at position 3"
		System.out.println(findNeedleWithD(haystack2)); // "found the needle at position 5"
		System.out.println(findNeedleSimple(haystack3)); // "found the needle at position 30"

	}

	public static String findNeedle(Object[] haystack) {
		return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
	}

	public static String findNeedleWithD(Object[] haystack) {
		return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
	}

	public static String findNeedleSimple(Object[] haystack) {

		int location = 0;

		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i] == "needle") {
				location = i;
			}
		}

		return "found the needle at position " + location;
	}
}
