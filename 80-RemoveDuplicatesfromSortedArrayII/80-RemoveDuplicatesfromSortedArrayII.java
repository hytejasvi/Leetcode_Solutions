// Last updated: 11/24/2025, 10:15:28 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) {
            return nums.length;
        }
        int left = 0, right = 0;
        
        while(right < nums.length) {
            int count=1;
            while(right+1 < nums.length && nums[right] == nums[right+1]) {
                count++;
                right++;
            }
            int swaps = Math.min(count, 2);
            while(swaps > 0) {
                nums[left] = nums[right];
                left++;
                swaps--;
            }
            right++;
        }
        return left;
    }
}