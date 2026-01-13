// Last updated: 1/13/2026, 10:39:45 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] res = new int[nums.length * 2];
4        int n = nums.length;
5        res[0] = nums[0];
6        res[n] = nums[0];
7        for(int i=1;i < n;i++) {
8            res[i] = nums[i];
9            res[n+i] = nums[i];
10        }
11        return res;
12    }
13}