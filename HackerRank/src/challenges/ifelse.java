package challenges;

public class ifelse {

	public static void main(String[] args) {

		int N = 0;

		if (N % 2 == 1 || (N >= 6 && N <= 20)) {
			System.out.println("Weird");
		} else {
			System.out.println("Not Weird");
		}

		// If is odd, print Weird
		// If N is even and in the inclusive range of 6 to 20, print Weird

		// If N is even and in the inclusive range of 2 to 5, print Not Weird
		// If N is even and greater than , print Not Weird

	}

}
