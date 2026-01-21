// Last updated: 1/21/2026, 1:13:36 PM
1class Solution {
2    public int findUnsortedSubarray(int[] nums) {
3        int min = Integer.MAX_VALUE;
4        int max = Integer.MIN_VALUE;
5        boolean isUnsorted = false;
6        int n = nums.length;
7        for(int i=1;i < n;i++) {
8            if(nums[i] < nums[i-1]) {
9                isUnsorted = true;
10            }
11            if(isUnsorted) {
12                min = Math.min(min, nums[i]);
13            }
14        }
15        isUnsorted = false;
16        for(int i = n-2;i>=0;i--) {
17            if(nums[i]> nums[i+1]) {
18                isUnsorted = true;
19            }
20            if(isUnsorted) {
21                max = Math.max(max, nums[i]);
22            }
23        }
24        int left = 0;
25        while(left < n && nums[left] <= min) {
26            left++;
27        }
28        int right = n-1;
29        while(right >= 0 && nums[right] >= max) {
30            right--;
31        }
32        return right > left ? right-left+1: 0;
33    }
34}