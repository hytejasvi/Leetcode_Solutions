class Solution {
    public void moveZeroes(int[] nums) {
        // keep track of the position of "0"
        int pos = 0; 
        for(int i = 0; i < nums.length; i++) {
            // if the current element is not "0", swap it with the element at position "pos"
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                // increment the position of "0"
                pos++;
            }
        }
    }
}