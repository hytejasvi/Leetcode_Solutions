// Last updated: 11/1/2025, 7:10:07 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr[0] > arr[1]) {
            return 0;
        } else if (arr[arr.length-1] > arr[arr.length-2]) {
            return arr.length-1;
        }
        int start = 1, end = arr.length-2;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] > arr[mid-1]) {
                if (arr[mid] > arr[mid+1]) {
                    ans =  mid;
                    start = mid+1;
                } else {
                    start = mid+1;
                }
            } else if (arr[mid] < arr[mid-1]) {
                end = mid-1;
            }
        }
        return ans;
    }
}