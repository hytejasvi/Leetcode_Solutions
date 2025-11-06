// Last updated: 11/6/2025, 1:32:02 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1) {
            return nums[0];
        } else if(nums[0] != nums[1]) {
            return nums[0];
        } else if(nums[n-1] != nums[n-2]) {
            return nums[n-1];
        }
        int left = 1, right = n-2;
        while(left < right) {
            int mid = left+(right-left)/2;
            if((mid%2 ==0 && nums[mid] == nums[mid+1]) || (mid%2 ==1 && nums[mid] == nums[mid-1])) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}