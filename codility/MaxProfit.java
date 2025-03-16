public class MaxProfit {
    public int solution(int[] dailyPrices) {

        if (dailyPrices == null || dailyPrices.length < 2) {
            return 0;
        }
        int consecDays = dailyPrices.length;

        int maxProfit = 0;
        int buyPrice = dailyPrices[0];

        for(int i=1; i<consecDays; i++){

            int sellPrice = dailyPrices[i];

            if(dailyPrices[i]<buyPrice){
                buyPrice=dailyPrices[i];
            } else {
                maxProfit = Math.max(maxProfit,sellPrice-buyPrice);
            }
        }

        return maxProfit;
    }
}