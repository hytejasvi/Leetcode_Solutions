// Last updated: 10/6/2025, 9:47:52 AM
class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length ==1) {
            return;
        }
        //approach 1: simply move all non zero elements to the front and keep incrementing the left pointer.
        //then iterate with left till array size and put 0 
        /*int left = 0;
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
        }*/
        int left = 0, right =0;
        while(right < nums.length) {
            if(nums[right] != 0) {
                int temp = nums[right];
                nums[right] = 0;
                nums[left] = temp;
                left++;
            }
            right++;
        }
    }
}