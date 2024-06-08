/**
 * 
 */
package strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

	/**
	 * 
	 */
	public static int firstUniqueCharIndexStreams(String s) {
		return s.chars().mapToObj(c -> (char) c).filter(c -> s.indexOf(c) == s.lastIndexOf(c)).findFirst()
				.map(s::indexOf).orElse(-1); // Return -1 if no unique character found
	}

	public static int rewrtting(String s) {
		Map<Character, Integer> charCount = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (charCount.get(c) == 1) {
				return i;
			}
		}
		return -1; // Return -1 if no unique character found
	}

	public static int firstUniqueCharArray(String s) {

		// make a list for all chars
		int[] freq = new int[256];

		// populate list with how many times the characters are used
		for (char c : s.toCharArray()) {
			freq[c]++;
		}

		// find the first unique char in the string
		for (int i = 0; i < s.length(); i++) {

			// does the first char equal 1 as unique, if not next char
			if (freq[s.charAt(i)] == 1) {
				return i;
			}
		}

		return -1; // Return -1 if no unique character found
	}

	public static int firstUniqueCharIndexHashMap(String s) {
		HashMap<K, V>
		return -1; // Return -1 if no unique character found
	}

	public static void main(String[] args) {

		String input = "statistics";
		String input2 = "nothingtotalkabouthere";
		String input3 = "simple";

		System.out.println(firstUniqueCharIndexStreams(input));
		System.out.println(firstUniqueCharIndexHashMap(input2));
		System.out.println(firstUniqueCharIndexHashMap(input3));
		System.out.println();
		System.out.println(firstUniqueCharArray(input));
		System.out.println(firstUniqueCharArray(input2));
		System.out.println(firstUniqueCharArray(input3));

	}

}
