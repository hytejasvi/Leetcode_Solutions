// Last updated: 11/8/2025, 12:34:33 PM
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int left = 0, right=0;
        List<int[]> mergedArray = new ArrayList<>();
        while(left < nums1.length && right < nums2.length) {
            if(nums1[left][0] == nums2[right][0]) {
                mergedArray.add(new int[] {nums1[left][0], nums1[left][1] + nums2[right][1]});
                left++;
                right++;
            } else if(nums1[left][0] < nums2[right][0]) {
                mergedArray.add(new int[] {nums1[left][0], nums1[left][1]});
                left++;
            } else {
                mergedArray.add(new int[] {nums2[right][0], nums2[right][1]});
                right++;
            }
        }
        while(left < nums1.length) {
            mergedArray.add(new int[] {nums1[left][0], nums1[left][1]});
            left++;
        }
        while(right < nums2.length) {
            mergedArray.add(new int[] {nums2[right][0], nums2[right][1]});
            right++;
        }
        int[][] res = new int[mergedArray.size()][2];
        for(int i=0;i< mergedArray.size();i++) {
            for(int j=0;j < 2;j++) {
                res[i][j] = mergedArray.get(i)[j];
            }
        }
        return res;
    }
}