package simple;

public class MakeNegative {

	public static void main(String[] args) {
		System.out.println(opposite(1)); // should be -1

	}

	public static int opposite(int number) {

		@SuppressWarnings("unused")
		int distanceFromZero = 0;

		if (number > 0) {
			distanceFromZero = 0 - number;
		} else {
			distanceFromZero = 0 - number;
		}

		return 0 - number;
		// your code here
	}
}