package interview;

public class Palindrome {

	static String pali1 = "123454321";
	static String pali2 = "1239571";

	public static void main(String[] args) {
		System.out.println(Palin(pali1));
		System.out.println(Palin(pali2));
		System.out.println(PalindromeMath(pali1));
		System.out.println(PalindromeMath(pali2));
	}

	private static boolean Palin(String str) {
		return new StringBuilder().append(str.toUpperCase()).reverse().toString().equals(str.toUpperCase());
	}

	private static boolean PalindromeMath(String str) {
		int length = str.length();
		int smallHalf = length / 2;

		for (int i = 0; i < smallHalf; i++) {
			System.out.println(str.charAt(i) - str.charAt(length - i - 1));
			if ((str.charAt(i) - str.charAt(length - i - 1)) != 0) {
				return false;
			}
		}
		return true;
	}
}
