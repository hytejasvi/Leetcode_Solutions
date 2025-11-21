// Last updated: 11/21/2025, 10:09:30 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int i = 0;
        for(int j=0; j<=nums.length-1; j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                 i++;
            }
        }
        return i;
    }
}