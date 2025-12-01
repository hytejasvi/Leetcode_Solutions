// Last updated: 12/1/2025, 10:37:18 PM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int sum = 0;
4        for (int i = 0; i < nums.length; i++) { 
5            sum += nums[i]; 
6        }
7        int remainder = sum % k; 
8        if (remainder == 0) { 
9            return 0; 
10        }
11        return remainder; 
12    }
13}
14
15