/**
 * 
 */
package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Moki_21_10
 *
 */
public class WhileTrue {

	public static void main(String[] args) {
		action();
	}

	private static void action() {
		System.out.println("Enter a number:");
		Scanner sn = new Scanner(System.in);

		boolean inputNotNull = true;
		while (inputNotNull) {
			try {
				int number = sn.nextInt();

				System.out.printf("The number %d is power of 2: %b\n", number, isPowerOfTwo(number));
				System.out.println("Try another number:");
				if (number == 0) {
					inputNotNull = false;
				}
			}
			catch (InputMismatchException e) {
				System.err.println("Wrong input! Input only integer numbers please...");
				sn.nextLine();
				action();
			}
		}
		sn.close();
	}

	private static Object isPowerOfTwo(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}
}
