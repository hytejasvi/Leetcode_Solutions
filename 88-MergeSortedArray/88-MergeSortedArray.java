// Last updated: 9/9/2025, 9:20:20 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) {
            return;
        }
        if(m==0) {
            int i=0;
            for(int x: nums2) {
                nums1[i] = x;
                i++;
            }
        }
        int k = nums1.length -1;
        int left = m-1;
        int right = n-1; //[2,0] [1]
        while(left >= 0 && right >= 0) {
            if(nums1[left] > nums2[right]){
                nums1[k] = nums1[left];
                left--;
            } else {
                nums1[k] = nums2[right];
                right--;
            }
            k--;
        }
        while(right >=0) {
            nums1[k--] = nums2[right--];
        }
    }
}