// Last updated: 04/08/2025, 16:31:15
class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        for(int i=1; i< prices.length; i++) { 
            if(prices[i] > prices[i-1]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}