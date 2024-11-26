class Solution {
    public void moveZeroes(int[] nums) {
        /*if (nums.length == 1) {
            return ;
        } 
        int left = 0, right=1;
        while (right < nums.length) {
            if (nums[left] == 0 && nums[right] != 0) {
                nums[left] = nums[right];
                nums[right] = 0;
                left++;
                right++;
            } else if (nums[left] == 0 && nums[right] == 0) {
                right++;
            } else if (nums[left] != 0 && nums[right] == 0) {
                left++;
                right++;
            } else if (nums[left] != 0 && nums[right] != 0) {
                left++;
                right++;
            }
        }*/
        int left = 0; // Points to the position where the next non-zero element should be placed

    // Move non-zero elements to the front
    for (int right = 0; right < nums.length; right++) {
        if (nums[right] != 0) {
            nums[left] = nums[right];
            left++;
        }
    }

    // Fill the remaining positions with zeros
    for (int i = left; i < nums.length; i++) {
        nums[i] = 0;
    }
    }
}