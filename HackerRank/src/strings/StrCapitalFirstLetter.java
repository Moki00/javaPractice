package strings;

import java.util.ArrayList;

public class StrCapitalFirstLetter {

	public static void main(String[] args) {

		System.out.println(toUpperCaseOnEachWord("this Is aN exAmPle"));
		System.out.println(toUpperCaseOnEachWord("1 more exAmPle"));
		System.out.println(toUpperCaseOnEachWord(""));
		System.out.println(toUpperCaseOnEachWord(null));
	}

	public static String toUpperCaseOnEachWord(String p) {

		if(p==null||p.isEmpty()){
			return null;
		} else {

			String[] words = p.split(" ");
			ArrayList<String> list = new ArrayList<String>();

			for(int i=0; i<words.length; i++){
				String w = words[i].toLowerCase(); // start up with everything lowercase
				w = w.substring(0,1).toUpperCase()+w.substring(1); // Make uppercase only the first letter
				list.add(w); // add the word to list
			}

			String r=String.join(" ", list); // join all words together in the list and separate by space

			return r;
		}
	}
}