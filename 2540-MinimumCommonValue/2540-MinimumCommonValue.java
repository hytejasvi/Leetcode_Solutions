class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int left = 0, right = 0;
        if((nums1[left] > nums2[nums2.length-1]) || (nums2[right] > nums1[nums1.length-1])) {
            return -1;
        }
        while (left < nums1.length && right < nums2.length) {
            if(nums1[left] < nums2[right]) {
                left++;
            } else if (nums1[left] > nums2[right]) {
                right++;
            } else {
                return nums1[left];
            }
        }
        return -1;
    }
}