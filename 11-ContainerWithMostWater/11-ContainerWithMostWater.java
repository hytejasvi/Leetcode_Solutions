// Last updated: 1/16/2026, 9:16:53 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int maxWater = 0;
6        while(left < right) {
7            int currentMax = Math.min(height[left], height[right]) * (right - left);
8            maxWater = Math.max(maxWater, currentMax);
9            if(height[left] < height[right]) {
10                left++;
11            } else {
12                right --;
13            }
14        }
15        return maxWater;
16    }
17}