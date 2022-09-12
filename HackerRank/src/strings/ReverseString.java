package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseWordsBuilder("I like flying high"));
//        should print "high flying like I"
	}

	public static String reverseWords(String str) {
		String[] stringArray = str.split(" ");
		String newString = "";
		for (int i = stringArray.length - 1; i >= 0; i--) {
			newString += stringArray[i];
			if (i > 0)
				newString += " ";
		}
		return newString;
	}

	public static String reverseWordsCollection(String str) {
		List<String> Words = Arrays.asList(str.split(" "));
		Collections.reverse(Words);
		return String.join(" ", Words);
	}

	public static String reverseWordsBuilder(String str) {

		StringBuilder builder = new StringBuilder();

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			builder.append(arr[arr.length - 1 - i]);
			builder.append(" ");
		}

		return builder.toString().trim();
	}
}
