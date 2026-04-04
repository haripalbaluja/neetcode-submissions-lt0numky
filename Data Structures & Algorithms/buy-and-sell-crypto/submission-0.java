class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            for(int j = i+1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                if(diff > 0) {
                    maxProfit = Math.max(maxProfit, diff);
                }
            }
        }
        return maxProfit;
    }
}
