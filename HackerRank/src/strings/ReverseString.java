package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseWordOrderHalf("Swapping elements is more efficient for integers."));
		System.out.println(reverseWordOrder("Negative for loops are cool!"));
		System.out.println(reverseWordOrderByCollection("Collections are great for strings."));
		System.out.println(reverseWordOrderByBuilder("Builder has many options like trim."));
		System.out.println(reverseWordsBuilder("Trim is needed here."));
		System.out.println(reverseEachWord("The if statements removes the need for trim."));
	}
	
	public static String reverseWordOrderHalf(String str) {
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length/2; i++) {
			String temp = arr[i];
			arr[i]= arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			
			sb.append(arr[i]);
			if(i!=arr.length-1) {
				sb.append(" ");
			}
		}
				
		return sb.toString();
	}

	public static String reverseWordOrder(String str) {
		String[] arr = str.split(" ");
		String newString = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			newString += arr[i];
			if (i > 0)
				newString += " ";
		}
		return newString;
	}

	public static String reverseWordOrderByCollection(String str) {
		List<String> arr = Arrays.asList(str.split(" "));
		Collections.reverse(arr);
		return String.join(" ", arr);
	}

	public static String reverseWordOrderByBuilder(String str) {

		StringBuilder builder = new StringBuilder();

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			builder.append(arr[arr.length - 1 - i]);
			builder.append(" ");
		}

		return builder.toString().trim();
	}
	
	public static String reverseWordsBuilder(String str) {

		StringBuilder builder = new StringBuilder();

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			builder.append(arr[arr.length - 1 - i]);
			builder.append(" ");
		}
		builder.reverse();

		return builder.toString().trim();
	}
	
	public static String reverseEachWord(String s) {
		
		if(s==null || s.isEmpty()) {
			return s;
		}

		StringBuilder builder = new StringBuilder();
		String[] arr = s.split(" ");

		for (int i = 0; i < arr.length; i++) {
			String rev = new StringBuilder(arr[i]).reverse().toString();
			builder.append(rev);
			if(i!=arr.length-1) {
				builder.append(" ");
			}
		}
//		builder.reverse();

		return builder.toString();
	}
}
