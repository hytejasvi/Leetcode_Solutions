class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0, right=0;
        int minLen = nums.length+1;
        int ws = 0;
        while (right < nums.length) {
            ws += nums[right];

            while (ws > target) {
                 minLen = Math.min(minLen, right-left+1);
                ws -= nums[left];
                left++;
            }
            if (ws == target) {
                minLen = Math.min(minLen, right-left+1);
            }
            right++;
        }
        return minLen > nums.length ? 0:minLen;
    }
}