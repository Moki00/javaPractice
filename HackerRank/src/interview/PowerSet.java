package interview;

public class PowerSet {

	// Driver code
	public static void main(String[] args) {
		String str = "abcd";
		int index = -1;
		String current = "";
		powerSet(str, index, current);
	}

	// str : Stores input string
	// current : Stores current subset
	// index : Index in current subset, curr
	static void powerSet(String str, int index, String current) {
		int n = str.length();

		// base case
		if (index == n) {
			return;
		}

		// First print current subset
		System.out.println(current);

		// Try appending remaining characters
		// to current subset
		for (int i = index + 1; i < n; i++) {
			current += str.charAt(i);
			powerSet(str, i, current);

// Once all subsets beginning with initial "current" are printed,
// remove last character to consider a different prefix of subsets.
			current = current.substring(0, current.length() - 1);
		}
	}
}