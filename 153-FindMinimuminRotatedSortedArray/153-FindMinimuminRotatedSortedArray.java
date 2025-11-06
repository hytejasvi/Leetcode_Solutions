// Last updated: 11/6/2025, 12:16:55 PM
class Solution {
    public int findMin(int[] nums) {
        if(nums.length ==1) {
            return nums[0];
        }
        int left = 0, right = nums.length -1;
        while(left < right) {
            int mid = left+(right-left)/2;
            if(nums[mid] > nums[right]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}