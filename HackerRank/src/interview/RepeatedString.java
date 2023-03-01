package interview;

public class RepeatedString {

	public static void main(String[] args) {

		String s = "aba";
		int n = 10;

		System.out.println(repeatedString(s, n));

	}

	public static long repeatedString(String s, long n) {

//		s = a string that will be repeated
//		n = number of characters to consider

		long count = 0;
		
		// 'count' how many a's in the repeated string
		for (char c : s.toCharArray())
			if (c == 'a')
				count++;

		// how many of s-String fit in n-numbers
		long factor = (n / s.length());
		System.out.println("factor: "+factor);
		
		// what's the remainder
		long rem = (n % s.length());
		System.out.println("remainder: "+rem);
		
		// new count becomes the num of a's times the num of strings
		count = factor * count;
		
		// go through the string up to the remainder
		for (int i = 0; i < rem; i++)
			if (s.charAt(i) == 'a')
				count++;
		
		// return a long integer of the total amount of a's
		return count;
	}

	
	// all below doesn't work
	
	public static long repeatedString2(String s, int n) {
		long stringWORemaining = 0, remainingAChars = 0;
		int r = n % s.length();

		for (int i = s.length(); i-- > 0;) {
			if (s.charAt(i) == 'a') {
				++stringWORemaining;

				if (i < r)
					++remainingAChars;
			}
		}

		return ((n - r) / s.length() * stringWORemaining) + remainingAChars;
	}

	static long count(String s, long n) {
		long numOfS = n / s.length();
		long rest = n % s.length();

		if (!s.contains("a"))
			return 0;
		return s.length() > n ? aCounter(s, rest) : numOfS * aCounter(s, s.length()) + aCounter(s, rest);
	}

	private static long aCounter(String s, long end) {
		int a = 0;
		for (int i = 0; i < end; i++) {
			if (s.charAt(i) == 'a')
				a++;
		}
		return a;
	}

	public static long repeatedStringWasTooSlow(String s, long n) {
		int numOfAs = 0;
		int count = 0;
		while (count < n) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a') {
					numOfAs++;
				}
				count++;
				if (count == n) {
					break;
				}
			}
		}
		return numOfAs;
	}
}
