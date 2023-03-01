package interview;

import java.util.*;

public class CountValleys {

	public static void main(String[] args) {

		int steps = 8;

		String path = "UDDDUDUUUUDDDDDDUUU";

		System.out.println(countingValleys(steps, path));

	}

	/*
	 * Complete the 'countingValleys' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER steps 2. STRING path
	 */

	public static int countingValleys(int steps, String path) {

		int valley = 0;
		int height = 0;

		List<Boolean> inValley = new ArrayList<Boolean>();

		for (int i = 0; i < steps; i++) {

			// find the height
			if (path.charAt(i) == 'U') {
				height++;
			} else {
				height--;
			}

			// in the valley is true
			if (height >= 0) {
				inValley.add(false);
			} else {
				inValley.add(true);
			}

			// if was in the valley and now out, add 1 to valley
			if (i > 0) {

				if (inValley.get(i-1) == true && inValley.get(i) == false) {
					valley++;
				}
			}
		}
		return valley;
	}
}
