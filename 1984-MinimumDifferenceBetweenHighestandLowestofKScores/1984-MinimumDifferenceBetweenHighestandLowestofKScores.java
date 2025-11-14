// Last updated: 11/14/2025, 8:53:37 PM
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1) {
            return 0;
        }
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        int left = 0, right = 0;
        while(right < nums.length) {
            if(right-left+1 == k) {
                res = Math.min(res, (nums[right] - nums[left]));
                left++;
            }
            right++;
        }
        return res;
    }
}