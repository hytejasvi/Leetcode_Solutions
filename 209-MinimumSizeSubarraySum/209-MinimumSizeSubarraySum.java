class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int res = Integer.MAX_VALUE;
        int left = 0, right = 0;
        while(right < nums.length) {
            sum = sum+nums[right];
            while(sum >= target) {
                res = Math.min(res, right-left+1);
                sum = sum-nums[left];
                left++;
            }
            right++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}