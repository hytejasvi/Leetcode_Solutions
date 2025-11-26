// Last updated: 11/26/2025, 3:01:50 PM
1class Solution {
2    public int longestSubarray(int[] nums) {
3        int left = 0, maxLength=0;
4        int zeroCount = 0;
5        for(int right = 0;right < nums.length;right++) {
6            if(nums[right] == 0) {
7                zeroCount++;
8            }
9            while(zeroCount > 1) {
10                if(nums[left] == 0) {
11                    zeroCount--;
12                }
13                left++;
14            }
15            maxLength = Math.max(maxLength, right-left+1);
16        }
17        return maxLength > 0 ? maxLength-1 : 0;
18    }
19}