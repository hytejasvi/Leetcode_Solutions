class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxWater = Integer.MIN_VALUE;
        while(left < right) {
            final int minHeight = Math.min(height[left], height[right]);
            final int length = right - left;
            maxWater = Math.max(maxWater, (minHeight*length));
            if(height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}