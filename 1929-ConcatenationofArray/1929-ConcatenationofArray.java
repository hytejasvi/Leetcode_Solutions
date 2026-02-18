// Last updated: 2/18/2026, 10:14:14 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int left = 0;
4        int maxOnes = 0;
5
6        for (int right = 0; right < nums.length; right++) {
7            if (nums[right] == 0) {
8                left = right + 1;
9            } else {
10                maxOnes = Math.max(maxOnes, right - left + 1);
11            }
12        }
13        return maxOnes;
14    }
15}