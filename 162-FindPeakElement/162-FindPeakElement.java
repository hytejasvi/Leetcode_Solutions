// Last updated: 11/1/2025, 7:22:10 PM
class Solution {
    public int findPeakElement(int[] arr) {
        if(arr.length == 1) {
            return 0;
        }
        int left = 0, right = arr.length-1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(mid == arr.length-1) {
                return arr.length-1;
            }
            if(arr[mid] < arr[mid+1]) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left;
    }
}