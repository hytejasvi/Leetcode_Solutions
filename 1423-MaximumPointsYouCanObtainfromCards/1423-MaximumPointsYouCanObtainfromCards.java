// Last updated: 10/6/2025, 10:07:38 PM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        if(n==1) {
            return cardPoints[0];
        }
        int totalSum = 0;
        for(int i=0;i< n;i++) {
            totalSum += cardPoints[i];
        }
        if(k == n) {
            return totalSum;
        }
        int left = 0, windowSum =0, maxScore = 0;
        for(int i=0;i< n;i++) {
            windowSum += cardPoints[i];
            if((n-k) == (i-left+1)/*window size*/) {
                maxScore = Math.max(maxScore, totalSum - windowSum);
                windowSum = windowSum - cardPoints[left];
                left++;
            }
        }
        return maxScore;
    }
}