// Last updated: 11/8/2025, 1:43:15 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1) {
            return nums;
        }
        int[] res = new int[nums.length];
        int even = 0, odd = nums.length-1;
        for(int i=0;i< nums.length;i++) {
            if(nums[i]%2 ==0) {
                res[even] = nums[i];
                even ++;
            } else {
                res[odd] = nums[i];
                odd--;
            }
        }
        return res;
    }
}