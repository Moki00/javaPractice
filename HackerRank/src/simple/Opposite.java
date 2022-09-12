package simple;

public class Opposite {

	public static void main(String[] args) {
		System.out.println(makeNegative(-5)); // should be -1

	}

	public static int makeNegative(int number) {

		if (number < 0) {
			return number;
		} else {
			return 0 - number;
		}
	}
}