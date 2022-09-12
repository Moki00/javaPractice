package interview;

public class DijkstraAlgorithm {

	public static int algorithm(int[] prices) {

		/*
		 * #2: Write an algorithm that takes in an array of non-negative integers. The
		 * algorithm starts at the first element, and the numbers are the amount the
		 * cursor can jump forward. The algorithm�s purpose is to determine if it is
		 * possible to reach the end. IE: The array [3,2,1,0,4] would return false. The
		 * array [2,0,1,1,4] would return true.
		 * 
		 * Bonus: Alter the algorithm to return an integer value for the least possible
		 * number of jumps. If it is not possible to reach the end, return -1.
		 */
		
		int profit = 0;
		int buyPrice = Integer.MIN_VALUE; // if something goes wrong we want this to show up.
		boolean haveBought = false;
		for (int i = 0; i < prices.length; i++) {
			if (i + 1 == prices.length) { // if were at the end, just sell with what we've got. note that we sell back
											// at the price we bought at, not the current price, because we just would not
											// have bought in that scenario, so the profit is the same
				if (haveBought) {
					profit += buyPrice;
				}
				break;
			}

			if (!haveBought) {
				if (prices[i + 1] > prices[i]) { // if the next value is higher, there is profit to be made.
					buyPrice = prices[i];
					haveBought = true;
				}
			} else {
				if (prices[i + 1] < prices[i]) { // sell right before the price drops
					profit += (prices[i] - buyPrice);
					haveBought = false;
				}
			}
		}
		return profit;
	}
}
