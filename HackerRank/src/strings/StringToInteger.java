package strings;

public class StringToInteger {

	public static void main(String[] args) {
		String literalA = "testing";
		String literalB = "testing";
		String objectA = new String("testing");

		// true
		System.out.println(
				literalA == literalB && literalA.equals(literalB) && literalA != objectA && literalA.equals(objectA));

		//		assertEquals("01011110001100111", fakeBinary
		fakeBin("1459");
		//		assertEquals("101000111101101", fakeBinary.
		fakeBin("2345678987");
		//		assertEquals("011011110000101010000011011", fakeBinary.
		fakeBin2("366058562030849490134388085");
	}

	public static void fakeBin(String numberString) {		
		// convert to char array
		char[] ch = numberString.toCharArray();
		System.out.println(ch);

		for (int i = 0; i < ch.length; i++) {
			String str = String.valueOf(ch[i]); // char to string
			int num = Integer.parseInt(str); // string to integer
			// replace replace any digit below 5 with '0' and any digit 5 and above with '1'
			if (num<5) {				
				//				System.out.println(ch[i]);
				ch[i]='0';
			} else {
				ch[i]='1';
			}
		}
		String binary = String.valueOf(ch);
		System.out.println(binary);
	}

	public static void fakeBin2(String numberString) {
		System.out.println(numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1"));
	}
}
