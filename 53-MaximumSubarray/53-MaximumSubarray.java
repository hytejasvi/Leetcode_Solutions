// Last updated: 10/23/2025, 2:23:17 PM
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length ==1) {
            return nums[0];
        }
        int currentMax = nums[0];
        int maxSum = nums[0];
        for(int i=1;i< nums.length;i++) {
            currentMax = Math.max(nums[i], currentMax+nums[i]);
            maxSum = Math.max(currentMax, maxSum);
        }
        return maxSum;
    }
}