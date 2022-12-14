package strings;

import java.util.HashMap;

public class HashmapCharInt {

	public static void main(String[] args) {

		String str = " how is this ";

		// make hashmap
		HashMap<Character, Integer> map = new HashMap<>();

		// make a char array of the input string
		char[] chars = str.toCharArray();

		// go through each char in the char array
		for (int i = 0; i < chars.length; i++) {
			if(map.containsKey(chars[i])){
				map.put(chars[i], map.get(chars[i])+1);
			} else {
				map.put(chars[i], 1);
			}
		}

		// remove whitespaces
		if(map.containsKey(' ')){
			map.remove(' ');
		}

		if(map.isEmpty()) {
			System.out.println("no letters in string");
		} else {
			System.out.println(map);			
		}

	} // end main
}  // end class