class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyingPrice = prices[0];
        int currentProfit = 0;
        //int left = 1, right = prices.length-1;
        for(int left=1;left < prices.length;left++) {
            currentProfit = prices[left] - buyingPrice;
            if(prices[left] < buyingPrice) {
                buyingPrice = prices[left];
            }
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        return maxProfit;
    }
}