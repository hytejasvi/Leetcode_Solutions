// Last updated: 9/10/2025, 8:44:28 PM
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minCost = prices[0];
        for(int i=1;i< prices.length;i++) {
            if((prices[i] - minCost) > profit) {
                profit = prices[i] - minCost;
            }
            minCost = Math.min(minCost, prices[i]);
        }
        return profit;
    }
}