// Last updated: 9/8/2025, 8:30:36 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k > n-1) {
            k = k%n;
        }
        if(n ==1) {
            return;
        }
        reverseArray(nums, 0, n-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, n-1);
    }

    public void reverseArray(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}