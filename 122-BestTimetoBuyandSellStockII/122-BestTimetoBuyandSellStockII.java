class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyingPrice = prices[0];
        for (int i=1;i< prices.length;i++) {
            int currentProfit = 0;
            currentProfit = Math.max(currentProfit, prices[i] - buyingPrice);
            if(currentProfit > 0){
                maxProfit += currentProfit;
            }
            buyingPrice = prices[i];
        }
        return maxProfit;
    }
}