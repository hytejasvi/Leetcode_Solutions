// Last updated: 10/13/2025, 1:24:46 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        /*double maxAvg = -Double.MAX_VALUE;
        double windowSum = 0.0;
        for(int i=0;i<k;i++) {
            windowSum = windowSum+nums[i];
        }
        maxAvg = Math.max(maxAvg, windowSum/(double)k);
        int left=0;
        for(int i=k;i< nums.length;i++) {
            windowSum = windowSum + nums[i] - nums[left];
            maxAvg = Math.max(maxAvg, windowSum/(double)k);
            left++;
        }
        return maxAvg; */

        int windowSum = 0;
        for(int i=0;i<k;i++) {
            windowSum = windowSum+nums[i];
        }
        int maxSum = windowSum;
        int left = 0;
        for(int i=k;i< nums.length;i++) {
            windowSum = windowSum+nums[i]-nums[left];
            maxSum = Math.max(maxSum, windowSum);
            left++;
        }
        return maxSum/(double)k;
    }
}