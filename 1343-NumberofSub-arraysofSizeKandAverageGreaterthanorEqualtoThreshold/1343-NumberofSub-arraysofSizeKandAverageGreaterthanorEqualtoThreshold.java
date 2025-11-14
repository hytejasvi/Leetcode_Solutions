// Last updated: 11/14/2025, 9:03:34 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        threshold = threshold*k;
        int left = 0, right = 0;
        int count = 0, sum = 0;
        while(right < arr.length) {
            sum = sum+arr[right];
            if((right-left+1) == k) {
                if(sum >= threshold) {
                    count++;
                }
                sum = sum-arr[left];
                left++;
            }
            right++;
        }
        return count;
    }
}