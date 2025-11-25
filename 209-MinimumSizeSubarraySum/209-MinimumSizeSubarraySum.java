// Last updated: 11/25/2025, 11:15:19 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int right = 0;
        for(int i=0;i < nums.length;i++) {
            sum = sum+nums[i];
            while(sum >= target) {
                minLength = Math.min(minLength, i-left+1);
                sum = sum-nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0: minLength;
    }
}