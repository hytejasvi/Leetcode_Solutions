// Last updated: 1/22/2026, 10:05:58 AM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int minSubArray = Integer.MAX_VALUE;
4        int left = 0, windowSum = 0;
5        for(int i=0;i< nums.length;i++) {
6            windowSum += nums[i];
7            while(windowSum >= target) {
8                minSubArray = Math.min(i-left+1, minSubArray);
9                windowSum -= nums[left];
10                left++;
11            }
12        }
13        return minSubArray == Integer.MAX_VALUE ? 0 : minSubArray;
14    }
15}