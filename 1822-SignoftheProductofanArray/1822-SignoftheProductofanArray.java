// Last updated: 11/9/2025, 10:23:49 AM
class Solution {
    public int arraySign(int[] nums) {
        int negCount = 0, zeros = 0;
        for(int i=0;i< nums.length;i++) {
            if(nums[i] < 0) {
                negCount++;
            } else if(nums[i] == 0) {
                zeros++;
            }
        }
        if(zeros > 0) {
            return 0;
        } else {
            return negCount %2 == 0? 1: -1;
        }
    }
}