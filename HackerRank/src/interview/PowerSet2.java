package interview;

// Java program to generate power set
public class PowerSet2 {

	// Driver code
	public static void main(String[] args) {
		String str = "abcd";
		int index = 0;
		String current = "";
		powerSet(str, index, current);
	}

	// str : Stores input string
	// index : Index in current subset, current
	// current : Stores current subset
	static void powerSet(String str, int index, String current)

	{
		int n = str.length();

		// base case
		if (index == n) {
			System.out.println(current);
			return;
		}

		// Two cases for every character
		// (i) We consider the character
		// as part of current subset
		// (ii) We do not consider current
		// character as part of current
		// subset
		powerSet(str, index + 1, current + str.charAt(index));
		powerSet(str, index + 1, current);
	}
}