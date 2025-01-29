class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0, right=0;
        int maxOnes=0;
        while (right < nums.length) {
            if(nums[right] == 0) {
                left = right+1;
            }
            maxOnes = Math.max(maxOnes, right-left+1);
            right++;
        }
        return maxOnes;
    }
}