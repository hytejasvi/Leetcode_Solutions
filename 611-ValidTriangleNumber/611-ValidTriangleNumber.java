// Last updated: 10/4/2025, 8:47:44 AM
class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        if(n < 3) {
            return 0;
        }
        int res = 0;
        Arrays.sort(nums);
        for(int i = n-1;i > 1;i--) {
            int left = 0;
            int right = i-1;
            while(left < right) {
                if(nums[left] + nums[right] > nums[i]) {
                    res = res + (right-left);
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }
}