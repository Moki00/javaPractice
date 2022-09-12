package arrays;

class ArraySum2 {

	public static void main(String[] args) {
		System.out.println(sum(new int[] { 1, 2, 3, 4, 5 }));
	}

	static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				continue;
			}
			sum = sum + arr[i];
		}
		return sum;
	}
}

/*
 * declare a variable to hold the sum, Give that variable an initial value. for
 * loop to pass through every single element in the array The first statement in
 * the for loop sets an initial value to its variable count, int count = 0.
 * which is the code that makes the counter pass through the array by increments
 * of one (step by step). take the initial value of sum and add all of the
 * values found inside the array to it. Finally the return statement will simply
 * print out the new values of sum given by the for loop.
 */
