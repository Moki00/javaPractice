package simple;

public class Time {

	public static void main(String[] args) {

		System.out.println(Past(0, 1, 1)); // returns the time since midnight in milliseconds= should equal 61000

	}

	public static int Past(int h, int m, int s) {
		return 1000 * (s + 60 * (m + 60 * h));
//		return s * 1000 + m * 60 * 1000 + h * 24 * 60 * 1000;
	}
}
