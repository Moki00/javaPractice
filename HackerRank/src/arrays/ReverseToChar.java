package arrays;

public class ReverseToChar {

	public static void main(String[] args) {

		System.out.println(digitize(12345));

	}

	private static int[] digitize(long n) {
			
		 int[] arr = new StringBuilder().append(n) //
				.reverse() //
				.chars() //
				.map(Character::getNumericValue) //
				.toArray();
		 
		 for(int i=0; i<5; i++) {
			 System.out.println(arr[i]);
		}
		 
		 return arr;
	}

	public static int[] digitize2(long n) {

		// long into string
		String str = String.valueOf(n);

		// string into char Array
		char[] charArray = str.toCharArray();

		// length of array
		int length = charArray.length;

		// empty arrays of the same length
		char[] reverse = new char[length];
		int[] intArray = new int[length];

		int opp = length - 1;

		// fill in the reverse char array
		for (int k = 0; k < length; k++) {
			reverse[opp] = charArray[k];
			opp--;
		}

		// reversed char to string
		String reversedStr = String.valueOf(reverse);

		// reversed string to int array
		for (int k = 0; k < length; k++) {
			intArray[k] = Integer.valueOf(reversedStr.charAt(k) + "");
		}

		return intArray;
	}
}
