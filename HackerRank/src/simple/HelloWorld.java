package simple;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println(abbrevName("Sam Harris")); // return S.H

//		System.out.println(greet("Moki"));
//		System.out.println(greet2());

	}

	public static String abbrevName(String name) {
		String[] names = name.split(" ");
		return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
	}

	public static String abbrevNameWithChar(String name) {

		char charArray[] = name.toCharArray();
		char initials[] = new char[3];
		int lastInitial = 0;

		for (int i = 0; i < charArray.length; i++) {

			boolean isSpace = Character.isWhitespace(charArray[i]);
			if (isSpace == true) {
				lastInitial = i + 1;
			}

			initials[0] = charArray[0];
			initials[1] = '.';
			initials[2] = charArray[lastInitial];
		}

		String result = String.valueOf(initials).toUpperCase();
		return result;
	}

	public static String greet(String name) {
		return "Hello, " + name + " how are you doing today?";
	}

	public static String greet2() {
		return "hello world!";
	}

}
