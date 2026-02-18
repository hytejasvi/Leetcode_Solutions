// Last updated: 2/18/2026, 10:13:26 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] res = new int[nums.length];
4        int j = n;
5        for(int i=0;i < n;i++) {
6            res[2*i] = nums[i];
7            res[2*i+1] = nums[j];
8            j++;
9        }
10        return res;
11    }
12}