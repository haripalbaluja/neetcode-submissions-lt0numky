class Solution {
    public int maxProfit(int[] prices) {
        //I can do brute force, O(n^2)
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            for(int j = i+1; j < prices.length; j++) {
                if(prices[j] >= prices[i]) {
                    maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
                }
            }
        }
        return maxProfit;
    }
}
