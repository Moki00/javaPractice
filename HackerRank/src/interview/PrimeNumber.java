package interview;

public class PrimeNumber {

	static int num1 = 101;
	static int num2 = 23;

	public static void main(String[] args) {
		System.out.println(isPrime(num1));
		System.out.println(isPrime(num2));

		System.out.println("10%4 is: " + 10 % 4);
		System.out.println("3%2 is: " + 3 % 2);

	}

	private static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			System.out.println(num + "%" + i + " is " + num % i);
			if (num % i == 0) {
				return false;
			} // end if
		} // end for loop
		return true;
	}
}
