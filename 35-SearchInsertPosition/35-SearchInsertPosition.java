// Last updated: 10/29/2025, 1:08:44 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1] < target) {
            return nums.length;
        }
        int res = 0;
        int left = 0, right = nums.length-1;
        while( left <= right) {
            int mid = (right+left)/2;
            if(nums[mid] >= target) {
                res = mid;
                right = mid-1;
            } else {
                left=mid+1;
            }
        }
        return res;
    }
}