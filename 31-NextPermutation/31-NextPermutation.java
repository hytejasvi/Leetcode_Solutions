// Last updated: 10/24/2025, 10:10:52 PM
class Solution {
    /*
    The intution - steps: --> the elements before pivot would be in dec order
    1. from the end, look for element i which is < i-1 --> this is the pivot
        break as soon as we get teh pivot
        if pivot is -1 after above loop, then reverse the complete array.
    2. from the end, find the element which is greater than the pivot element (next greater element of pivot)
        swap this element with teh pivot
    3. now from pivot+1 till n-1, swap all elements.
    */
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;
        for(int i = n-2;i >=0;i--) {
            if(nums[i] < nums[i+1]) {
                pivot = i;
                break;
            }
        }
        if(pivot == -1) {
            int left = 0, right = n-1;
            while(left < right) {
                swap(nums, left, right);
                left++;
                right--;
            }
            return;
        }

        for(int i= n-1;i> pivot;i--) {
            if(nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }
        int left = pivot+1, right = n-1;
        while(left <right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}