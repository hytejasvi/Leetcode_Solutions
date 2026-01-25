// Last updated: 1/25/2026, 7:24:42 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int expectedSum = n * (n + 1) / 2;
5        int sum = 0;
6        for(int m: nums) {
7            sum = sum+ m;
8        }
9        return expectedSum - sum;
10    }
11}