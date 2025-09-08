// Last updated: 9/8/2025, 11:52:43 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) {
            return 1;
        }
        int left = 0;
        int right = 1;
        while(right < nums.length) {
            if(nums[left] == nums[right]) {
                right ++;
            } else {
                nums[++left] = nums[right];
                right++;
            }
        }
        return left+1;
    }
}