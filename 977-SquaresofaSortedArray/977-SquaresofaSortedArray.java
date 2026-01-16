// Last updated: 1/16/2026, 8:37:47 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3
4        int[] res = new int[nums.length];
5        int left = 0, right = nums.length-1;
6        int k = nums.length-1;
7        while(left <= right) {
8            int i = nums[left] * nums[left];
9            int j = nums[right] * nums[right];
10            if(i > j) {
11                res[k] = i;
12                left++;
13            } else {
14                res[k] = j;
15                right--;
16            }
17            k--;
18        }
19        return res;
20    }
21}