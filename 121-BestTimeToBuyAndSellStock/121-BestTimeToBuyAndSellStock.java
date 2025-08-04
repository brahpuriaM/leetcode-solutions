// Last updated: 04/08/2025, 16:31:17
class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int bestBuy = -1;
        int maxProfit = 0;
        for(int i = 0; i<prices.length; i++) {
            if(bestBuy < 0 || prices[i] < bestBuy) {
                bestBuy = prices[i];
            }
            if(bestBuy >= 0) {
                int p = prices[i] - bestBuy;
                if(p > maxProfit) {
                    maxProfit = p;
                }
            }
        }
        return maxProfit;
    }
}