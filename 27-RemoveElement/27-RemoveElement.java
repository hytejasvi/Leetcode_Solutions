// Last updated: 1/18/2026, 12:17:14 PM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        if(nums.length == 0) return 0;
4        int left = 0, right = 0;
5        while(right < nums.length) {
6            if(nums[right] != val) {
7                nums[left++] = nums[right];
8            }
9            right++;
10        }
11        return left;
12    }
13}