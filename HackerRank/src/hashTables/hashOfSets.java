package hashTables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hashOfSets {

	public static void main(String[] args) {
//		int m = 6;
//		int n = 4;
		
		List<String> magazine = new ArrayList<String>();
		Collections.addAll(magazine, "give", "me", "one", "grand", "today", "night");
		
		List<String> note = new ArrayList<String>();
		Collections.addAll(note, "give", "one", "grand", "today");
		
		System.out.println(magazine.toString());
		System.out.println(note);
		
		checkMagazine(magazine, note);
	}

	public static void checkMagazine(List<String> magazine, List<String> note) {
		// Write your code here

	}

//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int m = Integer.parseInt(firstMultipleInput[0]);
//
//        int n = Integer.parseInt(firstMultipleInput[1]);
//
//        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .collect(toList());
//
//        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .collect(toList());
//
//        Result.checkMagazine(magazine, note);
//
//        bufferedReader.close();
//    }
}
