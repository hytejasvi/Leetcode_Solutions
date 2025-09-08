// Last updated: 9/8/2025, 9:44:20 PM
class Solution {
    public int singleNumber(int[] nums) {
        int num = nums[0];
        for(int i=1;i< nums.length;i++) {
            num = num^nums[i];
        }
        return num;
    }
}