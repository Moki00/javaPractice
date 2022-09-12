package simple;

public class Summation {

	public static void main(String[] args) {
		System.out.println(summation(8)); // 36
		System.out.println(summation(2)); // 3

		System.out.println(6>>1); // 3
		System.out.println(72>>1); // 36
		System.out.println(64>>1); // 32
		System.out.println(5>>1); // 2
		System.out.println(4>>1); // 2
		System.out.println(3>>1); // 1
		System.out.println(2>>1); // 1
		System.out.println(1>>1); // 0
		

		System.out.println(72>>2); // 18
		System.out.println(64>>2); // 16
		System.out.println(6>>2); // 1
		System.out.println(5>>2); // 1
		System.out.println(4>>2); // 1
		System.out.println(3>>2); // 0
		System.out.println(2>>2); // 0
		System.out.println(1>>2); // 0
		
	}

	public static int summation(int n) {
		return (n * (n+1)) >> 1; // bitwise right shift
	}
	
	public static int summationRecursion(int n) {

		if (n == 1)
			return 1;
		return summation(n - 1) + n;  // recursion
	}

	public static int summation2(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}

/*
 * adds up all the from 1 to the number
 * 
 *       
 */
