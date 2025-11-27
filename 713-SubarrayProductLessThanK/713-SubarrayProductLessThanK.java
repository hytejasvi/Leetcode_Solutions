// Last updated: 11/27/2025, 9:49:34 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if(k == 0) {
4            return 0;
5        }
6        int prod = 1, left = 0;
7        int count = 0;
8        for(int right = 0; right < nums.length;right++) {
9            prod = prod*nums[right];
10            while(left <= right && prod >= k) {
11                prod = prod/nums[left];
12                left++;
13            }
14            count = count + (right - left+1);
15        }
16        return count;
17    }
18}