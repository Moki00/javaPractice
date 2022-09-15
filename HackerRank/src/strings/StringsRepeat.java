package strings;

public class StringsRepeat {
	
	public static String repeatStr(final int repeat, final String str) {
		
		if (repeat == 0) {
			return "";
		} else {
			String holder = str;
			for (int i = 1; i < repeat; i++) {
				holder = holder+str;
			}
			return holder;  
		}
    }

	public static void main(String[] args) {
		String str = "io";
		int repeat = 4;
		
// Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
		System.out.println(repeatStr(repeat, str));
		

	}

}
