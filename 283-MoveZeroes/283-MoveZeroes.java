// Last updated: 9/8/2025, 12:30:05 PM
class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length ==1) {
            return;
        }
        int left = 0;
        int right = 0;
        for(int i=0;i< nums.length;i++) {
            if(nums[i] != 0) {
                nums[left] = nums[i];
                left++;
            }
        }
        while(left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }
}