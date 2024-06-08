package interview;

import java.math.BigInteger;

public class PrimeNumber {

	static int num1 = 2;
	static int num2 = 33;
	static String n1 = "99991";
	static String n2 = "9";

	public static void main(String[] args) {
		System.out.println(isPrime(num1));
//		System.out.println(isPrime(num2));

		System.out.println("10%4 is: " + 10 % 4);
		System.out.println("3%2 is: " + 3 % 2);

		System.out.println("");
		System.out.print(n1 + " is ");
		checkPrime(n1);
		System.out.print(n2 + " is ");
		checkPrime(n2);
//		System.out.println(checkPrime(n2));

	}

	private static void checkPrime(String n) {
//		int num = Integer.valueOf(n);
//		boolean isPrime = false;
		BigInteger bigInt = new BigInteger(n);

//		if (num <= 1) {
//			isPrime = false;
//		} else {
//			for (int i = 2; i < num; i++) {
//				if (num % i == 0) {
//					isPrime = false;
//				} else {
//					isPrime = true;
//				}
//			}
//			isPrime = true;
//		}

		if (bigInt.isProbablePrime(1)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

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
