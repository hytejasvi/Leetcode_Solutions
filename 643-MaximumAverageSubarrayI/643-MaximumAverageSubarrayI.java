// Last updated: 1/22/2026, 10:22:25 AM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int windowSum = 0;
4        int left = 0;
5        for(int i=0;i < k;i++) {
6            windowSum += nums[i];
7        }
8        int maxSum = windowSum;
9        for(int i=k;i< nums.length;i++) {
10            windowSum = windowSum+ nums[i]-nums[left];
11            left++;
12            maxSum = Math.max(maxSum, windowSum);
13        }
14        return maxSum/(double)k;
15    }
16}