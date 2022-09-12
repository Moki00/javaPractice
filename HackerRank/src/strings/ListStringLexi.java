package strings;

import java.util.*;

public class ListStringLexi {

	public static void main(String[] args) {
		//given
		String s = "welcometojava"; //a-zA-Z strings
		int k = 3;  // 1~1000
		
		// my code below
		int start = 0;

//		String smallest = "";
//        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

//        return smallest + "\n" + largest;
		
		List<String> list = new ArrayList<String>(); 

		int length = s.length()-k+1; // how many substrings

		for (int i = 0; i < length; i++) {
			list.add(s.substring(start,start+k));
			start++;
		}

		System.out.println(String.join(" ", list));
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.set(0,s));
		int last = list.size()-1;
		System.out.println(list.set(last,s));
	}
}
