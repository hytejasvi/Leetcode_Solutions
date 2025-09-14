// Last updated: 9/14/2025, 3:21:26 PM
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        while(left < right) {
            int currentMax = Math.min(height[left], height[right]) * (right - left);
            maxWater = Math.max(maxWater, currentMax);
            if(height[left] < height[right]) {
                left++;
            } else {
                right --;
            }
        }
        return maxWater;
    }
}