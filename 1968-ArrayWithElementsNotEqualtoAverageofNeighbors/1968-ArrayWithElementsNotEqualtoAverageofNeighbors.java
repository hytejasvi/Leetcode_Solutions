// Last updated: 11/11/2025, 9:36:44 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
      if(nums.length < 2) {
            return nums;
        }
        for(int i=1;i < nums.length;i++) {
            if ((i % 2 == 1 && nums[i] < nums[i - 1]) ||
                (i % 2 == 0 && nums[i] > nums[i - 1])) {
                // Swap current element with previous element to fix the pattern
                swap(nums, i, i - 1);
            }
        }
        return nums;
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}