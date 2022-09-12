package strings;

public class Strings {

	public static void main(String[] args) {
		String literalA = "testing";
		String literalB = "testing";
		String objectA = new String("testing");

// true
		System.out.println(
				literalA == literalB && literalA.equals(literalB) && literalA != objectA && literalA.equals(objectA));

//		assertEquals("01011110001100111", fakeBinary
		System.out.println(fakeBin("45385593107843568"));
//		assertEquals("101000111101101", fakeBinary.
		fakeBin("509321967506747");
//		assertEquals("011011110000101010000011011", fakeBinary.
		fakeBin("3660585628494901438808");
	}

	public static String fakeBin(String numberString) {

		// must make a new string
		StringBuilder sBuilder = new StringBuilder();
//		sBuilder.insert(0, "abcde--fghijklm f f");
//		sBuilder.insert(6, numberString);

		char[] charArr = numberString.toCharArray();
		
		for (char c : charArr) {
			if (c == '4') {
			}
		}
		System.out.println(charArr);
		System.out.println(numberString.length());

		return sBuilder.toString();
	}
}
