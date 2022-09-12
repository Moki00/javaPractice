package interview;

public class BuySell {

	public static int maxProfit(int[] prices) {

		// 9 8 7 6 5 4 3 2 profit = 0.

//	an array of [5,4,6,5,7,3,4,5,7,6]
		
		int profit = 0;
		int buyPrice = Integer.MIN_VALUE; // if something goes wrong we want this to show up.
		boolean haveBought = false;
		for (int i = 0; i < prices.length; i++) {
			if (i + 1 == prices.length) { // if were at the end, just sell with what we've got. note that we sell back
											// at the price we bought at, not the current price, because we just wouldnt
											// have bought in that scenario, so the profit is the same
				if (haveBought) {
					profit += buyPrice;
				}
				break;
			}

			if (!haveBought) {
				if (prices[i + 1] > prices[i]) { // if the next value is higher, theres profit to be made.
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
