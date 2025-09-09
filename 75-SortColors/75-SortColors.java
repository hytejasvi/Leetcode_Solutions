// Last updated: 9/9/2025, 10:20:01 PM
class Solution {
    public void sortColors(int[] nums) {
        int red=0;
        int white=0;
        int blue=0;
        for(int n: nums) {
            if(n==0) {
                red++;
            } else if(n==1) {
                white++;
            } else{
                blue++;
            }
        }
        for(int i= 0;i<red;i++) {
            nums[i] = 0;
        }
        for(int i= red;i<=(red+white-1);i++) {
            nums[i] = 1;
        }
        for(int i= red+white;i<=(red+white+blue-1);i++) {
            nums[i] = 2;
        }
    }
}