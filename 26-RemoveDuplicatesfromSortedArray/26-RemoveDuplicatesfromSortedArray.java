// Last updated: 9/25/2025, 9:15:10 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) {
            return 1;
        }
        /*int left = 0;
        int right = 1;
        while(right < nums.length) {
            if(nums[left] == nums[right]) {
                right ++;
            } else {
                nums[++left] = nums[right];
                right++;
            }
        }
        return left+1;*/

        int left = 0;
        for(int i=1;i< nums.length;i++) {
            if(nums[left] != nums[i]) {
                nums[++left] = nums[i];
            }
        }
        return left+1;
    }
}